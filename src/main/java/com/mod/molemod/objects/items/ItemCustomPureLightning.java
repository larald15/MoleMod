package com.mod.molemod.objects.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.mod.molemod.init.Iteminit.HAMMER;
import static com.mod.molemod.init.Iteminit.PURE_LIGHTNING;
import static com.mod.molemod.init.Iteminit.THORS_HAMMER;

public class ItemCustomPureLightning extends Item {

    public ItemCustomPureLightning(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        Minecraft mc = Minecraft.getMinecraft();

        BlockPos blockPos = playerIn.getPosition();
        IBlockState blockState = worldIn.getBlockState(blockPos.down(1));

        ItemStack thorsHammer = new ItemStack(THORS_HAMMER, 1);

        if (blockState.getBlock() == Blocks.LAPIS_BLOCK && worldIn.getWorldInfo().isThundering()) {
            if (playerIn.inventory.hasItemStack(new ItemStack(HAMMER, 1))) {
                int slotForHammer = playerIn.inventory.getSlotFor(new ItemStack(HAMMER));

                playerIn.inventory.removeStackFromSlot(slotForHammer);
                playerIn.inventory.addItemStackToInventory(thorsHammer);
                playerIn.inventory.removeStackFromSlot(playerIn.inventory.getSlotFor(new ItemStack(PURE_LIGHTNING, 1)));

                EntityLightningBolt bolt = new EntityLightningBolt(worldIn, blockPos.getX(),
                        blockPos.getY(), blockPos.getZ(), true);

                worldIn.spawnEntity(bolt);

                worldIn.playSound(playerIn, blockPos.getX(), blockPos.getY(), blockPos.getZ(),
                        SoundEvents.ENTITY_LIGHTNING_THUNDER, SoundCategory.NEUTRAL, 1, 1);
                worldIn.playSound(playerIn, blockPos.getX(), blockPos.getY(), blockPos.getZ(),
                        SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.NEUTRAL, 1, 1);

                mc.ingameGUI.displayTitle("You are worthy!", "", 1, 1, 0);

                return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
            } else {
                mc.ingameGUI.displayTitle("You need a Sacrifice", "", 1, 1, 0);
            }
        } else {
            mc.ingameGUI.displayTitle("You are not worthy!", "", 1, 1, 0);
        }
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }

}
