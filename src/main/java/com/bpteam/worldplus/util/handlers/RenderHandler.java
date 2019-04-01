package com.bpteam.worldplus.util.handlers;

import com.bpteam.worldplus.client.render.*;
import com.bpteam.worldplus.common.entities.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void RenderEntities() {
        RenderingRegistry.registerEntityRenderingHandler(EntityPenguin.class, RenderPenguin::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityWeakIceBall.class, RenderWeakIceBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityStrongIceBall.class, RenderStrongIceBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySeal.class, RenderSeal::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityWalrus.class, RenderWalrus::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityArcticFox.class, RenderArcticFox::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySnake.class, RenderSnake::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySquirrel.class, RenderSquirrel::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityWorm.class, RenderWorm::new);
    }
}
