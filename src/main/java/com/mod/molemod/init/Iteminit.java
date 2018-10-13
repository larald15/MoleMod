package com.mod.molemod.init;

import com.mod.molemod.objects.food.ItemCustomFood;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

public class Iteminit {

    //Food
    public static final Item RAW_MOLE = new ItemCustomFood("raw_mole", 3, true);
    public static final Item COOKED_MOLE = new ItemCustomFood("cooked_mole", 16, true);

    //Tools


    public void registerBlocks(RegistryEvent.Register<Block> event) {

    }

    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(RAW_MOLE);
        event.getRegistry().register(COOKED_MOLE);
    }

    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(RAW_MOLE);
        registerRender(COOKED_MOLE);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
