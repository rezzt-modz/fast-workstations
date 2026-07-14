package dev.rezzt.fasteststations.mixins;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BrewingStandBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingStandBlockEntity.class)
public class BrewingStandBlockEntityMixin {

    @Inject(
            method = "serverTick",
            at = @At("HEAD")
    )
    private static void fasteststations$oneTickBrewTime(
            Level level,
            BlockPos pos,
            BlockState state,
            BrewingStandBlockEntity blockEntity,
            CallbackInfo ci
    ) {
        // Brewing stands normally take 400 ticks; force them to finish in 1 tick.
        BrewingStandBlockEntityAccessor accessor = (BrewingStandBlockEntityAccessor) blockEntity;
        if (accessor.fasteststations$getBrewTime() > 0) {
            accessor.fasteststations$setBrewTime(1);
        }
    }
}
