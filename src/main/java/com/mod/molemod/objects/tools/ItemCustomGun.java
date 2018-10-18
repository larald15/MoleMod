package com.mod.molemod.objects.tools;

import com.mod.molemod.objects.entities.EntityCustomArrow;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
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
        EntityCustomArrow arrow = new EntityCustomArrow(worldIn, playerIn);

        Minecraft mc = Minecraft.getMinecraft();

        arrow.setDamage(20);
        arrow.setPosition(playerIn.posX, playerIn.posY + 1.5, playerIn.posZ);
        arrow.shoot(aim.x, aim.y, aim.z, 10, 0);

        if (playerIn.isCreative()) {
            worldIn.spawnEntity(arrow);
        } else if (playerIn.inventory.hasItemStack(new ItemStack(BULLET))) {
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
