package krelox.swiaf.weapontrait;

import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.props.FrozenProperties;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.MeleeCallbackWeaponTrait;

import krelox.swiaf.Swiaf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;

public class IcedWeaponTrait extends MeleeCallbackWeaponTrait
{
	public IcedWeaponTrait()
	{
		super("iced", Swiaf.MODID, TraitQuality.POSITIVE);
	}
	
	@Override
	public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) 
	{
		if (target instanceof EntityFireDragon) 
		{
            target.hurt(DamageSource.DROWN, 13.5F);
        }

		FrozenProperties.setFrozenFor(target, 200);
        
        target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 100, 2));
        target.addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 100, 2));
	}
}
