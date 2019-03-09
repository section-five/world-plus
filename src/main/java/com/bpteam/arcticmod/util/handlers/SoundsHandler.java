package com.bpteam.arcticmod.util.handlers;

import com.bpteam.arcticmod.ArcticPlus;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {

    public static SoundEvent PENGUIN_HURT,PENGUIN_AMBIENT,PENGUIN_DEATH;

    public static void registerSounds() {
        PENGUIN_HURT = registerSound("penguin_hurt");
        PENGUIN_AMBIENT = registerSound("penguin_ambient");
        PENGUIN_DEATH = registerSound("penguin_death");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(ArcticPlus.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
