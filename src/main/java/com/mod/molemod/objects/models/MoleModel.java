package com.mod.molemod.objects.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * MoleModel - Undefined
 * Created using Tabula 7.0.0
 */
public class MoleModel extends ModelBase {
    public ModelRenderer BodysideRight;
    public ModelRenderer BodysideLeft;
    public ModelRenderer BodysideBack;
    public ModelRenderer BodysideFace;
    public ModelRenderer Bodymain;
    public ModelRenderer HeadLayerOne;
    public ModelRenderer Misc;
    public ModelRenderer Misc_1;
    public ModelRenderer Misc_2;
    public ModelRenderer Misc_3;
    public ModelRenderer Nose;

    public MoleModel() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Misc_2 = new ModelRenderer(this, 55, 5);
        this.Misc_2.setRotationPoint(-3.0F, 10.0F, 3.0F);
        this.Misc_2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.BodysideLeft = new ModelRenderer(this, 60, 45);
        this.BodysideLeft.setRotationPoint(-5.0F, 11.0F, -3.0F);
        this.BodysideLeft.addBox(0.0F, 0.0F, 0.0F, 1, 13, 6, 0.0F);
        this.Misc_1 = new ModelRenderer(this, 35, 5);
        this.Misc_1.setRotationPoint(3.0F, 10.0F, 3.0F);
        this.Misc_1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(Misc_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.BodysideBack = new ModelRenderer(this, 46, 45);
        this.BodysideBack.setRotationPoint(-3.0F, 11.0F, 5.0F);
        this.BodysideBack.addBox(0.0F, 0.0F, 0.0F, 1, 13, 6, 0.0F);
        this.setRotateAngle(BodysideBack, 0.0F, 1.5707963267948966F, 0.0F);
        this.BodysideFace = new ModelRenderer(this, 32, 45);
        this.BodysideFace.setRotationPoint(-3.0F, 11.0F, -4.0F);
        this.BodysideFace.addBox(0.0F, 0.0F, 0.0F, 1, 13, 6, 0.0F);
        this.setRotateAngle(BodysideFace, 0.0F, 1.5707963267948966F, 0.0F);
        this.HeadLayerOne = new ModelRenderer(this, 25, 25);
        this.HeadLayerOne.setRotationPoint(-3.0F, 9.0F, -3.0F);
        this.HeadLayerOne.addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.Misc = new ModelRenderer(this, 15, 5);
        this.Misc.setRotationPoint(-3.0F, 10.0F, -4.0F);
        this.Misc.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.Misc_3 = new ModelRenderer(this, 75, 5);
        this.Misc_3.setRotationPoint(-4.0F, 10.0F, 3.0F);
        this.Misc_3.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(Misc_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.Nose = new ModelRenderer(this, 5, 5);
        this.Nose.setRotationPoint(-1.0F, 15.0F, -6.0F);
        this.Nose.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.BodysideRight = new ModelRenderer(this, 74, 45);
        this.BodysideRight.setRotationPoint(4.0F, 11.0F, -3.0F);
        this.BodysideRight.addBox(0.0F, 0.0F, 0.0F, 1, 13, 6, 0.0F);
        this.Bodymain = new ModelRenderer(this, 0, 43);
        this.Bodymain.setRotationPoint(-4.0F, 11.0F, -4.0F);
        this.Bodymain.addBox(0.0F, 0.0F, 0.0F, 8, 13, 8, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Misc_2.render(f5);
        this.BodysideLeft.render(f5);
        this.Misc_1.render(f5);
        this.BodysideBack.render(f5);
        this.BodysideFace.render(f5);
        this.HeadLayerOne.render(f5);
        this.Misc.render(f5);
        this.Misc_3.render(f5);
        this.Nose.render(f5);
        this.BodysideRight.render(f5);
        this.Bodymain.render(f5);
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
