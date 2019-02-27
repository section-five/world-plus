package com.bpteam.arcticmod.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public static Configuration config;

    public void preInit(FMLPreInitializationEvent event)
    {
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {
        if (config.hasChanged()) {
            config.save();
        }
    }
    public void registerItemRenderer(Item itemFromBlock, int i, String inventory) {
    }
}
