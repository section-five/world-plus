package com.bpteam.worldplus.common.entities;

import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntitySnake extends EntityMob {

    public EntitySnake(World world) {
        super(world);
    }

    private static final DataParameter<Integer> TYPE = EntityDataManager.createKey(EntitySnake.class, DataSerializers.VARINT);

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAIAttackMelee (this, 5F, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
    }

    @Override
    protected void jump() {
        super.jump();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        if (!super.attackEntityAsMob(entityIn))
        {
            return false;
        }
        else
        {
            if (entityIn instanceof EntityLivingBase)
            {
                ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.POISON, 200));
            }

            return true;
        }
    }

    @Override
    protected void updateAITasks() {
        super.updateAITasks();
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
    }

    @Override
    public float getEyeHeight() {
        return 0.2F;
    }

   /* @Override
    protected ResourceLocation getLootTable() {
        return LootTableHandler.SNAKE;
    }

   @Override
   protected SoundEvent getAmbientSound() {
        return SoundsHandler.SNAKE_AMBIENT;
   }

   @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundsHandler.SNAKE_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundsHandler.SNAKE_DEATH;
    }*/


    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {
        this.playSound(SoundEvents.BLOCK_GRASS_STEP, 1, 1);
    }

    public int getType() {
        return getDataManager().get(TYPE);
    }

    public void setType(int snaketype) {
        getDataManager().set(TYPE, snaketype);
    }
}