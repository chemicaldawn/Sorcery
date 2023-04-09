package com.chemicalsunrise.dawn.dsorcery;

import com.chemicalsunrise.dawn.dsorcery.client.DawnSorceryClient;
import com.chemicalsunrise.dawn.dsorcery.registry.*;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DawnSorcery {
    public static final String MOD_ID = "dsorcery";
    public static final Logger LOGGER = LogManager.getLogger();

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID,path);
    }

    public static void init() {

        DawnSorceryItems.register();
        DawnSorceryBlocks.register();
        DawnSorcerySpells.register();
        DawnSorceryEntities.register();
        DawnSorceryTabs.populate();
        DawnSorcerySoundEvents.register();
        DawnSorceryParticles.register();
    }
}
