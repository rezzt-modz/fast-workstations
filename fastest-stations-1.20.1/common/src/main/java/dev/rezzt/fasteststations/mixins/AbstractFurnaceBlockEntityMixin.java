package dev.rezzt.fasteststations.mixins;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractFurnaceBlockEntity.class)
public class AbstractFurnaceBlockEntityMixin {

    @Inject(
            method = "serverTick",
            at = @At("HEAD")
    )
    private static void fasteststations$oneTickCookTime(
            Level level,
            BlockPos pos,
            BlockState state,
            AbstractFurnaceBlockEntity blockEntity,
            CallbackInfo ci
    ) {
        // Force every smelting operation to complete in a single tick.
        // litTime/litDuration are untouched, so fuel lasts the same amount of ticks.
        ((AbstractFurnaceBlockEntityAccessor) blockEntity).fasteststations$setCookingTotalTime(1);
    }
}
