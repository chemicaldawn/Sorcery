package com.chemicalsunrise.dawn.dsorcery.client.gui;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.GameNarrator;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.BookEditScreen;
import net.minecraft.client.gui.screens.inventory.BookViewScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class SpellBookScreen extends Screen {



    public SpellBookScreen(ItemStack itemStack) {
        super(GameNarrator.NO_TITLE);
    }

    @Override
    protected void init() {
    }

    @Override
    public void render(PoseStack poseStack, int i, int j, float f) {
        this.renderBackground(poseStack);

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, new ResourceLocation(DawnSorcery.MOD_ID,"textures/gui/spellbook.png"));
        int widthOffset = (this.width - 296) / 2;
        int heightOffset = (this.height - 180) / 2;
        this.blit(poseStack, widthOffset, heightOffset, 0, 0, 296, 296, 296, 296);

        this.font.draw(poseStack, "Magic Missile", 0f, 0f, 1);

        super.render(poseStack, i, j, f);
    }
}
