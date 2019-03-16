package com.bpteam.worldplus.client.render;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.client.models.ModelArcticFox;
import com.bpteam.worldplus.common.entities.EntityArcticFox;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderArcticFox extends RenderLiving<EntityArcticFox>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(WorldPlus.MODID + ":textures/entity/arctic_fox.png");

    public RenderArcticFox(RenderManager manager)
    {
        super(manager, new ModelArcticFox(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityArcticFox entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityArcticFox entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}