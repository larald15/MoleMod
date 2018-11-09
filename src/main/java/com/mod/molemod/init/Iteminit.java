package com.mod.molemod.init;

import com.mod.molemod.objects.food.ItemCustomFood;
import com.mod.molemod.objects.items.ItemCustom;
import com.mod.molemod.objects.items.ItemCustomPureLightning;
import com.mod.molemod.objects.tools.ItemCustomGun;
import com.mod.molemod.objects.tools.ItemCustomHammer;
import com.mod.molemod.objects.tools.ItemCustomRollingPin;
import com.mod.molemod.objects.tools.ItemCustomThorsHammer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;

public class Iteminit {

    //Material
    public static final Material moleBurrowMaterial = Material.GROUND;

    //ToolMaterial
    public static final Item.ToolMaterial hammerToolMaterial = EnumHelper.addToolMaterial("HAMMER", 0, 350,
            0, 0, 0).setRepairItem(new ItemStack(Items.IRON_INGOT));
    public static final Item.ToolMaterial thorsHammerToolMaterial = EnumHelper.addToolMaterial("THORS_HAMMER", 0, 450,
            0, 0, 0).setRepairItem(new ItemStack(Items.DIAMOND));
    public static final Item.ToolMaterial rollingPinToolMaterial = EnumHelper.addToolMaterial("ROLLING_PIN", 0, 450,
            0, 0, 0).setRepairItem(new ItemStack(Blocks.PLANKS));

    //Food
    public static final Item RAW_MOLE = new ItemCustomFood("raw_mole", 3, true);
    public static final Item COOKED_MOLE = new ItemCustomFood("cooked_mole", 16, true);

    //Items
    public static final Item LEATHER_SCRAP = new ItemCustom("leather_scrap", CreativeTabs.MISC);
    public static final Item LEATHER_REFINED = new ItemCustom("leather_refined", CreativeTabs.MISC);
    public static final Item BULLET = new ItemCustom("bullet", CreativeTabs.COMBAT);

    //Tools
    public static final Item HAMMER = new ItemCustomHammer("hammer", hammerToolMaterial, 14f, -3.5f);
    public static final Item THORS_HAMMER = new ItemCustomThorsHammer("thors_hammer", thorsHammerToolMaterial, 18f, -3.5f);
    public static final Item ROLLING_PIN = new ItemCustomRollingPin("rolling_pin", rollingPinToolMaterial, 1f, -3.5f);

    //Guns
    public static final Item LEEENFIELD = new ItemCustomGun("leeenfield");
    public static final Item LEEENFIELD_BARREL = new ItemCustom("leeenfield_barrel", CreativeTabs.MISC);

    //ActionItems
    public static final Item PURE_LIGHTNING = new ItemCustomPureLightning("pure_lightning", CreativeTabs.MISC);

    //Blocks
    //public static final Block MOLE_BURROW = new ItemCustomMoleBurrow("mole_burrow", moleBurrowMaterial, CreativeTabs.DECORATIONS);

    //ItemBlocks
    //public static final ItemBlock MOLE_BURROW_ITEM = new ItemBlock(MOLE_BURROW);

    public void registerBlocks(RegistryEvent.Register<Block> event) {
        //event.getRegistry().register(MOLE_BURROW);
    }

    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(RAW_MOLE);
        event.getRegistry().register(COOKED_MOLE);
        event.getRegistry().register(LEATHER_SCRAP);
        event.getRegistry().register(LEATHER_REFINED);
        event.getRegistry().register(BULLET);
        event.getRegistry().register(HAMMER);
        event.getRegistry().register(LEEENFIELD);
        event.getRegistry().register(LEEENFIELD_BARREL);
        event.getRegistry().register(THORS_HAMMER);
        event.getRegistry().register(PURE_LIGHTNING);
        event.getRegistry().register(ROLLING_PIN);
        //event.getRegistry().register(MOLE_BURROW_ITEM);
    }

    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(RAW_MOLE);
        registerRender(COOKED_MOLE);
        registerRender(LEATHER_SCRAP);
        registerRender(LEATHER_REFINED);
        registerRender(BULLET);
        registerRender(HAMMER);
        registerRender(LEEENFIELD);
        registerRender(LEEENFIELD_BARREL);
        registerRender(THORS_HAMMER);
        registerRender(PURE_LIGHTNING);
        registerRender(ROLLING_PIN);
        //registerRender(MOLE_BURROW_ITEM);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
