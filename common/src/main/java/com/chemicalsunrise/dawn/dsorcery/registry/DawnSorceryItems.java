package com.chemicalsunrise.dawn.dsorcery.registry;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.item.ScrollItem;
import com.chemicalsunrise.dawn.dsorcery.item.SpellBookItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class DawnSorceryItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(DawnSorcery.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> ARCANITE = ITEMS.register("arcanite", () ->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));

    public static final RegistrySupplier<Item> SPELLBOOK = ITEMS.register("spellbook", () ->
            new SpellBookItem(new Item.Properties()));

    public static final RegistrySupplier<Item> SCROLL = ITEMS.register("scroll", () ->
            new ScrollItem(new Item.Properties()));

    public static void register() {
        ITEMS.register();
    }
}
