package com.bpteam.worldplus.init;

import com.bpteam.worldplus.WorldPlus;
import javafx.scene.shape.Arc;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = WorldPlus.MODID, name = "WorldPlus")
public class ModConfig {

    @Config.LangKey("category.worldplus.spawn")
    public static final Spawn spawn = new Spawn();
    @Config.LangKey("category.worldplus.world")
    public static final World world = new World();

    public static class World {
        @Config.LangKey("config.worldplus.world.gen_snowy_plains")
        @Config.Comment("Do this BEFORE you make a world + Overworld gen")
        public boolean GenSnowyPlains = true;
    }

    public static class Spawn {

        @Config.LangKey("category.worldplus.spawn.penguin")
        public final Penguin penguin = new Penguin();
        @Config.LangKey("category.worldplus.spawn.seal")
        public final Seal seal = new Seal();
        @Config.LangKey("category.worldplus.spawn.walrus")
        public final Walrus walrus = new Walrus();
        @Config.LangKey("category.worldplus.spawn.arcticfox")
        public final ArcticFox arcticFox = new ArcticFox();
        @Config.LangKey("category.worldplus.spawn.snake")
        public final Snake snake = new Snake();

        public static class Penguin {
            @Config.LangKey("config.worldplus.spawn.max_spawn")
            @Config.Comment("The maximum amount of penguins per biome")
            @Config.RangeInt(max = 25)
            public int maximumSpawn = 5;

            @Config.LangKey("config.worldplus.spawn.spawn_probability")
            @Config.Comment("The penguin spawn probability rate")
            public int spawnProbability = 500;

            @Config.LangKey("config.worldplus.spawn.min_spawn")
            @Config.Comment("The minimum amount of penguins per biome")
            @Config.RangeInt(min = 1, max = 24)
            public int minimumSpawn = 2;

            @Config.LangKey("config.worldplus.spawn.spawntype")
            @Config.Comment("This will only accept: WATER_CREATURE, AMBIENT, CREATURE, MONSTER || Anything else WILL crash your game.")
            @Config.RequiresMcRestart
            public EnumCreatureType spawnType = EnumCreatureType.AMBIENT;

        }

        public static class Seal {
            @Config.LangKey("config.worldplus.spawn.max_spawn")
            @Config.Comment("The maximum amount of seals per biome")
            @Config.RangeInt(max = 25)
            public int maximumSpawn = 5;

            @Config.LangKey("config.worldplus.spawn.spawn_probability")
            @Config.Comment("The seal spawn probability rate")
            public int spawnProbability = 500;

            @Config.LangKey("config.worldplus.spawn.min_spawn")
            @Config.Comment("The minimum amount of seals per biome")
            @Config.RangeInt(min = 1, max = 24)
            public int minimumSpawn = 2;

            @Config.LangKey("config.worldplus.spawn.spawntype")
            @Config.Comment("This will only accept: WATER_CREATURE, AMBIENT, CREATURE, MONSTER || Anything else WILL crash your game.")
            @Config.RequiresMcRestart
            public EnumCreatureType spawnType = EnumCreatureType.AMBIENT;

        }

        public static class Walrus {
            @Config.LangKey("config.worldplus.spawn.max_spawn")
            @Config.Comment("The maximum amount of walrus's per biome")
            @Config.RangeInt(max = 25)
            public int maximumSpawn = 5;

            @Config.LangKey("config.worldplus.spawn.spawn_probability")
            @Config.Comment("The walrus spawn probability rate")
            public int spawnProbability = 500;

            @Config.LangKey("config.worldplus.spawn.min_spawn")
            @Config.Comment("The minimum amount of walrus's per biome")
            @Config.RangeInt(min = 1, max = 24)
            public int minimumSpawn = 2;

            @Config.LangKey("config.worldplus.spawn.spawntype")
            @Config.Comment("This will only accept: WATER_CREATURE, AMBIENT, CREATURE, MONSTER || Anything else WILL crash your game.")
            @Config.RequiresMcRestart
            public EnumCreatureType spawnType = EnumCreatureType.AMBIENT;

        }

        public static class ArcticFox {
            @Config.LangKey("config.worldplus.spawn.max_spawn")
            @Config.Comment("The maximum amount of fox's per biome")
            @Config.RangeInt(max = 25)
            public int maximumSpawn = 5;

            @Config.LangKey("config.worldplus.spawn.spawn_probability")
            @Config.Comment("The fox spawn probability rate")
            public int spawnProbability = 500;

            @Config.LangKey("config.worldplus.spawn.min_spawn")
            @Config.Comment("The minimum amount of fox's per biome")
            @Config.RangeInt(min = 1, max = 24)
            public int minimumSpawn = 2;

            @Config.LangKey("config.worldplus.spawn.spawntype")
            @Config.Comment("This will only accept: WATER_CREATURE, AMBIENT, CREATURE, MONSTER || Anything else WILL crash your game.")
            @Config.RequiresMcRestart
            public EnumCreatureType spawnType = EnumCreatureType.AMBIENT;

        }

        public static class Snake {

            @Config.LangKey("config.worldplus.spawn.max_spawn")
            @Config.Comment("The maximum amount of fox's per biome")
            @Config.RangeInt(max = 25)
            public int maximumSpawn = 5;

            @Config.LangKey("config.worldplus.spawn.spawn_probability")
            @Config.Comment("The fox spawn probability rate")
            public int spawnProbability = 500;

            @Config.LangKey("config.worldplus.spawn.min_spawn")
            @Config.Comment("The minimum amount of fox's per biome")
            @Config.RangeInt(min = 1, max = 24)
            public int minimumSpawn = 2;

            @Config.LangKey("config.worldplus.spawn.spawntype")
            @Config.Comment("This will only accept: WATER_CREATURE, AMBIENT, CREATURE, MONSTER || Anything else WILL crash your game.")
            @Config.RequiresMcRestart
            public EnumCreatureType spawnType = EnumCreatureType.MONSTER;

        }

        @Config.LangKey("config.worldplus.spawn.allowed_spawn_biomes_hostile")
        @Config.Comment("Note: A list of biomes where Hostile mobs SHOULD spawn.")
        public String[] AllowedBiomesMonster = {"minecraft:jungle", "minecraft:jungle_hills_edge", "minecraft:jungle_hills_hills"};


        @Config.LangKey("config.worldplus.spawn.allowed_spawn_biomes_arctic")
        @Config.Comment("Note: A list of biomes where Arctic mobs SHOULD spawn.")
        public String[] AllowedBiomesArctic = {"minecraft:taiga_cold_hills", "minecraft:snowy_tundra", "minecraft:cold_beach", "minecraft:frozen_river", "minecraft:taiga_cold", "worldplus:snowy_plains"};

    }

    @Mod.EventBusSubscriber
    public static class EventHandler {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(WorldPlus.MODID)) {
                ConfigManager.sync(WorldPlus.MODID, Config.Type.INSTANCE);
            }
        }
    }
}
