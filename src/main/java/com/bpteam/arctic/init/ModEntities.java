package com.bpteam.arctic.init;

import com.Main;
import com.bpteam.arctic.Reference;
import com.bpteam.arctic.entity.EntityPenguin;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

    public static void registerEntities() {
        registerEntity("penguin", EntityPenguin.class, Reference.ENTITY_PENGUIN_ID, 20, 16777215, 000000);
    }

        private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }
}
