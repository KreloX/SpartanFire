package krelox.swiaf.weapontrait;

import com.github.alexthe666.iceandfire.entity.props.FrozenProperties;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.MeleeCallbackWeaponTrait;

import krelox.swiaf.Swiaf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class IcedIIWeaponTrait extends MeleeCallbackWeaponTrait
{
	public IcedIIWeaponTrait()
	{
		super("icedii", Swiaf.MODID, TraitQuality.POSITIVE);
	}
	
	@Override
	public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) 
	{
		FrozenProperties.setFrozenFor(target, 200);
        
        target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 300, 2));
	}
}
