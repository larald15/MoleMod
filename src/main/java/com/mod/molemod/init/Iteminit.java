package com.mod.molemod.init;

import com.mod.molemod.objects.food.ItemCustomFood;
import com.mod.molemod.objects.items.ItemCustom;
import com.mod.molemod.objects.tools.ItemCustomGun;
import com.mod.molemod.objects.tools.ItemCustomWeapon;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;

public class Iteminit {

    //ToolMaterial
    public static final Item.ToolMaterial hammerToolMaterial = EnumHelper.addToolMaterial("HAMMER", 0, 350,
            0, 0, 0).setRepairItem(new ItemStack(Items.IRON_INGOT));

    //Food
    public static final Item RAW_MOLE = new ItemCustomFood("raw_mole", 3, true);
    public static final Item COOKED_MOLE = new ItemCustomFood("cooked_mole", 16, true);

    //Items
    public static final Item LEATHER_SCRAP = new ItemCustom("leather_scrap", CreativeTabs.MISC);
    public static final Item LEATHER_REFINED = new ItemCustom("leather_refined", CreativeTabs.MISC);
    public static final Item BULLET = new ItemCustom("bullet", CreativeTabs.COMBAT);

    //Tools
    public static final Item HAMMER = new ItemCustomWeapon("hammer", hammerToolMaterial, 19f, -3.5f);

    //Guns
    public static final Item LEEENFIELD = new ItemCustomGun("leeenfield");

    public void registerBlocks(RegistryEvent.Register<Block> event) {

    }

    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(RAW_MOLE);
        event.getRegistry().register(COOKED_MOLE);
        event.getRegistry().register(LEATHER_SCRAP);
        event.getRegistry().register(LEATHER_REFINED);
        event.getRegistry().register(BULLET);
        event.getRegistry().register(HAMMER);
        event.getRegistry().register(LEEENFIELD);
    }

    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(RAW_MOLE);
        registerRender(COOKED_MOLE);
        registerRender(LEATHER_SCRAP);
        registerRender(LEATHER_REFINED);
        registerRender(BULLET);
        registerRender(HAMMER);
        registerRender(LEEENFIELD);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
