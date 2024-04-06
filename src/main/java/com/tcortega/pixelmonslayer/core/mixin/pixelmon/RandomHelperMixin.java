package com.tcortega.pixelmonslayer.core.mixin.pixelmon;

import com.pixelmonmod.pixelmon.RandomHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = RandomHelper.class, remap = false)
public class RandomHelperMixin {
        @Inject(method = "getRandomChance(F)Z", at = @At("HEAD"), cancellable = true)
    private static void getRandomChance(float chance, CallbackInfoReturnable<Boolean> ci) {
        ci.setReturnValue(true);
    }
}
