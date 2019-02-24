package com.bpteam.arcticmod.util.handlers;

import com.bpteam.arcticmod.client.render.RenderPenguin;
import com.bpteam.arcticmod.common.entities.EntityPenguin;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityPenguin.class, new IRenderFactory<EntityPenguin>() {
            @Override
            public Render<? super EntityPenguin> createRenderFor(RenderManager manager) {
                return new RenderPenguin(manager);
            }
        });
    }
}
