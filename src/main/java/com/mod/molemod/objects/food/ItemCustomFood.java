package com.mod.molemod.objects.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood {

    public ItemCustomFood(String name, int amount, boolean isWolfFood) {
        super(amount, isWolfFood);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
    }

}
