package com.chemicalsunrise.dawn.dsorcery.registry;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.api.SpellRegistry;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.nbt.StringTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DawnSorceryTabs {

    public static final CreativeTabRegistry.TabSupplier WANDS_TAB = CreativeTabRegistry.create(new ResourceLocation(DawnSorcery.MOD_ID, "wands"), () ->
            new ItemStack(DawnSorceryItems.ARCANITE.get()));

    public static final CreativeTabRegistry.TabSupplier SPELLS_TAB = CreativeTabRegistry.create(new ResourceLocation(DawnSorcery.MOD_ID, "spells"), () ->
            new ItemStack(DawnSorceryItems.SCROLL.get()));

    public static void populate() {
        CreativeTabRegistry.appendStack(SPELLS_TAB, SpellRegistry.getSpellItems());
    }
}
