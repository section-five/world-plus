package com.bpteam.worldplus.client.render;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.client.models.ModelWorm;
import com.bpteam.worldplus.common.entities.EntityWorm;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderWorm extends RenderLiving<EntityWorm>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(WorldPlus.MODID + ":textures/entity/worm.png");

    public RenderWorm(RenderManager manager)
    {
        super(manager, new ModelWorm(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityWorm entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityWorm entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}