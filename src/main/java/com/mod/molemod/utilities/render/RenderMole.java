package com.mod.molemod.utilities.render;

import com.mod.molemod.MoleMod;
import com.mod.molemod.objects.entities.EntityMole;
import com.mod.molemod.utilities.model.MoleModel;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderMole extends RenderLiving<EntityMole> {

    private static final ResourceLocation TEXTURES = new ResourceLocation(MoleMod.MODID + "/textures/entity/mole.png");

    public RenderMole(RenderManager manager) {
        super(manager, new MoleModel(), 0.5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityMole entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityMole entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
