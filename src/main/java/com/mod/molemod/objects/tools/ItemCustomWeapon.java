package com.mod.molemod.objects.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
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
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
        Vec3d aim = entityLiving.getLook(1);

        EntityPlayer playIn = Minecraft.getMinecraft().player;

        //get position of the player and adding the aim vector
        double x = playIn.getPosition().getX() + aim.x * 3;
        double y = playIn.getPosition().getY() + 1.5 + aim.y * 3;
        double z = playIn.getPosition().getZ() + aim.z * 3;

        //spawning the particle
        World world = entityLiving.getEntityWorld();
        world.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, x, y, z, 0, 0, 0);

        return false;
    }
}
