package com.mod.molemod.proxy;

import com.mod.molemod.init.CraftingRecipesInit;
import com.mod.molemod.init.EntityInit;
import com.mod.molemod.utilities.handler.RenderHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    private CraftingRecipesInit craftingRecipesInit = new CraftingRecipesInit();

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

        craftingRecipesInit.initShapedRecipes();
        craftingRecipesInit.initShapelessRecipes();
        craftingRecipesInit.initSmeltingRecipes();

        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
    }

}
