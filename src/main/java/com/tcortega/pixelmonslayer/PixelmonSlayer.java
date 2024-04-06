package com.tcortega.pixelmonslayer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = PixelmonSlayer.ID, name = PixelmonSlayer.NAME, version = PixelmonSlayer.VERSION, dependencies = "required:pixelmon@[8.3.8,);", acceptedMinecraftVersions = "[1.12.2]")
@Mod.EventBusSubscriber(modid = PixelmonSlayer.ID)
public class PixelmonSlayer {
    @Mod.Instance
    public static PixelmonSlayer INSTANCE;
    public static final String NAME = "PixelmonSlayer";
    public static final String VERSION = "1.0";
//    private CuriosityUtils pokemonUtil;
//    private ModuleManager moduleManager;
//    private CommandManager commandManager;

    /* renamed from: ID */
    public static final String ID = "pixelmonslayer";
    public static final Logger LOGGER = LogManager.getLogger(ID);

    public PixelmonSlayer() {
        INSTANCE = this;
    }

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        LOGGER.info("PixelmonSlayer is loading...");
//        new GuiOpenListener();
//        new PokeSpawnListener();
//        LOGGER.info("Loading Pokemons from json file...");
//        this.pokemonUtil = CuriosityUtils.init();
//        LOGGER.info("Successfully loaded " + this.pokemonUtil.size() + " Pokemons!");
//        LOGGER.info("Loading managers...");
//        this.commandManager = new CommandManager();
//        this.moduleManager = new ModuleManager();
//        LOGGER.info("Successfully loaded managers!");
        LOGGER.info("PixelmonSlayer has loaded!");
    }

//    public static CuriosityUtils getCuriosityUtils() {
//        return INSTANCE.pokemonUtil;
//    }
//
//    public ModuleManager getModuleManager() {
//        return this.moduleManager;
//    }
//
//    public CommandManager getCommandManager() {
//        return this.commandManager;
//    }
}