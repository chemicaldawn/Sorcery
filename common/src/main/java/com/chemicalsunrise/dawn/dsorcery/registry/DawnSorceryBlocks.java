package com.chemicalsunrise.dawn.dsorcery.registry;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.gui.screens.recipebook.RecipeUpdateListener;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.stats.RecipeBook;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class DawnSorceryBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(DawnSorcery.MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(DawnSorcery.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Block> ARCANITE_ORE = BLOCKS.register("arcanite_ore",() -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistrySupplier<Item> ARCANITE_ORE_ITEM = BLOCK_ITEMS.register("arcanite_ore",() -> new BlockItem(ARCANITE_ORE.get(), new Item.Properties().arch$tab(CreativeModeTabs.NATURAL_BLOCKS)));

    public static void register() {
        BLOCKS.register();
        BLOCK_ITEMS.register();
    }
}
