package com.bpteam.arcticmod.init;

import com.bpteam.arcticmod.ArcticMod;
import com.bpteam.arcticmod.Reference;
import com.bpteam.arcticmod.common.entitys.EntityPenguin;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntitys
{
    public static void registerEntities()
    {
        registerEntity("centaur", EntityPenguin.class, 404, 50, 11437146, 000000);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, ArcticMod.instance, range, 1, true, color1, color2);
    }
}