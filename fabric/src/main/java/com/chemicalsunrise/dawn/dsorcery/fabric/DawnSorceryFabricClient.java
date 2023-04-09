package com.chemicalsunrise.dawn.dsorcery.fabric;

import com.chemicalsunrise.dawn.dsorcery.client.DawnSorceryClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class DawnSorceryFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        DawnSorceryClient.init();
    }
}
