package com.bpteam.worldplus.client.models;//UKMinecrafted
//Paste this code into your mod.

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSnake extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer jaw;

	public ModelSnake() {
		textureWidth = 48;
		textureHeight = 48;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -2.0F, 0.0F, 2, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 14, 0, 0.0F, -2.0F, 5.0F, 2, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 14, -1.0F, -2.0F, 10.0F, 2, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 14, 7, 0.0F, -2.0F, 15.0F, 2, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 7, -1.0F, -2.0F, 20.0F, 2, 2, 5, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 20, 21, -2.0F, -2.0F, -1.0F, 4, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 25, -2.0F, -2.0F, -1.0F, 4, 2, 0, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 28, 14, -1.0F, -3.0F, -4.0F, 2, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 14, 14, -2.0F, -2.0F, -4.0F, 4, 2, 3, 0.0F, false));

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 24.0F, 0.0F);
		jaw.cubeList.add(new ModelBox(jaw, 10, 21, -1.0F, -1.0F, -7.0F, 2, 1, 3, 0.0F, false));
		jaw.cubeList.add(new ModelBox(jaw, 0, 21, -1.0F, -2.0F, -7.0F, 2, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		head.render(f5);
		jaw.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}