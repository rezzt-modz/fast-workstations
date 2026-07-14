package dev.rezzt.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractFurnaceBlockEntity.class)
public abstract class AbstractFurnaceBlockEntityMixin {
	@Shadow
	int cookingTotalTime;

	@Inject(method = "serverTick", at = @At("HEAD"))
	private static void fastWorkstations$forceOneTickCookTime(
		Level level,
		BlockPos pos,
		BlockState state,
		AbstractFurnaceBlockEntity furnace,
		CallbackInfo ci
	) {
		((AbstractFurnaceBlockEntityMixin) (Object) furnace).cookingTotalTime = 1;
	}
}
