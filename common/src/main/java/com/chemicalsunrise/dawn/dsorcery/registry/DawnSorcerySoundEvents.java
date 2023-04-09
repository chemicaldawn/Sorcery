package com.chemicalsunrise.dawn.dsorcery.registry;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.resources.sounds.SoundEventRegistration;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

public class DawnSorcerySoundEvents {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(DawnSorcery.MOD_ID,Registries.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> SHADOW_WIZARD_MONEY_GANG = SOUNDS.register("shadow_wizard_money_gang",() ->
            SoundEvent.createFixedRangeEvent(DawnSorcery.id("shadow_wizard_money_gang"),1.0f));

    public static void register() {
        SOUNDS.register();
     }
}
