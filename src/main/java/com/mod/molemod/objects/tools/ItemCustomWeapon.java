package com.mod.molemod.objects.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemCustomWeapon extends ItemAxe {

    public ItemCustomWeapon(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        Minecraft mc = Minecraft.getMinecraft();

        mc.ingameGUI.displayTitle("Test", "", 1, 1, 1);

        return false;
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
        Vec3d aim = entityLiving.getLook(1);

        Minecraft mc = Minecraft.getMinecraft();

        mc.ingameGUI.displayTitle("Test" + aim.toString(), "", 1, 1, 1);

        return false;
    }
}
