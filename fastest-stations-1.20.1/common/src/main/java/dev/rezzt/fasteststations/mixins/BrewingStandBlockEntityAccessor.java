package dev.rezzt.fasteststations.mixins;

import net.minecraft.world.level.block.entity.BrewingStandBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BrewingStandBlockEntity.class)
public interface BrewingStandBlockEntityAccessor {
    @Accessor("brewTime")
    void fasteststations$setBrewTime(int value);

    @Accessor("brewTime")
    int fasteststations$getBrewTime();
}
