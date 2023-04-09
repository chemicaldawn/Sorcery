package com.chemicalsunrise.dawn.dsorcery.mixin;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.chemicalsunrise.dawn.dsorcery.item.WandItem;
import com.chemicalsunrise.dawn.dsorcery.registry.DawnSorceryItems;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class MixinGui extends GuiComponent {

    @Inject(at = @At("TAIL"), method = "renderHotbar")
    private void renderHotbar(float f, PoseStack poseStack, CallbackInfo ci) {
        Player player = ((Gui)(Object)this).getCameraPlayer();

        if(player.getMainHandItem().getItem().getClass() == WandItem.class) {
            ((Gui)(Object)this).getFont();
        }
    }
}
