package com.chemicalsunrise.dawn.dsorcery.magic.spells.celestine;

import com.chemicalsunrise.dawn.dsorcery.api.SpellTier;
import com.chemicalsunrise.dawn.dsorcery.magic.elements.Element;
import com.chemicalsunrise.dawn.dsorcery.magic.spells.InstaCastSpell;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryElements;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class Starstep extends InstaCastSpell {
    public Starstep(SpellTier tier, Element element) {
        super(SpellTier.ADEPT, DawnSorceryElements.CELESTINE);
    }

    @Override
    public void onCast(Level level, Player player, InteractionHand interactionHand) {

    }

    @Override
    public boolean isGlobalSpell() {
        return false;
    }

    @Override
    public boolean isJokeSpell() {
        return false;
    }
}
