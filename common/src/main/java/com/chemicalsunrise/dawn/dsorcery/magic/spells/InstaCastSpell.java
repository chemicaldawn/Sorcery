package com.chemicalsunrise.dawn.dsorcery.magic.spells;

import com.chemicalsunrise.dawn.dsorcery.api.SpellTier;
import com.chemicalsunrise.dawn.dsorcery.magic.elements.Element;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public abstract class InstaCastSpell extends Spell {
    public InstaCastSpell(SpellTier tier, Element element) {
        super(tier, element);
    }

    public abstract void onCast(Level level, Player player, InteractionHand interactionHand);

}
