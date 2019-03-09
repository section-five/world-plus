package com.bpteam.arcticmod.util.handlers;

import com.bpteam.arcticmod.ArcticPlus;
import com.bpteam.arcticmod.common.entities.EntityPenguin;
import com.bpteam.arcticmod.common.entities.EntitySeal;
import com.bpteam.arcticmod.common.entities.EntityStrongIceBall;
import com.bpteam.arcticmod.common.entities.EntityWeakIceBall;
import com.bpteam.arcticmod.init.ModConfig;
import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.Collection;

/*24/02/19 Josia50*/

@Mod.EventBusSubscriber
public class EntityRegistry {

    @SubscribeEvent
    public static void addEntities(RegistryEvent.Register<EntityEntry> e) {
        IForgeRegistry<EntityEntry> reg = e.getRegistry();
        reg.registerAll(EntityEntries.PENGUIN, EntityEntries.SEAL, EntityEntries.WEAK_ICEBALL, EntityEntries.STRONG_ICEBALL);
        setUpSpawns();
    }

    // Entities
    @GameRegistry.ObjectHolder(ArcticPlus.MODID)
    public static class EntityEntries {
        public static final EntityEntry PENGUIN = EntityEntryBuilder.create().entity(EntityPenguin.class).id(new ResourceLocation(ArcticPlus.MODID, "penguin"), 0).name("penguin").tracker(80, 3, true).egg(255255255, 000000).build();
        public static final EntityEntry WEAK_ICEBALL = EntityEntryBuilder.create().entity(EntityWeakIceBall.class).id(new ResourceLocation(ArcticPlus.MODID, "weakiceball"), 1).name("weakiceball").tracker(80, 3, true).build();
        public static final EntityEntry STRONG_ICEBALL = EntityEntryBuilder.create().entity(EntityStrongIceBall.class).id(new ResourceLocation(ArcticPlus.MODID, "strongiceball"), 2).name("strongiceball").tracker(80, 3, true).build();
        public static final EntityEntry SEAL = EntityEntryBuilder.create().entity(EntitySeal.class).id(new ResourceLocation(ArcticPlus.MODID, "seal"), 3).name("seal").tracker(80, 3, true).egg(255255255, 000000).build();
        // .spawn(ModConfig.spawn.penguin.spawnType, ModConfig.spawn.penguin.spawnProbability, ModConfig.spawn.penguin.minimumSpawn,ModConfig.spawn.penguin.maximumSpawn, Biome.getBiome(13))

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
