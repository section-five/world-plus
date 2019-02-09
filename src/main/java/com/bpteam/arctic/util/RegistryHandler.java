package com.bpteam.arctic.util;

import com.bpteam.arctic.init.ModEntities;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@EventBusSubscriber
public class RegistryHandler {

    public static void preInitRegistries(FMLPreInitializationEvent event) {

        ModEntities.registerEntities();
        RenderHandler.registerEntityRenders();
    }

    public static void initRegistries(FMLInitializationEvent event) {
    }
}


