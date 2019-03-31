package com.bpteam.worldplus.client.models;//Made by Ben1Ben1  :D
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSquirrel extends ModelBase {
	private final ModelRenderer squirrel;
	private final ModelRenderer tail;
	private final ModelRenderer legs;

	public ModelSquirrel() {
		textureWidth = 32;
		textureHeight = 32;

		squirrel = new ModelRenderer(this);
		squirrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		squirrel.cubeList.add(new ModelBox(squirrel, 0, 0, -2.5F, -3.5F, -2.5F, 2, 2, 5, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 8, 7, -2.5F, -6.0F, -4.5F, 2, 2, 2, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 2, 20, -0.5F, -7.5F, -3.5F, 0, 1, 0, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 2, 20, -2.5F, -7.5F, -3.5F, 0, 1, 0, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 8, 18, -2.5F, -5.5F, -5.5F, 2, 1, 0, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 14, 18, -2.0F, -6.0F, -5.5F, 1, 2, 0, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 0, 23, -2.0F, -5.5F, -6.0F, 1, 1, 0, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 0, 18, -2.5F, -6.0F, -5.0F, 2, 2, 0, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 12, 18, -2.0F, -6.0F, -5.0F, 1, 2, 0, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail, -0.1745F, 0.0F, 0.0F);
		squirrel.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 16, 12, -2.0F, -5.0F, 1.5F, 1, 2, 2, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 12, -2.5F, -6.0F, 2.5F, 2, 2, 2, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 14, 0, -2.5F, -7.5F, 3.0F, 2, 3, 2, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 7, -2.5F, -9.0F, 2.0F, 2, 3, 2, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 8, 12, -2.5F, -9.0F, 1.0F, 2, 2, 2, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 16, -2.5F, -10.0F, 1.5F, 2, 1, 1, 0.0F, false));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		squirrel.addChild(legs);
		legs.cubeList.add(new ModelBox(legs, 4, 18, -1.0F, -1.0F, -2.5F, 1, 1, 1, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 14, 16, -2.5F, -1.0F, -2.5F, 1, 1, 1, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 10, 16, -2.5F, -1.0F, 1.5F, 1, 1, 1, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 6, 16, -1.0F, -1.0F, 1.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		squirrel.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}