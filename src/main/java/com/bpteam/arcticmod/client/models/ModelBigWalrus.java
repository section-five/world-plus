package com.bpteam.arcticmod.client.models;//UKMinecrafted
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelBigWalrus extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer ModelWalrus;
	private final ModelRenderer arms;
	private final ModelRenderer tail;

	public ModelBigWalrus() {
		textureWidth = 112;
		textureHeight = 112;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -4.0F, -10.5F, 10, 4, 21, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 62, 0, -4.5F, -5.5F, -10.5F, 10, 1, 15, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 25, -4.5F, -7.0F, -10.5F, 10, 1, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 49, -4.5F, -5.5F, -12.0F, 10, 4, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 62, 38, -4.5F, -3.0F, 10.5F, 10, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 18, 71, -7.5F, -3.0F, 7.5F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 71, 7.5F, -3.0F, 7.5F, 1, 3, 1, 0.0F, false));

		ModelWalrus = new ModelRenderer(this);
		ModelWalrus.setRotationPoint(0.0F, 24.0F, 0.0F);
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 44, 25, -4.5F, -11.5F, -10.5F, 10, 4, 9, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 0, 38, -4.5F, -11.5F, -10.5F, 10, 1, 7, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 34, 38, -3.0F, -16.0F, -10.5F, 7, 4, 7, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 0, 49, -1.5F, -17.5F, -10.5F, 4, 1, 7, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 36, 57, -3.0F, -11.5F, -13.5F, 7, 1, 3, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 42, 64, -1.5F, -10.0F, -13.5F, 4, 1, 3, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 56, 57, -3.0F, -13.0F, -13.5F, 6, 1, 3, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 0, 71, 3.0F, -13.0F, -13.5F, 1, 1, 3, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 0, 75, -1.5F, -13.0F, -15.0F, 4, 1, 1, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 22, 75, 0.0F, -11.5F, -15.0F, 1, 1, 1, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 10, 71, 1.5F, -12.0F, -15.0F, 1, 6, 1, 0.0F, false));
		ModelWalrus.cubeList.add(new ModelBox(ModelWalrus, 14, 71, -1.5F, -12.0F, -15.0F, 1, 6, 1, 0.0F, false));

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 24.0F, 0.0F);
		arms.cubeList.add(new ModelBox(arms, 62, 49, 6.0F, -2.5F, -7.5F, 3, 1, 6, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 44, 49, 9.0F, -1.0F, -4.5F, 3, 1, 6, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 14, 64, 7.5F, -1.0F, -7.5F, 3, 1, 4, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 0, 57, -7.5F, -2.5F, -7.5F, 3, 1, 6, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 28, 64, -9.0F, -1.0F, -7.5F, 3, 1, 4, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 18, 57, -10.5F, -1.0F, -4.5F, 3, 1, 6, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 74, 57, -7.5F, -3.0F, 9.0F, 3, 3, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 66, 64, -9.0F, -3.0F, 7.5F, 1, 3, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 56, 64, 9.0F, -3.0F, 7.5F, 1, 3, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 64, 6.0F, -3.0F, 9.0F, 3, 3, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		ModelWalrus.render(f5);
		arms.render(f5);
		tail.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}