package dev.rezzt.fasteststations.mixins;

import net.minecraft.world.level.block.entity.HopperBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(HopperBlockEntity.class)
public class HopperBlockEntityMixin {

    @ModifyVariable(
            method = "setCooldown",
            at = @At("HEAD"),
            argsOnly = true
    )
    private int fasteststations$oneTickCooldown(int cooldown) {
        return Math.min(cooldown, 1);
    }
}
