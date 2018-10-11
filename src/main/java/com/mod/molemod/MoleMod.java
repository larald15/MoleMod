package com.mod.molemod;

import com.mod.molemod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoleMod.MODID,
        name = MoleMod.NAME,
        version = MoleMod.VERSION)
public class MoleMod {
    public static final String MODID = "molemod";
    public static final String NAME = "Mole Mod";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static MoleMod instance;

    @SidedProxy(clientSide = "com.mod.molemod.proxy.ClientProxy",
            serverSide = "com.mod.molemod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}