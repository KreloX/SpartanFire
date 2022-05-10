package krelox.swiaf.weapontrait;

import com.github.alexthe666.iceandfire.entity.EntityDeathWorm;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.MeleeCallbackWeaponTrait;

import krelox.swiaf.Swiaf;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class MyrmexWeaponTrait extends MeleeCallbackWeaponTrait
{
	
	public MyrmexWeaponTrait()
	{
		super("myrmex", Swiaf.MODID, TraitQuality.POSITIVE);
	}
	
	@Override
	public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) 
	{
		boolean flag = true;
		if(attacker instanceof PlayerEntity) 
		{
            if(((PlayerEntity)attacker).swingTime > 0.2)
            {
                flag = false;
            }
		}
		
		if(flag)
		{
			if(target.getMobType() != CreatureAttribute.ARTHROPOD) {
				target.hurt(DamageSource.GENERIC, 5F);
				target.invulnerableTime = 0;
	        }
			
			if(target instanceof EntityDeathWorm) 
			{
				target.hurt(DamageSource.GENERIC, 5F);
				target.invulnerableTime = 0;
			}
		}
	}
}
