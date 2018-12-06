package com.mod.molemod.init;

import com.mod.molemod.MoleMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableInit {

    public static final ResourceLocation MOLE_LOOT = LootTableList.register(new ResourceLocation(MoleMod.MODID, "mole"));

}
