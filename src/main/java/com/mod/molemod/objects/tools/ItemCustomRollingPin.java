package com.mod.molemod.objects.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemCustomRollingPin extends ItemAxe {

    public ItemCustomRollingPin(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

        EntityPlayer playIn = Minecraft.getMinecraft().player;

        double playerX = playIn.getPosition().getX();
        double playerY = playIn.getPosition().getY();
        double playerZ = playIn.getPosition().getZ();

        World world = attacker.getEntityWorld();
        Minecraft mc = Minecraft.getMinecraft();

        world.playSound((EntityPlayer) attacker, playerX, playerY, playerZ, SoundEvents.BLOCK_WOOD_PLACE, SoundCategory.NEUTRAL, 1, 1.5f);

        if (target.getName().equals("Zombie")) {
            target.setDead();
        }

        return false;
    }
}
