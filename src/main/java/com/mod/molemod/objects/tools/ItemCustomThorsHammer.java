package com.mod.molemod.objects.tools;

import com.mod.molemod.MoleMod;
import com.mod.molemod.utilities.custom.CustomTimer;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;

import java.util.Random;

public class ItemCustomThorsHammer extends ItemAxe {

    private long startTime = Long.MAX_VALUE, endTime = Long.MIN_VALUE;
    private boolean firstTime = true;

    public ItemCustomThorsHammer(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (firstTime && isSelected) {
            startTime = worldIn.getWorldTime();
            firstTime = false;
        } else if (!isSelected) {
            firstTime = true;
        }
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        EntityPlayer playIn = Minecraft.getMinecraft().player;

        World worldIn = playIn.getEntityWorld();

        double targetX = target.getPosition().getX();
        double targetY = target.getPosition().getY();
        double targetZ = target.getPosition().getZ();

        CustomTimer customTimer = new CustomTimer();
        endTime = worldIn.getWorldTime();

        if (customTimer.checkTime(startTime, endTime, playIn)) {
            //spawning the particle
            EntityLightningBolt bolt = new EntityLightningBolt(worldIn, targetX, targetY, targetZ, false);

            worldIn.spawnEntity(bolt);

            worldIn.playSound(playIn, playIn.posX, playIn.posY, playIn.posZ,
                    SoundEvents.ENTITY_LIGHTNING_THUNDER, SoundCategory.NEUTRAL, 1, 1);
            worldIn.playSound(playIn, playIn.posX, playIn.posY, playIn.posZ,
                    SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.NEUTRAL, 1, 1);

            firstTime = true;

            stack.damageItem(0, attacker);
            return true;
        } else {
            playIn.performHurtAnimation();
            playIn.dropItem(true);
            playIn.knockBack(playIn, 10, 2, 2);

            playHitSound(playIn);

            firstTime = true;

            return false;
        }
    }

    private void playHitSound(EntityPlayer playerIn) {
        Random r = new Random();
        int random = r.nextInt(((99 - 1) + 1) + 1);

        ResourceLocation location;
        SoundEvent sound;

        if (random >= 1 && random <= 33) {
            location = new ResourceLocation(MoleMod.MODID, "hit_1");
            sound = new SoundEvent(location);

            playerIn.playSound(sound, 1, 1);
        } else if (random >= 34 && random <= 66) {
            location = new ResourceLocation(MoleMod.MODID, "hit_2");
            sound = new SoundEvent(location);

            playerIn.playSound(sound, 1, 1);
        } else if (random >= 67 && random <= 99) {
            location = new ResourceLocation(MoleMod.MODID, "hit_3");
            sound = new SoundEvent(location);

            playerIn.playSound(sound, 1, 1);
        }
    }

}
