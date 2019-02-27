package com.bpteam.arcticmod.util.handlers;

import com.bpteam.arcticmod.ArcticMod;
import com.bpteam.arcticmod.common.entities.EntityPenguin;
import com.bpteam.arcticmod.config.ModConfig;
import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.Collection;

/*24/028/19 Josia50*/

@Mod.EventBusSubscriber
public class EntityRegistry {

    @SubscribeEvent
    public static void addEntities(RegistryEvent.Register<EntityEntry> e) {
        IForgeRegistry<EntityEntry> reg = e.getRegistry();
        reg.registerAll(EntityEntries.PENGUIN);
        setUpSpawns();
    }

    // Entities
    @GameRegistry.ObjectHolder(ArcticMod.MODID)
    public static class EntityEntries {
        public static final EntityEntry PENGUIN = EntityEntryBuilder.create().entity(EntityPenguin.class).id(new ResourceLocation(ArcticMod.MODID, "penguin"), 0).name("penguin").tracker(80, 3, true).egg(11437146, 000000).spawn(ModConfig.spawn.penguin.spawnType, ModConfig.spawn.penguin.spawnProbability, ModConfig.spawn.penguin.minimumSpawn,ModConfig.spawn.penguin.maximumSpawn, Biome.getBiome(13)).build();
    }

// Works but VERY slow
    public static void setUpSpawns() {
        Collection<Biome> biomes = ForgeRegistries.BIOMES.getValuesCollection();
        ArrayList<Biome> SPAWNS = Lists.newArrayList();

        for (String rs : ModConfig.spawn.penguin.AllowedBiomes) {
            if (Biome.REGISTRY.containsKey(new ResourceLocation(rs))) {
                Biome addBiome = Biome.REGISTRY.getObject(new ResourceLocation(rs));
                SPAWNS.add(addBiome);
            }
        }

        SPAWNS.forEach(biome -> {
            if (biome != null) {
                net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn(EntityPenguin.class, ModConfig.spawn.penguin.spawnProbability, ModConfig.spawn.penguin.minimumSpawn, ModConfig.spawn.penguin.maximumSpawn, ModConfig.spawn.penguin.spawnType, biome);
            }
        });
    }
}