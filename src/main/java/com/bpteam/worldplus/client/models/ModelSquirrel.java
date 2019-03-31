package com.bpteam.worldplus.client.models;//Made by Ben1Ben1  :D
//Paste this code into your mod.

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSquirrel extends ModelBase {
	private final ModelRenderer squirrel;
	private final ModelRenderer tail;
	private final ModelRenderer legs;

	public ModelSquirrel() {
		textureWidth = 64;
		textureHeight = 64;

		squirrel = new ModelRenderer(this);
		squirrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		squirrel.cubeList.add(new ModelBox(squirrel, 0, 0, -5.0F, -8.0F, -5.0F, 5, 5, 10, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 18, 15, -5.0F, -13.0F, -9.0F, 5, 5, 4, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 0, 44, -1.0F, -15.0F, -7.0F, 1, 2, 1, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 4, 44, -5.0F, -15.0F, -7.0F, 1, 2, 1, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 12, 33, -5.0F, -11.0F, -11.0F, 5, 2, 1, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 16, 39, -4.0F, -12.0F, -11.0F, 3, 4, 1, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 32, 39, -4.0F, -11.0F, -12.0F, 3, 2, 1, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 0, 33, -5.0F, -12.0F, -10.0F, 5, 4, 1, 0.0F, false));
		squirrel.cubeList.add(new ModelBox(squirrel, 24, 33, -4.0F, -13.0F, -10.0F, 3, 5, 1, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail, -0.1745F, 0.0F, 0.0F);
		squirrel.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 18, 25, -4.0F, -10.0F, 3.0F, 3, 4, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 25, -5.0F, -12.0F, 5.0F, 5, 4, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 30, 0, -5.0F, -15.0F, 6.0F, 5, 6, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 15, -5.0F, -18.0F, 4.0F, 5, 6, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 36, 15, -5.0F, -19.0F, 2.0F, 5, 5, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 32, 25, -5.0F, -21.0F, 3.0F, 5, 3, 3, 0.0F, false));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		squirrel.addChild(legs);
		legs.cubeList.add(new ModelBox(legs, 32, 33, -2.0F, -3.0F, -5.0F, 2, 3, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 24, 39, -5.0F, -3.0F, -5.0F, 2, 3, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 0, 39, -5.0F, -3.0F, 3.0F, 2, 3, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 8, 39, -2.0F, -3.0F, 3.0F, 2, 3, 2, 0.0F, false));
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