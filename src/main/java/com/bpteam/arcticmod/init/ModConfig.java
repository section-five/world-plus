package com.bpteam.arcticmod.init;

import com.bpteam.arcticmod.ArcticMod;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = ArcticMod.MODID, name = "Arctic Mod")
public class ModConfig {

    @Config.LangKey("category.arctic.spawn")
    public static final Spawn spawn = new Spawn();

    public static class Spawn {

        @Config.LangKey("category.arctic.spawn.penguin")
        public final Penguin penguin = new Penguin();

        public static class Penguin {
            @Config.LangKey("config.weeping-angels.max_spawn")
            @Config.Comment("The maximum amount of angels per biome")
            @Config.RangeInt(max = 25)
            public int maximumSpawn = 4;

            @Config.LangKey("config.weeping-angels.spawn_probability")
            @Config.Comment("The angel spawn probability rate")
            public int spawnProbability = 50;

            @Config.LangKey("config.weeping-angels.min_spawn")
            @Config.Comment("The minimum amount of angels per biome")
            @Config.RangeInt(max = 24)
            public int minimumSpawn = 2;

            @Config.LangKey("config.weeping-angels.spawntype")
            @Config.Comment("This will only accept: WATER_CREATURE, AMBIENT, CREATURE, MONSTER || Anything else WILL crash your game.")
            @Config.RequiresMcRestart
            public EnumCreatureType spawnType = EnumCreatureType.AMBIENT;

            @Config.LangKey("config.weeping-angels.disallowed_spawn_biomes")
            @Config.Comment("Note: A list of biomes where angels should NOT spawn.")
            public String[] AllowedBiomes = {"minecraft:snowy_mountains", "minecraft:snowy_tundra", "minecraft:snowy_beach", "minecraft:frozen_river", "minecraft:snowy_taiga_hills"};
        }
    }

    @Mod.EventBusSubscriber
    public static class EventHandler {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(ArcticMod.MODID)) {
                ConfigManager.sync(ArcticMod.MODID, Config.Type.INSTANCE);
            }
        }
    }

}
