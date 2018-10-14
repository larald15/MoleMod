package com.mod.molemod.proxy;

import com.mod.molemod.init.CraftingRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy{

    private CraftingRecipes craftingRecipes = new CraftingRecipes();

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

        craftingRecipes.initShapedRecipes();
        craftingRecipes.initShapelessRecipes();
        craftingRecipes.initSmeltingRecipes();
    }

}
