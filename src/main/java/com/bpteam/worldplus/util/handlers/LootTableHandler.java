package com.bpteam.worldplus.util.handlers;

import com.bpteam.worldplus.WorldPlus;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler
{
    public static final ResourceLocation PENGUIN = LootTableList.register(new ResourceLocation(WorldPlus.MODID, "penguin"));
    public static final ResourceLocation SEAL = LootTableList.register(new ResourceLocation(WorldPlus.MODID, "seal"));
    public static final ResourceLocation POLAR_BEAR = LootTableList.register(new ResourceLocation(WorldPlus.MODID, "polar_bear"));
}