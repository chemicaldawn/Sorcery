package com.chemicalsunrise.dawn.dsorcery;

import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryBlocks;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryItems;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorcerySpells;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DawnSorcery {
    public static final String MOD_ID = "dsorcery";
    public static final Logger LOGGER = LogManager.getLogger();

    public static void init() {

        DawnSorceryItems.register();
        DawnSorceryBlocks.register();
        DawnSorcerySpells.register();
        DawnSorceryTabs.populate();
    }
}
