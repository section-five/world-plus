package com.bpteam.arctic.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class EntityPenguin extends EntityCow {
    public EntityPenguin(World worldIn) {
        super(worldIn);
    }

    @Override
    public EntityCow createChild(EntityAgeable ageable)
    {
        return new EntityPenguin(world);
    }
}

