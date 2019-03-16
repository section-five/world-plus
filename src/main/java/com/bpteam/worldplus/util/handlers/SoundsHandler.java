package com.bpteam.worldplus.util.handlers;

import com.bpteam.worldplus.WorldPlus;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {

    public static SoundEvent PENGUIN_HURT,PENGUIN_AMBIENT,PENGUIN_DEATH,SEAL_AMBIENT;

    public static void registerSounds() {
        PENGUIN_HURT = registerSound("penguin_hurt");
        PENGUIN_AMBIENT = registerSound("penguin_ambient");
        PENGUIN_DEATH = registerSound("penguin_death");
        SEAL_AMBIENT = registerSound("seal_ambient");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(WorldPlus.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
