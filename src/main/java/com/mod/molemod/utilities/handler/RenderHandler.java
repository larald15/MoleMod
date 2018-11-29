package com.mod.molemod.utilities.handler;

import com.mod.molemod.objects.entities.EntityMole;
import com.mod.molemod.utilities.render.RenderMole;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityMole.class, new IRenderFactory<EntityMole>() {
            @Override
            public Render<? super EntityMole> createRenderFor(RenderManager manager) {
                return new RenderMole(manager);
            }
        });
    }

}
