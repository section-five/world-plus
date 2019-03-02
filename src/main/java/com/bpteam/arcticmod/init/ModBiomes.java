package com.bpteam.arcticmod.init;

import com.bpteam.arcticmod.world.biomes.BiomeSnowyPlains;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes {
    public static final Biome SNOWY_PLAINS = new BiomeSnowyPlains();

    public static void registerBiomes() {
        initBiome(SNOWY_PLAINS, "Snowy Plains", BiomeType.ICY, Type.COLD, Type.RIVER, Type.WET);
    }

    private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types) {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));

        if (ModConfig.world.GenSnowyPlains) {
            BiomeManager.addSpawnBiome(biome);
        }

        return biome;
    }
}