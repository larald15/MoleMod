package com.mod.molemod.init;

import com.mod.molemod.objects.items.ItemCustomIngredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.IngredientNBT;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mod.molemod.init.Iteminit.*;

public class CraftingRecipes {

    //private ItemStack test = new ItemStack(LEATHER_SCRAP, 3);

    public void initShapedRecipes() {

    }

    public void initShapelessRecipes() {
        GameRegistry.addShapelessRecipe(new ResourceLocation("Refined Mole Leather"), null,
                new ItemStack(LEATHER_REFINED), new ItemCustomIngredient(new ItemStack(LEATHER_SCRAP, 3)));
    }

    public void initSmeltingRecipes() {
        GameRegistry.addSmelting(RAW_MOLE, new ItemStack(COOKED_MOLE), 500);
    }
}
