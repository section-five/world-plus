package com.bpteam.arctic.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPenguin - UKMinecrafted
 * Created using Tabula 7.0.0
 */
public class ModelPenguin extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Wing2;
    public ModelRenderer Wing1;
    public ModelRenderer Beek;

    public ModelPenguin() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Beek = new ModelRenderer(this, 16, 7);
        this.Beek.setRotationPoint(3.9F, 1.5F, 1.0F);
        this.Beek.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 4, 14, 4, 0.0F);
        this.Wing2 = new ModelRenderer(this, 16, 0);
        this.Wing2.setRotationPoint(1.0F, 3.9F, 0.0F);
        this.Wing2.addBox(0.0F, 0.0F, -0.8F, 2, 6, 1, 0.0F);
        this.Wing1 = new ModelRenderer(this, 16, 0);
        this.Wing1.setRotationPoint(1.0F, 3.9F, 4.0F);
        this.Wing1.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Beek.render(f5);
        this.Body.render(f5);
        this.Wing2.render(f5);
        this.Wing1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
