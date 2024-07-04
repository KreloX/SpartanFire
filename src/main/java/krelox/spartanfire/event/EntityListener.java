package krelox.spartanfire.event;

import com.github.alexthe666.iceandfire.entity.EntityDeathWorm;
import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import com.github.alexthe666.iceandfire.entity.props.EntityDataProvider;
import com.github.alexthe666.iceandfire.event.ServerEvents;
import krelox.spartanfire.SpartanFire;
import krelox.spartantoolkit.WeaponItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpartanFire.MODID)
public class EntityListener {
    @SubscribeEvent
    public static void applyTraitEffects(LivingAttackEvent event) {
        LivingEntity target = event.getEntity();

        if (!(event.getSource().getEntity() instanceof LivingEntity attacker)) return;
        if (!(attacker.getMainHandItem().getItem() instanceof WeaponItem weapon)) return;

        var level = attacker.level();
        var traits = weapon.getMaterial().getBonusTraits();


        if (traits.contains(SpartanFire.ICE_DRAGON_DAMAGE_BONUS_I.get())) {
            if (target instanceof EntityIceDragon) {
                target.hurt(level.damageSources().lightningBolt(), 9.5F);
            }
        } else if (traits.contains(SpartanFire.ICE_DRAGON_DAMAGE_BONUS_II.get())) {
            if (target instanceof EntityIceDragon) {
                target.hurt(level.damageSources().inFire(), 13.5F);
            }
        }
        if (traits.contains(SpartanFire.FIRE_DRAGON_DAMAGE_BONUS_I.get())) {
            if (target instanceof EntityFireDragon) {
                target.hurt(level.damageSources().lightningBolt(), 9.5F);
            }
        } else if (traits.contains(SpartanFire.FIRE_DRAGON_DAMAGE_BONUS_II.get())) {
            if (target instanceof EntityFireDragon) {
                target.hurt(level.damageSources().drown(), 13.5F);
            }
        }
        if (traits.contains(SpartanFire.FLAMED_I.get())) {
            target.setSecondsOnFire(5);
            target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        } else if (traits.contains(SpartanFire.FLAMED_II.get())) {
            target.setSecondsOnFire(15);
            target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        }
        if (traits.contains(SpartanFire.ICED_I.get())) {
            EntityDataProvider.getCapability(target).ifPresent(data -> data.frozenData.setFrozen(target, 200));

            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2));
            target.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 100, 2));
        } else if (traits.contains(SpartanFire.ICED_II.get())) {
            EntityDataProvider.getCapability(target).ifPresent(data -> data.frozenData.setFrozen(target, 300));

            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 2));
        }
        if (traits.contains(SpartanFire.SHOCKED.get())) {
            target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());

            boolean flag = true;
            if (attacker instanceof Player) {
                if (attacker.attackAnim > 0.2) {
                    flag = false;
                }
            }

            if (!level.isClientSide && flag) {
                var lightning = EntityType.LIGHTNING_BOLT.create(target.level());
                lightning.getTags().add(ServerEvents.BOLT_DONT_DESTROY_LOOT);
                lightning.getTags().add(attacker.getStringUUID());
                lightning.moveTo(target.position());
                if (!target.level().isClientSide) {
                    target.level().addFreshEntity(lightning);
                }
            }
        }
        if (traits.contains(SpartanFire.NON_ARTHROPOD_DAMAGE_BONUS.get())) {
            boolean flag = true;
            if (attacker instanceof Player) {
                if (attacker.attackAnim > 0.2) {
                    flag = false;
                }
            }

            if (flag) {
                if (target.getMobType() != MobType.ARTHROPOD) {
                    target.hurt(level.damageSources().generic(), 5F);
                }

                if (target instanceof EntityDeathWorm) {
                    target.hurt(level.damageSources().generic(), 5F);
                }
            }
        }
        if (traits.contains(SpartanFire.POISONED.get())) {
            target.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 2));
        }
    }
}
