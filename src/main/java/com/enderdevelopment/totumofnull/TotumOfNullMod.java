package com.enderdevelopment.totumofnull;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.api.ModInitializer;

public class TotumOfNullMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // Register the Null Soldier entity
        Registry.register(Registry.ENTITY_TYPE, new Identifier("totumofnull", "null_soldier"), NullSoldierEntity.NULL_SOLDIER_ENTITY_TYPE);
        // Register the Totum of Null block
        Registry.register(Registry.BLOCK, new Identifier("totumofnull", "totum_of_null"), TotumOfNullBlock.TOTUM_OF_NULL_BLOCK);
    }
}