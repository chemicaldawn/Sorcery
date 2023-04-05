package com.chemicalsunrise.dawn.dsorcery.magic.spells;

import com.chemicalsunrise.dawn.dsorcery.api.SpellTier;
import com.chemicalsunrise.dawn.dsorcery.magic.elements.Element;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryElements;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class MagicMissile extends Spell {

    public MagicMissile() {
        super(SpellTier.BASIC, DawnSorceryElements.SORCERY);
    }

    @Override
    public void cast(Level level, Player player, InteractionHand interactionHand) {

    }
}
