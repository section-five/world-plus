package com.bpteam.arcticmod.client.render;

import com.bpteam.arcticmod.ArcticPlus;
import com.bpteam.arcticmod.client.models.ModelSeal;
import com.bpteam.arcticmod.common.entities.EntitySeal;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSeal extends RenderLiving<EntitySeal>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(ArcticPlus.MODID + ":textures/entity/seal.png");

    public RenderSeal(RenderManager manager)
    {
        super(manager, new ModelSeal(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySeal entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntitySeal entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}