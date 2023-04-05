package com.chemicalsunrise.dawn.dsorcery.item;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.api.SpellRegistry;
import com.chemicalsunrise.dawn.dsorcery.magic.spells.Spell;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpellBoundItem extends Item {
    public SpellBoundItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {

        Spell scrollSpell = this.getSpell(itemStack);

        if(scrollSpell != null) {
            list.add(scrollSpell.getTextComponent());
            list.add(Component.literal("Basic").withStyle(ChatFormatting.DARK_GRAY));
        }
        else {
            list.add(Component.literal("Unbound").withStyle(ChatFormatting.DARK_GRAY));
        }
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        if(getSpell(itemStack) != null) {
            return true;
        }
        return false;
    }

    public Spell getSpell(ItemStack itemStack) {
        CompoundTag tag = itemStack.getTag();
        if(tag != null) {
            Tag id = tag.get("spell");
            if(id != null) {
                String spell_id = id.getAsString();
                return SpellRegistry.getByString(spell_id);
            }
        }

        return null;
    }
}
