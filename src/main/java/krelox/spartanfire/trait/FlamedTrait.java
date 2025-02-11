package krelox.spartanfire.trait;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import krelox.spartanfire.SpartanFire;
import krelox.spartantoolkit.BetterWeaponTrait;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class FlamedTrait extends BetterWeaponTrait {
    public FlamedTrait() {
        super("flamed", SpartanFire.MODID, TraitQuality.POSITIVE);
        setUniversal(false);
    }

    @Override
    public String getDescription() {
        return "Ignites and knocks back foes";
    }

    @Override
    public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) {
        target.setSecondsOnFire((int) getMagnitude());
        target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
    }
}
