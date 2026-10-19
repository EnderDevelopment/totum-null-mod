package com.enderdevelopment.totumofnull;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TotumOfNullBlock extends Block {
    public static final Block TOTUM_OF_NULL_BLOCK = new TotumOfNullBlock(Settings.of(Material.STONE));

    public TotumOfNullBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            // Spawn Null Soldiers when the Totum of Null block is right-clicked
            NullSoldierEntity nullSoldier = new NullSoldierEntity(NullSoldierEntity.NULL_SOLDIER_ENTITY_TYPE, world);
            nullSoldier.setPosition(pos.getX(), pos.getY() + 1, pos.getZ());
            world.spawnEntity(nullSoldier);
        }
        return ActionResult.SUCCESS;
    }
}