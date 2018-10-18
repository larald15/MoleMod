package com.mod.molemod.objects.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemCustomWeapon extends ItemAxe {

    public ItemCustomWeapon(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
        Minecraft mc = Minecraft.getMinecraft();

        mc.ingameGUI.displayTitle("Test", "", 1, 1, 1);

        return false;
    }
}
