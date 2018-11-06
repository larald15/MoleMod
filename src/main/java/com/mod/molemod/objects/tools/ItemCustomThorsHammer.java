package com.mod.molemod.objects.tools;

import com.mod.molemod.utilities.CustomTimer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleCrit;
import net.minecraft.client.particle.ParticleDragonBreath;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;

import java.util.Timer;

public class ItemCustomThorsHammer extends ItemAxe {

    private CustomTimer timer = new CustomTimer();

    public ItemCustomThorsHammer(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {

        Vec3d aim = entityLiving.getLook(1);

        EntityPlayer playIn = Minecraft.getMinecraft().player;

        //get position of the player and adding the aim vector
        double playerX = playIn.getPosition().getX();
        double playerY = playIn.getPosition().getY();
        double playerZ = playIn.getPosition().getZ();
        double x = playerX +       aim.x * 4;
        double y = playerY +       aim.y    ;
        double z = playerZ +       aim.z * 4;

        if(timer.miliSecondsPassed(3000)) {

            //spawning the bolt
            World world = entityLiving.getEntityWorld();
            EntityLightningBolt bolt = new EntityLightningBolt(world, x, y, z, false);
            world.spawnEntity(bolt);
            world.playSound((EntityPlayer) entityLiving, playerX, playerY, playerZ, SoundEvents.ENTITY_LIGHTNING_THUNDER, SoundCategory.NEUTRAL, 1, 1);
            world.playSound((EntityPlayer) entityLiving, playerX, playerY, playerZ, SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.NEUTRAL, 1, 1);
            //world.playSound(playerX, playerY, playerZ, SoundEvents.ITEM_SHIELD_BREAK, SoundCategory.NEUTRAL, 1, 1, false);

        }

        return false;
    }

}
