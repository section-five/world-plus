package com.bpteam.arctic.entity.render;

import com.bpteam.arctic.Reference;
import com.bpteam.arctic.entity.EntityPenguin;
import com.bpteam.arctic.entity.model.ModelPenguin;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderPenguin extends RenderLiving<EntityPenguin>
{

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/ModelPenguin.png");

    public RenderPenguin(RenderManager manager) {
        super(manager, new ModelPenguin(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityPenguin entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityPenguin entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
