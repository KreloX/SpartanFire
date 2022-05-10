package krelox.swiaf.weapontrait;

import com.github.alexthe666.citadel.server.entity.datatracker.EntityPropertiesHandler;
import com.github.alexthe666.iceandfire.entity.props.FrozenEntityProperties;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.MeleeCallbackWeaponTrait;

import krelox.swiaf.Swiaf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("deprecation")
public class IcedIIWeaponTrait extends MeleeCallbackWeaponTrait
{
	public IcedIIWeaponTrait()
	{
		super("icedii", Swiaf.MODID, TraitQuality.POSITIVE);
	}
	
	@Override
	public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) 
	{
        FrozenEntityProperties frozenProps = EntityPropertiesHandler.INSTANCE.getProperties(target, FrozenEntityProperties.class);
        frozenProps.setFrozenFor(300);
        
        target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 300, 2));
	}
}