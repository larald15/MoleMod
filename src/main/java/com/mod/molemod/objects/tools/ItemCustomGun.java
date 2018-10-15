package com.mod.molemod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemCustomGun extends Item {

    public ItemCustomGun(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        Vec3d aim = playerIn.getLookVec();
        EntityLargeFireball bullet = new EntityLargeFireball(worldIn, playerIn, 1, 1, 1);

        bullet.setPosition(playerIn.posX, playerIn.posY + 1.5, playerIn.posZ);
        bullet.accelerationX = aim.x * 0.1;
        bullet.accelerationY = aim.y * 0.1;
        bullet.accelerationZ = aim.z * 0.1;
        worldIn.spawnEntity(bullet);

        item.damageItem(19, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }

}
