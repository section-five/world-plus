package com.bpteam.arcticmod.client.render;

import com.bpteam.arcticmod.ArcticMod;
import com.bpteam.arcticmod.client.models.ModelPenguin;
import com.bpteam.arcticmod.common.entities.EntityPenguin;
import com.bpteam.arcticmod.common.entities.EntitySeal;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSeal extends RenderLiving<EntitySeal>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(ArcticMod.MODID + ":textures/entity/seal.png");

    public RenderSeal(RenderManager manager)
    {
        super(manager, new ModelPenguin(), 0.5F);
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