package com.example.mod;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NullSoldierRenderer extends MobRenderer<NullSoldier, NullSoldierModel<NullSoldier>> {
    public NullSoldierRenderer(EntityRendererProvider.Context context) {
        super(context, new NullSoldierModel<>(context.bakeLayer(NullSoldierModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(NullSoldier entity) {
        return new ResourceLocation("totum_of_null", "textures/entity/null_soldier.png");
    }
}