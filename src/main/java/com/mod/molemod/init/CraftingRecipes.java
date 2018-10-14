package com.mod.molemod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mod.molemod.init.Iteminit.*;

public class CraftingRecipes {

    public void initShapedRecipes() {
        GameRegistry.addShapedRecipe(new ResourceLocation("Refined Leather"), null, new ItemStack(LEATHER_REFINED),
                "   ", "X X", " X ", 'X', LEATHER_SCRAP);
        GameRegistry.addShapedRecipe(new ResourceLocation("Bullet"), null, new ItemStack(BULLET, 6),
                " X ", " Y ", " Z ", 'X', Items.FLINT, 'Y', Items.IRON_INGOT, 'Z', Items.GUNPOWDER);
    }

    public void initShapelessRecipes() {
        GameRegistry.addShapelessRecipe(new ResourceLocation("Scrapped Leather"), null,
                new ItemStack(LEATHER_SCRAP, 2), Ingredient.fromStacks(new ItemStack(LEATHER_REFINED)));
    }

    public void initSmeltingRecipes() {
        GameRegistry.addSmelting(RAW_MOLE, new ItemStack(COOKED_MOLE), 500);
    }
}
