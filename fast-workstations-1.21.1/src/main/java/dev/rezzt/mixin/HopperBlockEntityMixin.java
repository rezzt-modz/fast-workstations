package dev.rezzt.mixin;

import net.minecraft.world.level.block.entity.HopperBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HopperBlockEntity.class)
public abstract class HopperBlockEntityMixin {
	@Shadow
	private int cooldownTime;

	@Shadow
	private void setCooldown(int i) {
	}

	@Inject(method = "setCooldown", at = @At("HEAD"), cancellable = true)
	private void fastWorkstations$capCooldown(int i, CallbackInfo ci) {
		if (i > 1) {
			this.cooldownTime = 1;
			ci.cancel();
		}
	}
}
