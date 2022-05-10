package krelox.swiaf.weapontrait;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.MeleeCallbackWeaponTrait;

import krelox.swiaf.Swiaf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class ShockedIIWeaponTrait extends MeleeCallbackWeaponTrait
{
	public ShockedIIWeaponTrait()
	{
		super("shockedii", Swiaf.MODID, TraitQuality.POSITIVE);
	}
	
	@Override
	public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) 
	{
        target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        
        boolean flag = true;
        if(attacker instanceof PlayerEntity)
        {
            if(((PlayerEntity)attacker).swingTime > 0.2)
            {
                flag = false;
            }
        }
        
        if(!attacker.level.isClientSide && flag)
        {
            LightningBoltEntity lightningboltentity = EntityType.LIGHTNING_BOLT.create(target.level);
            lightningboltentity.moveTo(target.position());
            if(!target.level.isClientSide)
            {
                target.level.addFreshEntity(lightningboltentity);
            }
        }
	}
}