package com.mod.molemod.objects.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static com.mod.molemod.init.Iteminit.BULLET;

public class ItemCustomGun extends Item {

    public ItemCustomGun(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        setMaxStackSize(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        Vec3d aim = playerIn.getLookVec();
        //EntityLargeFireball bullet = new EntityLargeFireball(worldIn, playerIn, 1, 1, 1);
        EntityArrow arrow = new EntityArrow(worldIn) {
            @Override
            protected ItemStack getArrowStack() {
                return new ItemStack(BULLET);
            }
        };

        Minecraft mc = Minecraft.getMinecraft();

        arrow.arrowShake = 1;
        arrow.setDamage(100);

        //bullet.accelerationX = aim.x * 0.1;
        //bullet.accelerationY = aim.y * 0.1;
        //bullet.accelerationZ = aim.z * 0.1;

        if (playerIn.inventory.hasItemStack(new ItemStack(BULLET))) {
            //worldIn.spawnEntity(bullet);
            worldIn.spawnEntity(arrow);

            int slotForBullet = playerIn.inventory.getSlotFor(new ItemStack(BULLET));
            ItemStack itemBullet = playerIn.inventory.getStackInSlot(slotForBullet);

            int size = itemBullet.getCount() - 1;
            itemBullet.setCount(size);
        } else {
            mc.ingameGUI.displayTitle("You have no ammo!", "", 1, 1, 1);
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }

}
