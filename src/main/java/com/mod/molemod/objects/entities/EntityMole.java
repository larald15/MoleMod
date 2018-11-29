package com.mod.molemod.objects.entities;

import com.mod.molemod.MoleMod;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityMole extends EntityCow {

    public EntityMole(World worldIn) {
        super(worldIn);
    }

    @Override
    public EntityCow createChild(EntityAgeable ageable) {
        return new EntityMole(world);
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        //TO-DO new Sound
        return new SoundEvent(new ResourceLocation(MoleMod.MODID, "mole_ambient_sound"));
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        //TO-DO new Sound
        return new SoundEvent(new ResourceLocation(MoleMod.MODID, "grunt"));
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        //TO-DO new Sound
        return SoundEvents.ENTITY_COW_DEATH;
    }


}
