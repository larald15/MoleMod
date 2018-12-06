package com.mod.molemod.objects.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

import static com.mod.molemod.init.LootTableInit.MOLE_LOOT;

public class EntityMole extends EntityCow {

    public EntityMole(World worldIn) {
        super(worldIn);
    }

    @Override
    public EntityCow createChild(EntityAgeable ageable) {
        return new EntityMole(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_COW_AMBIENT;
        //return new SoundEvent(new ResourceLocation(MoleMod.MODID, "mole_ambient_sound"));
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_COW_HURT;
        //return new SoundEvent(new ResourceLocation(MoleMod.MODID, "grunt"));
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_COW_DEATH;
        //return new SoundEvent(new ResourceLocation(MoleMod.MODID, "mole_death_sound"));
    }

    @Nullable
    protected ResourceLocation getLootTable() {
        return MOLE_LOOT;
    }
}
