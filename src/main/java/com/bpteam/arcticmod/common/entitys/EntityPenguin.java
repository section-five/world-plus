package com.bpteam.arcticmod.common.entitys;//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class EntityPenguin extends ModelBase {
	private final ModelRenderer head-1;
	private final ModelRenderer arm-1;
	private final ModelRenderer arm-2;
	private final ModelRenderer body;
	private final ModelRenderer leg-1;
	private final ModelRenderer leg-2;

	public unknown() {
		textureWidth = 32;
		textureHeight = 32;

		head-1 = new ModelRenderer(this);
		head-1.setRotationPoint(0.0F, 16.0F, 0.0F);
		head-1.cubeList.add(new ModelBox(head-1, 0, 7, -2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F, false));
		head-1.cubeList.add(new ModelBox(head-1, 18, 13, -1.0F, -2.5F, -3.0F, 2, 1, 1, 0.0F, false));

		arm-1 = new ModelRenderer(this);
		arm-1.setRotationPoint(2.0F, 16.0F, 0.0F);
		arm-1.cubeList.add(new ModelBox(arm-1, 1, 18, 0.0F, -0.5F, -1.0F, 1, 6, 2, 0.0F, false));

		arm-2 = new ModelRenderer(this);
		arm-2.setRotationPoint(-2.0F, 16.0F, 0.0F);
		arm-2.cubeList.add(new ModelBox(arm-2, 1, 18, -1.0F, -0.5F, -1.0F, 1, 6, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 19.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 10, 23, -2.0F, -3.0F, -1.5F, 4, 6, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 13, 19, -1.5F, 2.0F, 1.5F, 3, 1, 1, 0.0F, false));

		leg-1 = new ModelRenderer(this);
		leg-1.setRotationPoint(1.0F, 22.0F, 0.0F);
		leg-1.cubeList.add(new ModelBox(leg-1, 0, 28, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, false));

		leg-2 = new ModelRenderer(this);
		leg-2.setRotationPoint(-1.0F, 22.0F, 0.0F);
		leg-2.cubeList.add(new ModelBox(leg-2, 0, 28, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head-1.render(f5);
		arm-1.render(f5);
		arm-2.render(f5);
		body.render(f5);
		leg-1.render(f5);
		leg-2.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}