package com.bpteam.worldplus.client.render;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.client.models.ModelSnake;
import com.bpteam.worldplus.common.entities.EntitySnake;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSnake extends RenderLiving<EntitySnake>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(WorldPlus.MODID + ":textures/entity/snake.png");

    public RenderSnake(RenderManager manager)
    {
        super(manager, new ModelSnake(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySnake entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntitySnake entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}