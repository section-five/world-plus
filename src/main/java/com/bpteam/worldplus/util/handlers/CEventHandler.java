package com.bpteam.worldplus.util.handlers;

import com.bpteam.worldplus.common.world.Worldinformation;
import com.bpteam.worldplus.init.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

// Common Event Handler
@Mod.EventBusSubscriber
public class CEventHandler {

    @SubscribeEvent
    public static void BreakBlock(BlockEvent.BreakEvent event) {
        EntityPlayer player = event.getPlayer();
        BlockPos pos1 = event.getPos();
        if (player.world.getBlockState(pos1).getBlock() == Blocks.ICE) {
            player.world.spawnEntity(new EntityItem(player.world, pos1.getX(), pos1.getY(), pos1.getZ(), new ItemStack(ModItems.WEAKER_ICE_BALL)));
        }
    }

    @SubscribeEvent
    public static void MakeWind(TickEvent.WorldTickEvent e) {
        if(e.world.getWorldInfo().isRaining()) {
            Worldinformation.setWind_state(true);
            Worldinformation.setWind_level(1);
        }

        if(e.world.getWorldInfo().isThundering()) {
            Worldinformation.setWind_state(true);
            Worldinformation.setWind_level(2);
        }
    }
}