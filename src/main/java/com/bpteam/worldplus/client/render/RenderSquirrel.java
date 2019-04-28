package com.bpteam.worldplus.client.render;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.client.models.ModelSquirrel;
import com.bpteam.worldplus.common.entities.EntitySquirrel;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSquirrel extends RenderLiving<EntitySquirrel>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(WorldPlus.MODID + ":textures/entity/squirrel.png");
    public static final ModelSquirrel squirrel = new ModelSquirrel();

    public RenderSquirrel(RenderManager manager)
    {
        super(manager, new ModelSquirrel(), 0.5f);
        GlStateManager.pushMatrix();
        GlStateManager.scale(0.2,0.2,0.2);
        squirrel.render(null, 0,0f,0f,0f,0f,0.015f); // TODO Fix big model , Why is a super needed? Maybe a new render method xD
        GlStateManager.popMatrix();
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySquirrel entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntitySquirrel entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}