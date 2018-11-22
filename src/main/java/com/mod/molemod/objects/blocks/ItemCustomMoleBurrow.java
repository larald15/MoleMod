package com.mod.molemod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ItemCustomMoleBurrow extends Block {

    public ItemCustomMoleBurrow(String name, Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        setHardness(1f);
        setResistance(4f);
    }

}
