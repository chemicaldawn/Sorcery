package com.chemicalsunrise.dawn.dsorcery.fabric;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryTabs;
import net.fabricmc.api.ModInitializer;

public class DawnSorceryFabric implements ModInitializer {

    

    @Override
    public void onInitialize() {
        DawnSorcery.init();
    }
}
