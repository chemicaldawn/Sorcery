package com.chemicalsunrise.dawn.dsorcery.mixin;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.client.gui.SpellBookScreen;
import com.chemicalsunrise.dawn.dsorcery.magic.spells.Spell;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryItems;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorcerySpells;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.inventory.BookEditScreen;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LocalPlayer.class)
public class MixinLocalPlayer {

    @Inject(at = @At("HEAD"), method = "openItemGui")
    public void openItemGui(ItemStack itemStack, InteractionHand interactionHand, CallbackInfo ci) {
        if(itemStack.is(DawnSorceryItems.SPELLBOOK.get())) {
            ((LocalPlayer)(Object)this).minecraft.setScreen(new SpellBookScreen(itemStack));
            ((LocalPlayer)(Object)this).level.playSound(((LocalPlayer)(Object)this), ((LocalPlayer)(Object)this).blockPosition(), SoundEvents.BOOK_PAGE_TURN, SoundSource.PLAYERS, 1.0f, 1.0f);
        }
    }
}
