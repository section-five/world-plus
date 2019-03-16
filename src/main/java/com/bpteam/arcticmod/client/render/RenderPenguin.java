package com.bpteam.arcticmod.client.render;

import com.bpteam.arcticmod.ArcticPlus;
import com.bpteam.arcticmod.client.models.ModelPenguin;
import com.bpteam.arcticmod.common.entities.EntityPenguin;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPenguin extends RenderLiving<EntityPenguin>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(ArcticPlus.MODID + ":textures/entity/penguin.png");

    public RenderPenguin(RenderManager manager)
    {
        super(manager, new ModelPenguin(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPenguin entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityPenguin entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}