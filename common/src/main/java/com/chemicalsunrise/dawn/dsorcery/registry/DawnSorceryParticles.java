package com.chemicalsunrise.dawn.dsorcery.registry;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;

public class DawnSorceryParticles {

    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(DawnSorcery.MOD_ID, Registries.PARTICLE_TYPE);

    public static void register() {
        PARTICLES.register();
    }

}
