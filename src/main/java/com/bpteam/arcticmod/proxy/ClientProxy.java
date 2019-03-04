package com.bpteam.arcticmod.proxy;

import com.bpteam.arcticmod.client.render.RenderPenguin;
import com.bpteam.arcticmod.client.render.RenderSeal;
import com.bpteam.arcticmod.client.render.RenderStrongIceBall;
import com.bpteam.arcticmod.client.render.RenderWeakIceBall;
import com.bpteam.arcticmod.common.entities.EntityPenguin;
import com.bpteam.arcticmod.common.entities.EntitySeal;
import com.bpteam.arcticmod.common.entities.EntityStrongIceBall;
import com.bpteam.arcticmod.common.entities.EntityWeakIceBall;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        entityRenders();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    private void entityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityPenguin.class, RenderPenguin::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityWeakIceBall.class, RenderWeakIceBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityStrongIceBall.class, RenderStrongIceBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySeal.class, RenderSeal::new);
    }
}