package com.bpteam.arcticmod.client.models;//Made with Blockbench
//Paste this code into your mod.

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPenguin extends ModelBase {
	private final ModelRenderer head1;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;

	public ModelPenguin() {
		textureWidth = 32;
		textureHeight = 32;

		head1 = new ModelRenderer(this);
		head1.setRotationPoint(0.0F, 16.0F, 0.0F);
		head1.cubeList.add(new ModelBox(head1, 0, 7, -2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F, false));
		head1.cubeList.add(new ModelBox(head1, 18, 13, -1.0F, -2.5F, -3.0F, 2, 1, 1, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(2.0F, 16.0F, 0.0F);
		arm1.cubeList.add(new ModelBox(arm1, 1, 18, 0.0F, -0.5F, -1.0F, 1, 6, 2, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-2.0F, 16.0F, 0.0F);
		arm2.cubeList.add(new ModelBox(arm2, 1, 18, -1.0F, -0.5F, -1.0F, 1, 6, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 19.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 10, 23, -2.0F, -3.0F, -1.5F, 4, 6, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 13, 19, -1.5F, 2.0F, 1.5F, 3, 1, 1, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(1.0F, 22.0F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 28, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-1.0F, 22.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 28, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, false));
	}



	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head1.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}