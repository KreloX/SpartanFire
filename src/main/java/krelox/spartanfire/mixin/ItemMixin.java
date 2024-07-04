package krelox.spartanfire.mixin;

import krelox.spartanfire.SpartanFire;
import krelox.spartantoolkit.WeaponItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ItemMixin {
    @Inject(method = "isFoil", at = @At("RETURN"), cancellable = true)
    private void spartanfire_isFoil(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() instanceof WeaponItem weapon) {
            var material = weapon.getMaterial();
            cir.setReturnValue(cir.getReturnValue()
                    || material.equals(SpartanFire.FLAMED_DRAGON_BONE)
                    || material.equals(SpartanFire.ICED_DRAGON_BONE)
                    || material.equals(SpartanFire.LIGHTNING_DRAGON_BONE));
        }
    }
}
