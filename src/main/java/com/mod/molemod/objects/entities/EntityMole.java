package com.mod.molemod.objects.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import static com.mod.molemod.init.ItemInit.*;

public class EntityMole extends EntityPig {

    public EntityMole(World worldIn) {
        super(worldIn);
        this.setScaleForAge(true);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAITempt(this, 2.0D, Items.CARROT_ON_A_STICK, false));
        this.tasks.addTask(5, new EntityAIFollowParent(this, 1.1D));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 25.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }

    @Override
    public void onDeath(DamageSource cause) {
        super.onDeath(cause);

        this.dropItem(RAW_MOLE, 1);
        this.dropItem(LEATHER_SCRAP, 2);
    }

    @Override
    public EntityPig createChild(EntityAgeable ageable) {
        return new EntityMole(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return null;
        //return new SoundEvent(new ResourceLocation(MoleMod.MODID, "mole_ambient_sound"));
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
        //return new SoundEvent(new ResourceLocation(MoleMod.MODID, "grunt"));
    }

    @Override
    protected SoundEvent getDeathSound() {
        return null;
        //return new SoundEvent(new ResourceLocation(MoleMod.MODID, "mole_death_sound"));
    }

    @Override
    protected ResourceLocation getLootTable() {
        return null;
    }
}
