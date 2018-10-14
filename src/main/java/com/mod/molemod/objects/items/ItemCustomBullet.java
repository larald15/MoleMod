package com.mod.molemod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArrow;

public class ItemCustomBullet extends ItemArrow {

    public ItemCustomBullet(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }
}
