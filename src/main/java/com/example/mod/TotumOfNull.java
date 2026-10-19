package com.example.mod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("totum_of_null")
public class TotumOfNull {
    public static final EntityType<NullSoldier> NULL_SOLDIER = EntityType.Builder.of(NullSoldier::new, Mob.MobCategory.MISC)
            .sized(0.6f, 1.95f)
            .build("null_soldier");

    public TotumOfNull() {
        // Register the entity
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(NULL_SOLDIER, NullSoldier.createAttributes().build());
    }

    public static class NullSoldier extends Mob {
        protected NullSoldier(EntityType<? extends Mob> type, Level level) {
            super(type, level);
        }

        public static AttributeSupplier.Builder createAttributes() {
            return Mob.createMobAttributes()
                    .add(Attributes.MAX_HEALTH, 20.0D)
                    .add(Attributes.MOVEMENT_SPEED, 0.23D);
        }
    }
}