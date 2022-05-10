package krelox.swiaf.weapontrait;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.MeleeCallbackWeaponTrait;

import krelox.swiaf.Swiaf;

import com.github.alexthe666.iceandfire.entity.EntityIceDragon;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class FlamedWeaponTrait extends MeleeCallbackWeaponTrait
{
	
	public FlamedWeaponTrait()
	{
		super("flamed", Swiaf.MODID, TraitQuality.POSITIVE);
	}
	
	@Override
	public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) 
	{
		if (target instanceof EntityIceDragon) 
		{
            target.hurt(DamageSource.IN_FIRE, 13.5F);
        }
		
		target.setSecondsOnFire(5);
        target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
	}
}
