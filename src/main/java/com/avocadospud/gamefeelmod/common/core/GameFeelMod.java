package com.avocadospud.gamefeelmod.common.core;

import com.avocadospud.gamefeelmod.common.event.PlayerEvents;
import net.minecraft.client.MinecraftGame;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GameFeelMod.MODID)
public class GameFeelMod {

    public static final String MODID = "gamefeelmod";
    private static final Logger LOGGER = LogManager.getLogger(MODID);

    private static GameFeelMod INSTANCE;

    public GameFeelMod() {
        INSTANCE = this;

        MinecraftForge.EVENT_BUS.register(new PlayerEvents());

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }

    public static GameFeelMod getInstance() {
        return INSTANCE;
    }
}
