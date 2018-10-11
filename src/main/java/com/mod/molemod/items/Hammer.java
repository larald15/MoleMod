package com.mod.molemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Hammer extends Item {

    public Hammer(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(CreativeTabs.COMBAT);

        //this.setDamage(null, 20);
        this.setMaxDamage(100);
    }

}
