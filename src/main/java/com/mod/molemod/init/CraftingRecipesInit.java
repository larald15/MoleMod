package com.mod.molemod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mod.molemod.init.ItemInit.*;

public class CraftingRecipesInit {

    public void initShapedRecipes() {
        GameRegistry.addShapedRecipe(new ResourceLocation("Lee-Enfield"), null, new ItemStack(LEEENFIELD),
                "GGG", "XYZ", "GGG", 'X', LEEENFIELD_BARREL, 'Y', LEEENFIELD_RECEIVER, 'Z', LEEENFIELD_STOCK, 'G', Items.GUNPOWDER);
        GameRegistry.addShapedRecipe(new ResourceLocation("Lee-Enfield Barrel"), null, new ItemStack(LEEENFIELD_BARREL),
                "   ", "XYY", " X ", 'X', Blocks.OBSIDIAN, 'Y', Blocks.LOG);
        GameRegistry.addShapedRecipe(new ResourceLocation("Lee-Enfield Receiver"), null, new ItemStack(LEEENFIELD_RECEIVER),
                "XYX", "WWX", "XXY", 'X', Blocks.OBSIDIAN, 'Y', Blocks.IRON_BLOCK, 'W', Blocks.LOG);
        GameRegistry.addShapedRecipe(new ResourceLocation("Lee-Enfield Stock"), null, new ItemStack(LEEENFIELD_STOCK),
                " WX", "WWX", "WWX", 'X', Blocks.OBSIDIAN, 'W', Blocks.LOG);

        GameRegistry.addShapedRecipe(new ResourceLocation("Hammer"), null, new ItemStack(HAMMER),
                "XXX", "XYX", " Z ", 'X', Blocks.LOG, 'Y', Items.STICK, 'Z', Blocks.IRON_BLOCK);
        GameRegistry.addShapedRecipe(new ResourceLocation("Rolling Pin"), null, new ItemStack(ROLLING_PIN),
                " OS", "OOO", "SO ", 'O', Blocks.LOG, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ResourceLocation("Refined Leather"), null, new ItemStack(LEATHER_REFINED),
                "   ", "X X", " X ", 'X', LEATHER_SCRAP);
        GameRegistry.addShapedRecipe(new ResourceLocation("Bullet"), null, new ItemStack(BULLET, 2),
                " X ", " Y ", " Z ", 'X', Items.FLINT, 'Y', Items.IRON_INGOT, 'Z', Items.GUNPOWDER);
    }

    public void initShapelessRecipes() {
        GameRegistry.addShapelessRecipe(new ResourceLocation("Leather"), null,
                new ItemStack(Items.LEATHER, 6), Ingredient.fromStacks(new ItemStack(LEATHER_REFINED)));
    }


    public void initSmeltingRecipes() {
        GameRegistry.addSmelting(RAW_MOLE, new ItemStack(COOKED_MOLE), 500);

        GameRegistry.addSmelting(BULLET, new ItemStack(Items.IRON_NUGGET, 3), 500);
        GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 1), 500);
    }
}