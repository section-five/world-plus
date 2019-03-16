package com.bpteam.arcticmod.util.handlers;

import com.bpteam.arcticmod.client.render.*;
import com.bpteam.arcticmod.common.entities.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void RenderEntities() {
        RenderingRegistry.registerEntityRenderingHandler(EntityPenguin.class, RenderPenguin::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityWeakIceBall.class, RenderWeakIceBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityStrongIceBall.class, RenderStrongIceBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySeal.class, RenderSeal::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityWalrus.class, RenderWalrus::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityArcticFox.class, RenderArcticFox::new);
    }
}
