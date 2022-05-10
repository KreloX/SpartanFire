package krelox.swiaf.weapontrait;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.MeleeCallbackWeaponTrait;

import krelox.swiaf.Swiaf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class FlamedIIWeaponTrait extends MeleeCallbackWeaponTrait
{
	
	public FlamedIIWeaponTrait()
	{
		super("flamedii", Swiaf.MODID, TraitQuality.POSITIVE);
	}
	
	@Override
	public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) 
	{
		target.setSecondsOnFire(15);
        target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
	}
}