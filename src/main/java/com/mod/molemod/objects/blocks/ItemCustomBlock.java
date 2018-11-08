package com.mod.molemod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ItemCustomBlock extends Block {

    protected String name;

    public ItemCustomBlock(String name, Material material, CreativeTabs tab) {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }

}
