package com.chemicalsunrise.dawn.dsorcery.magic.elements;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;

public class Element {

    private String id;
    private ChatFormatting textStyle;

    public Element(String id, ChatFormatting textStyle) {
        this.id = id;
        this.textStyle = textStyle;
    }

    public ChatFormatting getStyle() {
        return textStyle;
    }
}
