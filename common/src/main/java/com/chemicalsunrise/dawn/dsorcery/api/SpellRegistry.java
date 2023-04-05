package com.chemicalsunrise.dawn.dsorcery.api;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.item.SpellBookItem;
import com.chemicalsunrise.dawn.dsorcery.magic.elements.Element;
import com.chemicalsunrise.dawn.dsorcery.magic.spells.Spell;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryItems;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.nbt.StringTag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SpellRegistry {

    public static final HashMap<ResourceLocation,Spell> REGISTRY = new HashMap<>();

    private HashMap<ResourceLocation,Spell> INTERNAL_REGISTRY;
    private String modID;

    public SpellRegistry(String modID) {

        INTERNAL_REGISTRY = new HashMap<>();
        this.modID = modID;
    }

    public static Supplier[] getSpellItems() {

        ArrayList<Supplier<ItemStack>> list = new ArrayList();

        list.add(() -> DawnSorceryItems.SCROLL.get().getDefaultInstance());
        list.add(() -> DawnSorceryItems.SPELLBOOK.get().getDefaultInstance());

        for(Map.Entry<ResourceLocation,Spell> entry : REGISTRY.entrySet()) {
            Supplier<ItemStack> addition = () -> {
                ItemStack stack = DawnSorceryItems.SCROLL.get().getDefaultInstance();
                stack.addTagElement("spell", StringTag.valueOf(entry.getKey().toString()));
                return stack;
            };

            list.add(addition);
        }

        for(Map.Entry<ResourceLocation,Spell> entry : REGISTRY.entrySet()) {
            Supplier<ItemStack> addition = () -> {
                ItemStack stack = DawnSorceryItems.SPELLBOOK.get().getDefaultInstance();
                stack.addTagElement("spell", StringTag.valueOf(entry.getKey().toString()));
                return stack;
            };

            list.add(addition);
        }

        return list.toArray(Supplier[]::new);
    }

    public Spell register(String id, Spell spell) {

        ResourceLocation full_id = new ResourceLocation(modID, id);

        INTERNAL_REGISTRY.put(full_id,spell);
        spell.setId(full_id);

        return spell;
    }

    public void register() {
        REGISTRY.putAll(INTERNAL_REGISTRY);
        INTERNAL_REGISTRY.clear();
    }

    public static Spell getById(ResourceLocation location) {
        return REGISTRY.get(location);
    }

    public static Spell getByString(String id) {

        return REGISTRY.get(new ResourceLocation(id));
    }
}
