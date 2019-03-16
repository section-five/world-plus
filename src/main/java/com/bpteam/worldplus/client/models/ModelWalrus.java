package com.bpteam.worldplus.client.models;//UKMinecrafted
//Paste this code into your mod.

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWalrus extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer neccandhed;
	private final ModelRenderer arms;
	private final ModelRenderer tail;

	public ModelWalrus() {
		textureWidth = 80;
		textureHeight = 80;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -3.0F, -7.0F, 7, 3, 14, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 42, 0, -3.0F, -4.0F, -7.0F, 7, 1, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 17, -3.0F, -5.0F, -7.0F, 7, 1, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 16, 34, -3.0F, -4.0F, -8.0F, 7, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 44, 26, -3.0F, -2.0F, 7.0F, 7, 2, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 50, -5.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 18, 50, 5.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, false));

		neccandhed = new ModelRenderer(this);
		neccandhed.setRotationPoint(0.0F, 24.0F, 0.0F);
		neccandhed.cubeList.add(new ModelBox(neccandhed, 30, 17, -3.0F, -8.0F, -7.0F, 7, 3, 6, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 0, 26, -3.0F, -8.0F, -7.0F, 7, 1, 5, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 24, 26, -2.0F, -11.0F, -7.0F, 5, 3, 5, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 0, 34, -1.0F, -12.0F, -7.0F, 3, 1, 5, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 0, 40, -2.0F, -8.0F, -9.0F, 5, 1, 2, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 32, 45, -1.0F, -7.0F, -9.0F, 3, 1, 2, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 0, 45, -2.0F, -9.0F, -9.0F, 4, 1, 2, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 12, 50, 2.0F, -9.0F, -9.0F, 1, 1, 2, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 0, 50, -1.0F, -9.0F, -10.0F, 3, 1, 1, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 22, 53, 0.0F, -8.0F, -10.0F, 1, 1, 1, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 8, 50, 1.0F, -8.0F, -10.0F, 1, 4, 1, 0.0F, false));
		neccandhed.cubeList.add(new ModelBox(neccandhed, 8, 50, -1.0F, -8.0F, -10.0F, 1, 4, 1, 0.0F, false));

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 24.0F, 0.0F);
		arms.cubeList.add(new ModelBox(arms, 26, 40, 4.0F, -2.0F, -5.0F, 2, 1, 4, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 44, 34, 6.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 22, 45, 5.0F, -1.0F, -5.0F, 2, 1, 3, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 14, 40, -5.0F, -2.0F, -5.0F, 2, 1, 4, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 12, 45, -6.0F, -1.0F, -5.0F, 2, 1, 3, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 32, 34, -7.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 48, 40, -5.0F, -2.0F, 6.0F, 2, 2, 3, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 42, 45, -6.0F, -2.0F, 5.0F, 1, 2, 3, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 50, 45, 6.0F, -2.0F, 5.0F, 1, 2, 3, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 38, 40, 4.0F, -2.0F, 6.0F, 2, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		neccandhed.render(f5);
		arms.render(f5);
		tail.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}