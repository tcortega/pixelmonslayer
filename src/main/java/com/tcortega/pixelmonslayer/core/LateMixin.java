package com.tcortega.pixelmonslayer.core;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.stream.Collectors;

import net.minecraftforge.fml.common.Loader;
import zone.rong.mixinbooter.ILateMixinLoader;

public class LateMixin implements ILateMixinLoader {
    public static final List<String> modMixins = ImmutableList.of("pixelmon");

    public List<String> getMixinConfigs() {
        return modMixins.stream().map(mod -> "mixins.pixelmonslayer." + mod + ".json")
                .collect(Collectors.toList());
    }

    public boolean shouldMixinConfigQueue(String mixinConfig) {
        String[] parts = mixinConfig.split("\\.");
        return parts.length != 4 || shouldEnableModMixin(parts[2]);
    }

    public boolean shouldEnableModMixin(String mod) {
        return Loader.isModLoaded(mod);
    }
}