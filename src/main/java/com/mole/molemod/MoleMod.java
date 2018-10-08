package com.mole.molemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = com.mole.molemod.MoleMod.MODID,
        name = com.mole.molemod.MoleMod.NAME,
        version = com.mole.molemod.MoleMod.VERSION)
public class MoleMod {
    public static final String MODID = "molemod";
    public static final String NAME = "Mole Mod";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
}