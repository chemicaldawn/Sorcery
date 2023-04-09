package com.chemicalsunrise.dawn.dsorcery.registry;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.entity.MagicMissileEntity;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class DawnSorceryEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(DawnSorcery.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<MagicMissileEntity>> MAGIC_MISSILE = ENTITIES.register(DawnSorcery.id("magic_missile"),
            ()-> EntityType.Builder.<MagicMissileEntity>of(MagicMissileEntity::new, MobCategory.MISC).build(DawnSorcery.id("magic_missile").toString()));

    public static void register() {
        ENTITIES.register();
    }
}
