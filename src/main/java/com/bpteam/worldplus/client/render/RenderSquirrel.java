package com.bpteam.worldplus.client.render;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.client.models.ModelSquirrel;
import com.bpteam.worldplus.common.entities.EntitySquirrel;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSquirrel extends RenderLiving<EntitySquirrel>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(WorldPlus.MODID + ":textures/entity/squirrel.png");

    public RenderSquirrel(RenderManager manager)
    {
        super(manager, new ModelSquirrel(), 0.5F);
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