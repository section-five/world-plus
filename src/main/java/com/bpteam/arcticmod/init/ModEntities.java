package com.bpteam.arcticmod.init;

import com.bpteam.arcticmod.ArcticMod;
import com.bpteam.arcticmod.common.entities.EntityPenguin;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/*24/028/19 Josia50*/

@Mod.EventBusSubscriber
public class ModEntities {

    @SubscribeEvent
    public static void addEntities(RegistryEvent.Register<EntityEntry> e) {
        IForgeRegistry<EntityEntry> reg = e.getRegistry();
        reg.registerAll(EntityEntries.PENGUIN);
    }

    // Entities
    @GameRegistry.ObjectHolder(ArcticMod.MODID)
    public static class EntityEntries {
        public static final EntityEntry PENGUIN = EntityEntryBuilder.create().entity(EntityPenguin.class).id(new ResourceLocation(ArcticMod.MODID, "penguin"), 0).name("penguin").tracker(80, 3, true).egg(11437146,000000).build();
    }

}