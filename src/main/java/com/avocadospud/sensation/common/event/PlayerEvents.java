package com.avocadospud.sensation.common.event;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerEvents {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onPlayerDropItem(ItemTossEvent event) {
        PlayerEntity player = event.getPlayer();
        World world = player.getEntityWorld();

        world.playSound(player, player.getPosition(), SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.PLAYERS, 0.15F, 1.25F);
    }
}
