package com.mod.molemod.proxy;

import com.mod.molemod.MoleMod;
import com.mod.molemod.items.Hammer;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = MoleMod.MODID)
public class CommonProxy {

    public static Item HAMMER = new Hammer("Hammer");

    public void preInit(FMLPreInitializationEvent event) {}
    public void init(FMLInitializationEvent event) {}
    public void postInit(FMLPostInitializationEvent event) {}

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        //event.getRegistry().registerAll( new Block );
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        //event.getRegistry().registerAll(HAMMER);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        //registerRender(HAMMER);
        //registerRender(Item.getItemFromBlock(FLINT_STONE_BLOCK));
    }

    private static void registerRender(Item item)
    {
        /*
        ModelLoader.setCustomModelResourceLocation(item,0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
                */
    }
}