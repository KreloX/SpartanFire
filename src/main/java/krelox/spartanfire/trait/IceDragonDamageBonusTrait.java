package krelox.spartanfire.trait;

import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import krelox.spartanfire.SpartanFire;
import krelox.spartantoolkit.BetterWeaponTrait;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import java.util.Locale;

public class IceDragonDamageBonusTrait extends BetterWeaponTrait {
    public IceDragonDamageBonusTrait() {
        super("ice_dragon_damage_bonus", SpartanFire.MODID, TraitQuality.POSITIVE);
        setUniversal(false);
    }

    @Override
    public String getDescription() {
        return String.format(Locale.US, "+%.1f damage against Ice Dragons", getLevel() * 4F);
    }

    @Override
    public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) {
        if (target instanceof EntityIceDragon) {
            target.hurt(DamageSource.IN_FIRE, 5.5F + getLevel() * 4);
        }
    }
}
