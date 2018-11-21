package com.mod.molemod.objects.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemCustomRollingPin extends Item {

    public ItemCustomRollingPin(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        this.maxStackSize = 1;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        EntityPlayer playerIn = Minecraft.getMinecraft().player;

        double playerX = playerIn.posX;
        double playerY = playerIn.posY;
        double playerZ = playerIn.posZ;

        World world = attacker.getEntityWorld();

        world.playSound(playerIn, playerX, playerY, playerZ, SoundEvents.BLOCK_WOOD_PLACE,
                SoundCategory.NEUTRAL, 1, 1.5f);

        if (target.getName().equals("Zombie")) {
            if(playerIn.isCreative()) {
                target.setHealth(0f);
            } else {
                target.setHealth(0f);
                stack.setCount(stack.getCount() - 1);
            }
        }

        return false;
    }
}
