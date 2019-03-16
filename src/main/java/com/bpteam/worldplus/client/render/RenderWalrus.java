package com.bpteam.worldplus.client.render;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.client.models.ModelWalrus;
import com.bpteam.worldplus.common.entities.EntityWalrus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderWalrus extends RenderLiving<EntityWalrus>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(WorldPlus.MODID + ":textures/entity/walrus.png");

    public RenderWalrus(RenderManager manager)
    {
        super(manager, new ModelWalrus(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityWalrus entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityWalrus entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}