package krelox.spartanfire.trait;

import com.github.alexthe666.iceandfire.entity.EntityDeathWorm;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import krelox.spartanfire.SpartanFire;
import krelox.spartantoolkit.BetterWeaponTrait;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class NonArthropodDamageBonusTrait extends BetterWeaponTrait {
    public NonArthropodDamageBonusTrait() {
        super("non-arthropod_damage_bonus", SpartanFire.MODID, TraitQuality.POSITIVE);
        setUniversal();
    }

    @Override
    public String getDescription() {
        return "+4.0 damage against non-arthropods and Death Worms";
    }

    @Override
    public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) {
        boolean flag = true;
        if (attacker instanceof Player) {
            if (attacker.attackAnim > 0.2) {
                flag = false;
            }
        }

        if (flag) {
            if (target.getMobType() != MobType.ARTHROPOD) {
                target.hurt(attacker.level().damageSources().generic(), 5F);
            }

            if (target instanceof EntityDeathWorm) {
                target.hurt(attacker.level().damageSources().generic(), 5F);
            }
        }
    }
}
