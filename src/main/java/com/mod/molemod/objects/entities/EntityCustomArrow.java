package com.mod.molemod.objects.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySpectralArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static com.mod.molemod.init.Iteminit.BULLET;

public class EntityCustomArrow extends EntitySpectralArrow {

    public EntityCustomArrow(World world, EntityLivingBase shoot) {
        super(world, shoot);
    }

    protected ItemStack getArrowStack()
    {
        return ItemStack.EMPTY;
        //return new ItemStack(BULLET);
    }

}
