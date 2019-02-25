package com.bpteam.arcticmod.util.handlers;

import com.bpteam.arcticmod.init.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventHandler {

    @SubscribeEvent
    public static void BreakBlock(BlockEvent.BreakEvent event) {
        EntityPlayer player = event.getPlayer();
        BlockPos pos1 = event.getPos();
        if (player.world.getBlockState(pos1).getBlock() == Blocks.ICE) {
            player.world.spawnEntity(new EntityItem(player.world, pos1.getX(), pos1.getY(), pos1.getZ(), new ItemStack(ModItems.WEAKER_ICE_BALL)));
        }
    }
}
