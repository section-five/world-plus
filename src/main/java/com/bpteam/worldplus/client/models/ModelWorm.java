package com.bpteam.worldplus.client.models;//UKMinecrafted
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelWorm extends ModelBase {
	private final ModelRenderer werm;
	private final ModelRenderer head;
	private final ModelRenderer body1;
	private final ModelRenderer body2;
	private final ModelRenderer tail;

	public ModelWorm() {
		textureWidth = 16;
		textureHeight = 16;

		werm = new ModelRenderer(this);
		werm.setRotationPoint(0.0F, 24.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		werm.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 8, -9.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 4, 6, -9.0F, -2.0F, 1.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 6, -9.0F, -1.0F, 1.0F, 1, 1, 1, 0.0F, false));

		body1 = new ModelRenderer(this);
		body1.setRotationPoint(0.0F, 0.0F, 0.0F);
		werm.addChild(body1);
		body1.cubeList.add(new ModelBox(body1, 0, 6, -9.0F, -2.0F, 2.0F, 1, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 4, 4, -9.0F, -1.0F, 3.0F, 1, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 8, 4, -9.0F, -2.0F, 3.0F, 1, 1, 1, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		werm.addChild(body2);
		body2.cubeList.add(new ModelBox(body2, 0, 0, -9.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 8, 2, -9.0F, -1.0F, 5.0F, 1, 1, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 4, 2, -9.0F, -2.0F, 5.0F, 1, 1, 1, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		werm.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 0, 2, -9.0F, -2.0F, 6.0F, 1, 1, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 8, 0, -9.0F, -2.0F, 7.0F, 1, 1, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 4, 0, -9.0F, -1.0F, 8.0F, 1, 1, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 4, -9.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		werm.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}