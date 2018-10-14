package com.mod.molemod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

import static com.mod.molemod.init.Iteminit.BULLET;

public class ItemCustomGun extends ItemBow {

    public ItemCustomGun(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        setMaxStackSize(1);
        setMaxDamage(10000);
        setDamage(new ItemStack(BULLET), 1000);
    }



}
