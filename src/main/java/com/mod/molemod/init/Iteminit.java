package com.mod.molemod.init;

import com.mod.molemod.objects.food.ItemCustomFood;
import com.mod.molemod.objects.items.ItemCustom;
import com.mod.molemod.objects.tools.ItemCustomWeapon;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;

public class Iteminit {

    //ToolMaterial
    public static final Item.ToolMaterial hammerToolMaterial = EnumHelper.addToolMaterial("HAMMER", 3, 400, 12, 30, 0);

    //Food
    public static final Item RAW_MOLE = new ItemCustomFood("raw_mole", 3, true);
    public static final Item COOKED_MOLE = new ItemCustomFood("cooked_mole", 16, true);

    //Items
    public static final Item LEATHER_SCRAP = new ItemCustom("leather_scrap");
    public static final Item LEATHER_REFINED = new ItemCustom("leather_refined");

    //Tools
    public static final Item HAMMER = new ItemCustomWeapon("hammer", hammerToolMaterial);

    public void registerBlocks(RegistryEvent.Register<Block> event) {

    }

    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(RAW_MOLE, COOKED_MOLE);
        event.getRegistry().register(HAMMER);
        event.getRegistry().registerAll(LEATHER_SCRAP, LEATHER_REFINED);
    }

    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(RAW_MOLE);
        registerRender(COOKED_MOLE);
        registerRender(HAMMER);
        registerRender(LEATHER_SCRAP);
        registerRender(LEATHER_REFINED);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
