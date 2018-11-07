package com.mod.molemod.objects.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityCustomArrow extends EntityArrow {

    public EntityCustomArrow(World world, EntityLivingBase shoot) {
        super(world, shoot);

        this.setSize(0.1f, 0.1f);
    }

    @Override
    protected ItemStack getArrowStack() {
        return ItemStack.EMPTY;
    }

}
