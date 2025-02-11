package krelox.spartanfire.trait;

import com.github.alexthe666.iceandfire.event.ServerEvents;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import krelox.spartanfire.SpartanFire;
import krelox.spartantoolkit.BetterWeaponTrait;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class ShockedTrait extends BetterWeaponTrait {
    public ShockedTrait() {
        super("shocked", SpartanFire.MODID, TraitQuality.POSITIVE);
        setUniversal(false);
    }

    @Override
    public String getDescription() {
        return "Strikes foes with lightning";
    }

    @Override
    public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) {
        target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());

        boolean flag = true;
        if (attacker instanceof Player) {
            if (attacker.attackAnim > 0.2) {
                flag = false;
            }
        }

        if (!attacker.getLevel().isClientSide && flag) {
            var lightning = EntityType.LIGHTNING_BOLT.create(target.getLevel());
            lightning.getTags().add(ServerEvents.BOLT_DONT_DESTROY_LOOT);
            lightning.getTags().add(attacker.getStringUUID());
            lightning.moveTo(target.position());
            if (!target.getLevel().isClientSide) {
                target.getLevel().addFreshEntity(lightning);
            }
        }
    }
}
