package com.mod.molemod.init;

import com.mod.molemod.objects.food.ItemCustomFood;
import com.mod.molemod.objects.items.ItemCustom;
import com.mod.molemod.objects.items.ItemCustomPureLightning;
import com.mod.molemod.objects.tools.ItemCustomGun;
import com.mod.molemod.objects.tools.ItemCustomHammer;
import com.mod.molemod.objects.tools.ItemCustomRollingPin;
import com.mod.molemod.objects.tools.ItemCustomThorsHammer;
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
    public static final Item.ToolMaterial HAMMER_TOOL_MATERIAL = EnumHelper.addToolMaterial("HAMMER", 0, 400,
            0, 0, 0).setRepairItem(new ItemStack(Items.IRON_INGOT));
    public static final Item.ToolMaterial THORS_HAMMER_TOOL_MATERIAL = EnumHelper.addToolMaterial("HAMMER", 0, 400,
            0, 0, 0).setRepairItem(new ItemStack(Items.DIAMOND));

    //Food
    public static final Item RAW_MOLE = new ItemCustomFood("raw_mole", 3, true);
    public static final Item COOKED_MOLE = new ItemCustomFood("cooked_mole", 16, true);

    //Items
    public static final Item LEATHER_SCRAP = new ItemCustom("leather_scrap", CreativeTabs.MISC);
    public static final Item LEATHER_REFINED = new ItemCustom("leather_refined", CreativeTabs.MISC);
    public static final Item BULLET = new ItemCustom("bullet", CreativeTabs.MISC);

    //ActionItems
    public static final Item PURE_LIGHTNING = new ItemCustomPureLightning("pure_lightning", CreativeTabs.MISC);

    //Tools
    public static final Item HAMMER = new ItemCustomHammer("hammer", HAMMER_TOOL_MATERIAL, 14f, -3.5f);
    public static final Item THORS_HAMMER = new ItemCustomThorsHammer("thors_hammer", THORS_HAMMER_TOOL_MATERIAL, 18f, -3.5f);
    public static final Item ROLLING_PIN = new ItemCustomRollingPin("rolling_pin");

    //Guns
    public static final Item LEEENFIELD = new ItemCustomGun("leeenfield");
    public static final Item LEEENFIELD_BARREL = new ItemCustom("leeenfield_barrel", CreativeTabs.MISC);
    public static final Item LEEENFIELD_RECEIVER = new ItemCustom("leeenfield_receiver", CreativeTabs.MISC);
    public static final Item LEEENFIELD_STOCK = new ItemCustom("leeenfield_stock", CreativeTabs.MISC);

    public void registerBlocks(RegistryEvent.Register<Block> event) {

    }

    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(RAW_MOLE);
        event.getRegistry().register(COOKED_MOLE);

        event.getRegistry().register(LEATHER_SCRAP);
        event.getRegistry().register(LEATHER_REFINED);

        event.getRegistry().register(BULLET);

        event.getRegistry().register(HAMMER);
        event.getRegistry().register(THORS_HAMMER);
        event.getRegistry().register(ROLLING_PIN);

        event.getRegistry().register(LEEENFIELD);
        event.getRegistry().register(LEEENFIELD_BARREL);
        event.getRegistry().register(LEEENFIELD_RECEIVER);
        event.getRegistry().register(LEEENFIELD_STOCK);

        event.getRegistry().register(PURE_LIGHTNING);
    }

    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(RAW_MOLE);
        registerRender(COOKED_MOLE);

        registerRender(LEATHER_SCRAP);
        registerRender(LEATHER_REFINED);

        registerRender(BULLET);

        registerRender(HAMMER);
        registerRender(THORS_HAMMER);
        registerRender(ROLLING_PIN);

        registerRender(LEEENFIELD);
        registerRender(LEEENFIELD_BARREL);
        registerRender(LEEENFIELD_RECEIVER);
        registerRender(LEEENFIELD_STOCK);

        registerRender(PURE_LIGHTNING);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
