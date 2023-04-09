package com.chemicalsunrise.dawn.dsorcery.forge;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.client.DawnSorceryClient;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryTabs;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.NewRegistryEvent;
import net.minecraftforge.registries.RegisterEvent;

@Mod(DawnSorcery.MOD_ID)
public class DawnSorceryForge {
    public DawnSorceryForge() {

        EventBuses.registerModEventBus(DawnSorcery.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // common code
        DawnSorcery.init();
    }

    @Mod.EventBusSubscriber(modid = DawnSorcery.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientEventBusSubscriber {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            DawnSorceryClient.init();
        }
    }
}
