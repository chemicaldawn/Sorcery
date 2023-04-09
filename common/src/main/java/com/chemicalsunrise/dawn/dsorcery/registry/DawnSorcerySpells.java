package com.chemicalsunrise.dawn.dsorcery.registry;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.api.SpellRegistry;
import com.chemicalsunrise.dawn.dsorcery.magic.spells.sorcery.MagicMissile;
import com.chemicalsunrise.dawn.dsorcery.magic.spells.Spell;

public class DawnSorcerySpells {

    public static final SpellRegistry SPELLS = new SpellRegistry(DawnSorcery.MOD_ID);

    public static final Spell MAGIC_MISSILE = SPELLS.register("magic_missile", new MagicMissile());

    public static void register() {
        SPELLS.register();
    }
}
