package com.mod.molemod.objects.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * MoleModel - Undefined
 * Created using Tabula 7.0.0
 */
public class MoleModel extends ModelBase {
    private ModelRenderer Misc;
    private ModelRenderer BodysideRight;
    private ModelRenderer BodysideLeft;
    private ModelRenderer BodysideBack;
    private ModelRenderer BodysideFace;
    private ModelRenderer Bodymain;
    private ModelRenderer HeadLayerOne;
    private ModelRenderer HeadLayerTwo;
    private ModelRenderer Misc_1;
    private ModelRenderer Misc_2;
    private ModelRenderer Misc_3;
    private ModelRenderer Misc_4;
    private ModelRenderer Nose;

    public MoleModel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.BodysideFace = new ModelRenderer(this, 0, 0);
        this.BodysideFace.setRotationPoint(-3.0F, 11.0F, -4.0F);
        this.BodysideFace.addBox(0.0F, 0.0F, 0.0F, 1, 13, 6, 0.0F);
        this.setRotateAngle(BodysideFace, 0.0F, 1.5707963267948966F, 0.0F);
        this.HeadLayerOne = new ModelRenderer(this, 0, 0);
        this.HeadLayerOne.setRotationPoint(-3.0F, 10.0F, -3.0F);
        this.HeadLayerOne.addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.Bodymain = new ModelRenderer(this, 0, 0);
        this.Bodymain.setRotationPoint(-4.0F, 11.0F, -4.0F);
        this.Bodymain.addBox(0.0F, 0.0F, 0.0F, 8, 13, 8, 0.0F);
        this.BodysideLeft = new ModelRenderer(this, 0, 0);
        this.BodysideLeft.setRotationPoint(-5.0F, 11.0F, -3.0F);
        this.BodysideLeft.addBox(0.0F, 0.0F, 0.0F, 1, 13, 6, 0.0F);
        this.HeadLayerTwo = new ModelRenderer(this, 0, 0);
        this.HeadLayerTwo.setRotationPoint(-3.0F, 9.0F, -3.0F);
        this.HeadLayerTwo.addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.BodysideBack = new ModelRenderer(this, 0, 0);
        this.BodysideBack.setRotationPoint(-3.0F, 11.0F, 5.0F);
        this.BodysideBack.addBox(0.0F, 0.0F, 0.0F, 1, 13, 6, 0.0F);
        this.setRotateAngle(BodysideBack, 0.0F, 1.5707963267948966F, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 0);
        this.Nose.setRotationPoint(-1.0F, 15.0F, -6.0F);
        this.Nose.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Misc_1 = new ModelRenderer(this, 0, 0);
        this.Misc_1.setRotationPoint(-3.0F, 10.0F, -4.0F);
        this.Misc_1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.Misc_2 = new ModelRenderer(this, 0, 0);
        this.Misc_2.setRotationPoint(3.0F, 10.0F, 3.0F);
        this.Misc_2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(Misc_2, 0.0F, 1.5707963267948966F, 0.0F);
        this.Misc = new ModelRenderer(this, 0, 0);
        this.Misc.setRotationPoint(-5.0F, 11.0F, -3.0F);
        this.Misc.addBox(0.0F, 0.0F, 0.0F, 3, 14, 1, 0.0F);
        this.setRotateAngle(Misc, 0.0F, 0.7853981633974483F, 0.0F);
        this.BodysideRight = new ModelRenderer(this, 0, 0);
        this.BodysideRight.setRotationPoint(4.0F, 11.0F, -3.0F);
        this.BodysideRight.addBox(0.0F, 0.0F, 0.0F, 1, 13, 6, 0.0F);
        this.Misc_3 = new ModelRenderer(this, 0, 0);
        this.Misc_3.setRotationPoint(-3.0F, 10.0F, 3.0F);
        this.Misc_3.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.Misc_4 = new ModelRenderer(this, 0, 0);
        this.Misc_4.setRotationPoint(-4.0F, 10.0F, 3.0F);
        this.Misc_4.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(Misc_4, 0.0F, 1.5707963267948966F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BodysideFace.render(f5);
        this.HeadLayerOne.render(f5);
        this.Bodymain.render(f5);
        this.BodysideLeft.render(f5);
        this.HeadLayerTwo.render(f5);
        this.BodysideBack.render(f5);
        this.Nose.render(f5);
        this.Misc_1.render(f5);
        this.Misc_2.render(f5);
        this.Misc.render(f5);
        this.BodysideRight.render(f5);
        this.Misc_3.render(f5);
        this.Misc_4.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of models parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
