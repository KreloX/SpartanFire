package krelox.spartanfire.trait;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import krelox.spartanfire.SpartanFire;
import krelox.spartantoolkit.BetterWeaponTrait;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class PoisonedTrait extends BetterWeaponTrait {
    public PoisonedTrait() {
        super("poisoned", SpartanFire.MODID, TraitQuality.POSITIVE);
        setUniversal();
    }

    @Override
    public String getDescription() {
        return "Poisons foes for 10 seconds";
    }

    @Override
    public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) {
        target.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 2));
    }
}
