package com.mod.molemod.objects.tools;

import com.mod.molemod.MoleMod;
import com.mod.molemod.objects.entities.EntityCustomArrow;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static com.mod.molemod.init.Iteminit.BULLET;

public class ItemCustomGun extends Item {

    public ItemCustomGun(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        setMaxStackSize(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        Vec3d aim = playerIn.getLookVec();
        EntityCustomArrow arrow = new EntityCustomArrow(worldIn, playerIn);

        Minecraft mc = Minecraft.getMinecraft();

        arrow.setDamage(20);
        arrow.setSilent(true);
        arrow.setPosition(playerIn.posX, playerIn.posY + 1.5, playerIn.posZ);
        arrow.shoot(aim.x, aim.y, aim.z, 10, 0);

        ResourceLocation location = new ResourceLocation(MoleMod.MODID, "lee_enfield_shot");
        SoundEvent shot = new SoundEvent(location);

        if (playerIn.isCreative()) {
            //Spawn Particles
            worldIn.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, playerIn.posX + aim.x,
                    playerIn.posY + 1.5, playerIn.posZ + aim.z, 0, 0, 0);

            //Make Sound
            worldIn.playSound(playerIn, playerIn.posX, playerIn.posY, playerIn.posZ, shot,
                    SoundCategory.getByName("shot"), 1, 1.5f);

            //Shoot Knockback


            worldIn.spawnEntity(arrow);
        } else {
            if (playerIn.inventory.hasItemStack(new ItemStack(BULLET))) {
                worldIn.spawnEntity(arrow);

                //Spawn Particles
                worldIn.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, playerIn.posX + aim.x,
                        playerIn.posY + playerIn.eyeHeight, playerIn.posZ + aim.z, 0, 0, 0);

                //Make Sound
                worldIn.playSound(playerIn, playerIn.posX, playerIn.posY, playerIn.posZ, shot,
                        SoundCategory.getByName("shot"), 5000, 1.5f);

                //Shoot Knockback


                //Reduce Bullet Amount
                int slotForBullet = playerIn.inventory.getSlotFor(new ItemStack(BULLET));
                ItemStack itemBullet = playerIn.inventory.getStackInSlot(slotForBullet);
                int size = itemBullet.getCount() - 1;

                itemBullet.setCount(size);
            } else {
                mc.ingameGUI.displayTitle("You have no ammo!", "", 1, 1, 1);
            }
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }

}
