package com.chemicalsunrise.dawn.dsorcery.magic.spells;

import com.chemicalsunrise.dawn.dsorcery.api.SpellTier;
import com.chemicalsunrise.dawn.dsorcery.magic.elements.Element;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public abstract class Spell {

    private ResourceLocation id;
    private SpellTier tier;
    private Element element;

    public Spell(SpellTier tier, Element element) {
        this.tier = tier;
        this.element = element;
    }

    public abstract boolean isGlobalSpell();

    public abstract boolean isJokeSpell();

    public void consumeMana(Player player, InteractionHand interactionHand) {
        // decrease mana value in wand
    }

    public SpellTier getTier() {
        return this.tier;
    }

    public Element getElement() {
        return this.element;
    }

    public void setId(ResourceLocation id) {
        this.id = id;
    }

    public Component getTextComponent() {
        return Component.translatable("spell." + this.id.getNamespace() + "." + this.id.getPath() ).withStyle(this.getElement().getStyle());
    }
}
