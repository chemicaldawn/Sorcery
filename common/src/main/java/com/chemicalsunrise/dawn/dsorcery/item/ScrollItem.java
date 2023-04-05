package com.chemicalsunrise.dawn.dsorcery.item;

import com.chemicalsunrise.dawn.dsorcery.DawnSorcery;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ScrollItem extends SpellBoundItem {
    public ScrollItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        player.swing(interactionHand);

        if(!player.isCreative()) {
            itemStack.setCount(itemStack.getCount() - 1);
        }

        DawnSorcery.LOGGER.info(level.isClientSide());

        if(this.getSpell(itemStack) != null) {

        }
        else {
            level.playSeededSound(player, player.position().x, player.position().y, player.position().z, SoundEvents.FIRE_EXTINGUISH, SoundSource.PLAYERS, 0.33f, 1.0f, 0);
        }

        return InteractionResultHolder.consume(itemStack);
    }
}
