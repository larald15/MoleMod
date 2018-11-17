package com.mod.molemod.objects.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class ItemCustomHammer extends ItemAxe {

    public ItemCustomHammer(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        EntityPlayer playIn = Minecraft.getMinecraft().player;

        double targetX = target.getPosition().getX();
        double targetY = target.getPosition().getY() + playIn.eyeHeight;
        double targetZ = target.getPosition().getZ();

        //spawning the particle
        World world = playIn.getEntityWorld();
        world.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, targetX, targetY, targetZ, 0, 0, 0);
        world.playSound(playIn, playIn.posX, playIn.posY, playIn.posZ,
                SoundEvents.ITEM_SHIELD_BREAK, SoundCategory.NEUTRAL, 1, 1);

        stack.damageItem(0, attacker);
        return true;
    }

}
