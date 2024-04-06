package com.tcortega.pixelmonslayer.core;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

import net.minecraftforge.fml.relauncher.FMLLaunchHandler;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import zone.rong.mixinbooter.IEarlyMixinLoader;

@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.Name("PixelmonSlayer-Core")
public class PixelmonSlayerCore implements IFMLLoadingPlugin, IEarlyMixinLoader {
    public static final boolean isDeobf = FMLLaunchHandler.isDeobfuscatedEnvironment();
    public static final List<String> modMixins = ImmutableList.of();

    public String[] getASMTransformerClass() {
        return new String[0];
    }

    public String getModContainerClass() {
        return null;
    }

    @Nullable
    public String getSetupClass() {
        return null;
    }

    public void injectData(Map<String, Object> data) {
    }

    public String getAccessTransformerClass() {
        return null;
    }

    public List<String> getMixinConfigs() {
        List<String> mixinList = modMixins.stream().map(mod -> "mixins.pixelmonslayer." + mod + ".json")
                .collect(Collectors.toList());
//
//        if (isDeobf) {
//            mixinList.add("mixins.devenv.json");
//        }
        return mixinList;
    }
}