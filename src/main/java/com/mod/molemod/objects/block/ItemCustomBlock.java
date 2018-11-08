package com.mod.molemod.objects.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCustomBlock extends Block {

    protected String name;

    public ItemCustomBlock(String name, Material material, CreativeTabs tab){
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }

}
