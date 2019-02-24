package com.bpteam.arcticmod.util.handlers;

import com.bpteam.arcticmod.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {

    public static SoundEvent PENGUIN_HONK;

    public static void registerSounds() {
        PENGUIN_HONK = registerSound("honk");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
