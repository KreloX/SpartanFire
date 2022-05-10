package krelox.swiaf.weapontrait;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.MeleeCallbackWeaponTrait;

import krelox.swiaf.Swiaf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PoisonedWeaponTrait extends MeleeCallbackWeaponTrait
{
	
	public PoisonedWeaponTrait()
	{
		super("poisoned", Swiaf.MODID, TraitQuality.POSITIVE);
	}
	
	@Override
	public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) 
	{
		target.addEffect(new EffectInstance(Effects.POISON, 200, 2));
	}
}
