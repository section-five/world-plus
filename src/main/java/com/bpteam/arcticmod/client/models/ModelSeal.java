package com.bpteam.arcticmod.client.models;

//UKMinecrafted
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSeal extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer necc;
    private final ModelRenderer head;
    private final ModelRenderer tail;
    private final ModelRenderer arms;

    public ModelSeal() {
        textureWidth = 96;
        textureHeight = 96;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -5.0F, -8.0F, 11, 5, 16, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 0, 21, -5.0F, -4.0F, -7.0F, 1, 3, 14, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 54, 0, 7.0F, -4.0F, -7.0F, 1, 3, 14, 0.0F, false));

        necc = new ModelRenderer(this);
        necc.setRotationPoint(0.0F, 24.0F, 0.0F);
        necc.cubeList.add(new ModelBox(necc, 0, 48, -3.0F, -5.0F, -9.0F, 9, 4, 1, 0.0F, false));
        necc.cubeList.add(new ModelBox(necc, 0, 38, -3.0F, -9.0F, -9.0F, 9, 4, 6, 0.0F, false));
        necc.cubeList.add(new ModelBox(necc, 30, 38, -3.0F, -6.0F, -3.0F, 9, 1, 2, 0.0F, false));

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 24.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 30, 21, -2.0F, -15.0F, -12.0F, 7, 6, 8, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 14, 60, -1.0F, -11.0F, -15.0F, 5, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 26, 64, 4.0F, -11.0F, -13.0F, 1, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 60, -1.0F, -10.0F, -14.0F, 5, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 48, 55, -1.0F, -12.0F, -14.0F, 5, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 34, 64, -2.0F, -11.0F, -13.0F, 1, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 20, 65, 5.0F, -11.0F, -13.0F, 3, 1, 0, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 40, 64, 5.0F, -10.0F, -13.0F, 1, 1, 0, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 34, 66, 6.0F, -9.0F, -13.0F, 1, 1, 0, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 40, 65, 7.0F, -8.0F, -13.0F, 1, 1, 0, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 20, 64, -5.0F, -11.0F, -13.0F, 3, 1, 0, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 38, 64, -3.0F, -10.0F, -13.0F, 1, 1, 0, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 38, 65, -4.0F, -9.0F, -13.0F, 1, 1, 0, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 38, 66, -5.0F, -8.0F, -13.0F, 1, 1, 0, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 30, 64, 1.0F, -11.0F, -16.0F, 1, 1, 1, 0.0F, false));

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, 24.0F, 0.0F);
        tail.cubeList.add(new ModelBox(tail, 38, 48, -2.0F, -3.0F, 8.0F, 7, 3, 2, 0.0F, false));
        tail.cubeList.add(new ModelBox(tail, 28, 60, 3.0F, -2.0F, 10.0F, 4, 2, 2, 0.0F, false));
        tail.cubeList.add(new ModelBox(tail, 40, 60, 0.0F, -2.0F, 10.0F, 3, 2, 2, 0.0F, false));
        tail.cubeList.add(new ModelBox(tail, 60, 60, -3.0F, -2.0F, 10.0F, 3, 2, 2, 0.0F, false));
        tail.cubeList.add(new ModelBox(tail, 50, 60, -4.0F, -2.0F, 10.0F, 3, 2, 2, 0.0F, false));
        tail.cubeList.add(new ModelBox(tail, 0, 55, 4.0F, -1.0F, 12.0F, 4, 1, 4, 0.0F, false));
        tail.cubeList.add(new ModelBox(tail, 56, 48, -5.0F, -1.0F, 12.0F, 4, 1, 4, 0.0F, false));

        arms = new ModelRenderer(this);
        arms.setRotationPoint(0.0F, 24.0F, 0.0F);
        arms.cubeList.add(new ModelBox(arms, 32, 55, 9.0F, -1.0F, -6.0F, 4, 1, 4, 0.0F, false));
        arms.cubeList.add(new ModelBox(arms, 10, 64, -8.0F, -2.0F, 3.0F, 4, 2, 1, 0.0F, false));
        arms.cubeList.add(new ModelBox(arms, 16, 55, -10.0F, -1.0F, -6.0F, 4, 1, 4, 0.0F, false));
        arms.cubeList.add(new ModelBox(arms, 20, 48, -9.0F, -2.0F, -2.0F, 4, 2, 5, 0.0F, false));
        arms.cubeList.add(new ModelBox(arms, 30, 41, 8.0F, -2.0F, -2.0F, 4, 2, 5, 0.0F, false));
        arms.cubeList.add(new ModelBox(arms, 0, 64, 7.0F, -2.0F, 3.0F, 4, 2, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        body.render(f5);
        necc.render(f5);
        head.render(f5);
        tail.render(f5);
        arms.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {

    }
}