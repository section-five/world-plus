package com.bpteam.arcticmod.client.models;//UKMinecrafted
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelArcticFox extends ModelBase {
	private final ModelRenderer legs;
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer hed;

	public ModelArcticFox() {
		textureWidth = 64;
		textureHeight = 64;

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		legs.cubeList.add(new ModelBox(legs, 16, 37, -4.0F, -1.0F, -4.0F, 2, 1, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 36, 37, -4.0F, -3.0F, -3.0F, 2, 2, 1, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 26, 33, 0.0F, -1.0F, -4.0F, 2, 1, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 0, 37, -4.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 6, 40, -4.0F, -3.0F, 3.0F, 2, 1, 1, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 8, 37, 0.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 24, 37, 0.0F, -3.0F, 3.0F, 2, 2, 1, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 0, 40, -4.0F, -2.0F, 3.0F, 2, 1, 1, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 30, 37, 0.0F, -3.0F, -3.0F, 2, 2, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -6.0F, -3.0F, 6, 3, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 8, 35, -3.0F, -4.0F, -4.0F, 4, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 28, 0, -3.0F, -7.0F, -3.0F, 4, 1, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 40, 11, -3.0F, -6.0F, -5.0F, 4, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 12, 18, -3.0F, -8.0F, -3.0F, 4, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 24, 18, -3.0F, -6.0F, -6.0F, 4, 1, 2, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 0, 22, -3.0F, -6.0F, 5.0F, 4, 3, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 14, 11, -3.0F, -3.0F, 6.0F, 4, 1, 3, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 28, -3.0F, -5.0F, 6.0F, 4, 2, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 28, 11, -3.0F, -3.0F, 7.0F, 4, 2, 2, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 18, -3.0F, -2.0F, 9.0F, 4, 2, 2, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 36, 18, -3.0F, -4.0F, 6.0F, 4, 1, 2, 0.0F, false));

		hed = new ModelRenderer(this);
		hed.setRotationPoint(0.0F, 24.0F, 0.0F);
		hed.cubeList.add(new ModelBox(hed, 0, 11, -3.0F, -10.0F, -6.0F, 4, 4, 3, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 28, 28, -3.0F, -12.0F, -6.0F, 1, 1, 3, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 10, 28, -4.0F, -12.0F, -6.0F, 1, 2, 3, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 18, 22, -2.0F, -11.0F, -6.0F, 2, 1, 3, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 0, 33, 0.0F, -12.0F, -6.0F, 1, 1, 3, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 36, 22, 1.0F, -12.0F, -6.0F, 1, 2, 3, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 28, 22, -4.0F, -10.0F, -6.0F, 1, 3, 3, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 10, 22, 1.0F, -10.0F, -6.0F, 1, 3, 3, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 8, 33, -3.0F, -8.0F, -7.0F, 4, 1, 1, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 18, 30, -3.0F, -8.0F, -8.0F, 4, 1, 1, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 12, 40, -2.0F, -8.0F, -9.0F, 2, 1, 1, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 18, 28, -3.0F, -7.0F, -7.0F, 4, 1, 1, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 18, 33, -2.0F, -9.0F, -8.0F, 2, 1, 2, 0.0F, false));
		hed.cubeList.add(new ModelBox(hed, 20, 0, -3.0F, -11.0F, -4.0F, 4, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		legs.render(f5);
		body.render(f5);
		tail.render(f5);
		hed.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}