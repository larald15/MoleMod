package com.mod.molemod.init;

import com.mod.molemod.MoleMod;
import com.mod.molemod.objects.entities.EntityMole;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    public static void registerEntities() {
        registerEntity("mole", EntityMole.class, 120, 50, 1147146, 000000);
    }

    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(MoleMod.MODID, name), entity, name, id,
                MoleMod.instance, range, 1, true, color1, color2);
    }

}
