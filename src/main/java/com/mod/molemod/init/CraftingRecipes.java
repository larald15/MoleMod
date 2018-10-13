package com.mod.molemod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mod.molemod.init.Iteminit.COOKED_MOLE;
import static com.mod.molemod.init.Iteminit.RAW_MOLE;

public class CraftingRecipes {

    public void initShapedRecipes() {

    }

    public void initShapelessRecipes() {

    }

    public void initSmeltingRecipes() {
        GameRegistry.addSmelting(RAW_MOLE, new ItemStack(COOKED_MOLE), 100);
    }
}
