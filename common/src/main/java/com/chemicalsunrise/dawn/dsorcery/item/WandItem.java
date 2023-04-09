package com.chemicalsunrise.dawn.dsorcery.item;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.api.SpellTier;
import com.chemicalsunrise.dawn.dsorcery.magic.elements.Element;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryItems;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WandItem extends Item {

    private SpellTier tier;
    private Element element;
    private int defaultSpellSlots;

    public WandItem(Properties properties, SpellTier tier, Element element, int defaultSpellSlots) {
        super(properties);

        this.tier = tier;
        this.element = element;
        this.defaultSpellSlots = defaultSpellSlots;
    }

    @Override
    public ItemStack getDefaultInstance() {
        ItemStack base = new ItemStack(this);
        base.addTagElement("SpellInventory", new ListTag());
        return base;
    }
}
