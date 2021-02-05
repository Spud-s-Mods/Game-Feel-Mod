package com.avocadospud.sensation.common.core;

import com.avocadospud.sensation.common.event.PlayerEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SensationMod.MODID)
public class SensationMod {

    public static final String MODID = "sensation";
    private static final Logger LOGGER = LogManager.getLogger(MODID);

    private static SensationMod INSTANCE;

    public SensationMod() {
        INSTANCE = this;

        MinecraftForge.EVENT_BUS.register(new PlayerEvents());

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }

    public static SensationMod getInstance() {
        return INSTANCE;
    }
}
