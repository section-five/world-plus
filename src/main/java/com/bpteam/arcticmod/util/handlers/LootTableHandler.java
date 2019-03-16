package com.bpteam.arcticmod.util.handlers;

import com.bpteam.arcticmod.ArcticPlus;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler
{
    public static final ResourceLocation PENGUIN = LootTableList.register(new ResourceLocation(ArcticPlus.MODID, "penguin"));
}