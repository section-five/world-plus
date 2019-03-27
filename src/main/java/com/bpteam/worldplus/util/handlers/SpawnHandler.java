package com.bpteam.worldplus.util.handlers;


import com.bpteam.worldplus.common.entities.*;
import com.bpteam.worldplus.init.ModConfig;
import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.Collection;

import static net.minecraftforge.fml.common.Mod.*;

/*24/02/19 Josia50*/

@EventBusSubscriber
public class SpawnHandler {

    public static void setUpSpawns() {
        Collection<Biome> biomes = ForgeRegistries.BIOMES.getValuesCollection();

        ArrayList<Biome> ARCTICSPAWNS = Lists.newArrayList();
        ArrayList<Biome> MONSTERSPAWNS = Lists.newArrayList();

        for (String rs : ModConfig.spawn.AllowedBiomesArctic) {
            if (Biome.REGISTRY.containsKey(new ResourceLocation(rs))) {
                Biome addBiome = Biome.REGISTRY.getObject(new ResourceLocation(rs));
                ARCTICSPAWNS.add(addBiome);
            }
        }

        for (String rsh : ModConfig.spawn.AllowedBiomesMonster) {
            if (Biome.REGISTRY.containsKey(new ResourceLocation(rsh))) {
                Biome addBiome = Biome.REGISTRY.getObject(new ResourceLocation(rsh));
                MONSTERSPAWNS.add(addBiome);
            }
        }

        ARCTICSPAWNS.forEach(biome -> {
            if (biome != null) {
                net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn(EntityPenguin.class, ModConfig.spawn.penguin.spawnProbability, ModConfig.spawn.penguin.minimumSpawn, ModConfig.spawn.penguin.maximumSpawn, ModConfig.spawn.penguin.spawnType, biome);
                net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn(EntitySeal.class, ModConfig.spawn.seal.spawnProbability, ModConfig.spawn.seal.minimumSpawn, ModConfig.spawn.seal.maximumSpawn, ModConfig.spawn.seal.spawnType, biome);
                net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn(EntityArcticFox.class, ModConfig.spawn.arcticFox.spawnProbability, ModConfig.spawn.arcticFox.minimumSpawn, ModConfig.spawn.arcticFox.maximumSpawn, ModConfig.spawn.arcticFox.spawnType, biome);
                net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn(EntityWalrus.class, ModConfig.spawn.walrus.spawnProbability, ModConfig.spawn.walrus.minimumSpawn, ModConfig.spawn.walrus.maximumSpawn, ModConfig.spawn.walrus.spawnType, biome);
            }
        });

        MONSTERSPAWNS.forEach(biome -> {
            if (biome != null) {
                net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn(EntitySnake.class, ModConfig.spawn.snake.spawnProbability, ModConfig.spawn.snake.minimumSpawn, ModConfig.spawn.snake.maximumSpawn, ModConfig.spawn.snake.spawnType, biome);
            }
        });

    }
}
