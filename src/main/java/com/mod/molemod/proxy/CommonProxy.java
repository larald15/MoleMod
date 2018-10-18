package com.mod.molemod.proxy;

import com.mod.molemod.MoleMod;
import com.mod.molemod.init.Iteminit;
import net.minecraft.block.Block;
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

    private static Iteminit iteminit = new Iteminit();

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        iteminit.registerBlocks(event);
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        iteminit.registerItems(event);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        iteminit.registerRenders(event);
    }

}