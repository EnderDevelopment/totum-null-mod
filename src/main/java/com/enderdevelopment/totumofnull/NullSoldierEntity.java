package com.enderdevelopment.totumofnull;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class NullSoldierEntity extends MobEntity {
    public static final EntityType<NullSoldierEntity> NULL_SOLDIER_ENTITY_TYPE = EntityType.Builder.create(NullSoldierEntity::new, EntityClassification.MONSTER).size(0.6f, 1.95f).build("null_soldier");

    protected NullSoldierEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        // Add goals for the Null Soldier
    }
}