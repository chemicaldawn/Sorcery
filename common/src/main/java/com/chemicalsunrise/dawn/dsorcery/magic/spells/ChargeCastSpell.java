package com.chemicalsunrise.dawn.dsorcery.magic.spells;

import com.chemicalsunrise.dawn.dsorcery.api.SpellTier;
import com.chemicalsunrise.dawn.dsorcery.magic.elements.Element;

public abstract class ChargeCastSpell extends Spell{

    private float chargeTime;

    public ChargeCastSpell(SpellTier tier, Element element, float chargeTime) {
        super(tier, element);
    }

    public abstract void onCast();

    public float getChargeTime() {
        return chargeTime;
    }
}
