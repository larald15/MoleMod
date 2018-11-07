package com.mod.molemod.objects.tools;

import com.mod.molemod.utilities.CustomTimer;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class ItemCustomThorsHammer extends ItemAxe {

    //private CustomTimer timer = new CustomTimer();

    public ItemCustomThorsHammer(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        EntityPlayer playIn = Minecraft.getMinecraft().player;

        double targetX = target.getPosition().getX();
        double targetY = target.getPosition().getY();
        double targetZ = target.getPosition().getZ();

        //spawning the particle
        World world = playIn.getEntityWorld();

        EntityLightningBolt bolt = new EntityLightningBolt(world, targetX, targetY, targetZ, false);

        world.spawnEntity(bolt);

        world.playSound(playIn, playIn.posX, playIn.posY, playIn.posZ,
                SoundEvents.ENTITY_LIGHTNING_THUNDER, SoundCategory.NEUTRAL, 1, 1);
        world.playSound(playIn, playIn.posX, playIn.posY, playIn.posZ,
                SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.NEUTRAL, 1, 1);

        stack.damageItem(0, attacker);
        return true;
    }

}
