package com.drakhavik.spudergy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SpudergyMod.MOD_ID)
public class SpudergyMod {
    public static SpudergyMod instance;
    public static final String MOD_ID = "spudergy";
    public static final Logger logger = LogManager.getLogger(MOD_ID);

    public SpudergyMod() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        logger.info("Setup method did a thing fucktard");
    }

    private void clientRegistries(final FMLClientSetupEvent even) {

    }

}