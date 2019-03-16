package com.bpteam.arcticmod.util.handlers;


import com.bpteam.arcticmod.common.entities.EntityPenguin;
import com.bpteam.arcticmod.init.ModConfig;
import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.Collection;

import static net.minecraftforge.fml.common.Mod.*;

/*24/02/19 Josia50*/

@EventBusSubscriber
public class SpawnHandler {

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
