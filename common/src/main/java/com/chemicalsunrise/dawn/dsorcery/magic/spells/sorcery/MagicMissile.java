package com.chemicalsunrise.dawn.dsorcery.magic.spells.sorcery;

import com.chemicalsunrise.dawn.dsorcery.api.SpellTier;
import com.chemicalsunrise.dawn.dsorcery.magic.elements.Element;
import com.chemicalsunrise.dawn.dsorcery.magic.spells.InstaCastSpell;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryElements;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class MagicMissile extends InstaCastSpell {

    public MagicMissile() {
        super(SpellTier.NOVICE, DawnSorceryElements.SORCERY);
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
