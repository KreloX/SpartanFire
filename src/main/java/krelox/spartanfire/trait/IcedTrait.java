package krelox.spartanfire.trait;

import com.github.alexthe666.iceandfire.entity.props.FrozenProperties;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import krelox.spartanfire.SpartanFire;
import krelox.spartantoolkit.BetterWeaponTrait;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import java.util.Locale;

public class IcedTrait extends BetterWeaponTrait {
    public IcedTrait() {
        super("iced", SpartanFire.MODID, TraitQuality.POSITIVE);
        setUniversal(false);
    }

    @Override
    public String getDescription() {
        return String.format(Locale.US, "Freezes foes for %d seconds", (100 + getLevel() * 100) / 20);
    }

    @Override
    public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) {
        FrozenProperties.setFrozenFor(target, 100 + getLevel() * 100);

        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100 + getLevel() * 100, 2));
    }
}
