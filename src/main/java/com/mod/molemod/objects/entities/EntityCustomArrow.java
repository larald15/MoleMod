package com.mod.molemod.objects.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySpectralArrow;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityCustomArrow extends EntitySpectralArrow {


    private int duration = 1;

    public EntityCustomArrow(World world, EntityLivingBase shoot) {
        super(world, shoot);
    }

    protected void arrowHit(EntityLivingBase living) {
        super.arrowHit(living);
        PotionEffect potioneffect = new PotionEffect(MobEffects.GLOWING, this.duration, 0);
        living.addPotionEffect(potioneffect);
    }

    protected ItemStack getArrowStack() {
        return ItemStack.EMPTY;
    }

}
