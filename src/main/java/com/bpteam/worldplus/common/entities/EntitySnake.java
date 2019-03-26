package com.bpteam.worldplus.common.entities;

import com.bpteam.worldplus.util.handlers.LootTableHandler;
import com.bpteam.worldplus.util.handlers.SoundsHandler;
import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntitySnake extends EntityCow {

    public EntitySnake(World world) {
        super(world);
    }

    private static final DataParameter<Integer> TYPE = EntityDataManager.createKey(EntitySnake.class, DataSerializers.VARINT);

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        //this.tasks.addTask(3, new EntityAIAttackMelee (Player, 5F, false));
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
        return 0.6F;
    }

 //   @Override
  //  protected ResourceLocation getLootTable() {
 //       return LootTableHandler.SNAKE;
 //   }

  //  @Override
  //  protected SoundEvent getAmbientSound() {
  //      return SoundsHandler.SNAKE_AMBIENT;
//    }

//    @Override
 //   protected SoundEvent getHurtSound(DamageSource source) {
 //       return SoundsHandler.SNAKE_HURT;
 //   }

   // @Override
    //protected SoundEvent getDeathSound() {
      //  return SoundsHandler.SNAKE_DEATH;
    //}

    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {
        this.playSound(SoundEvents.BLOCK_GRASS_STEP, 1, 1);
    }

    public int getType() {
        return getDataManager().get(TYPE);
    }

    public void setType(int angelType) {
        getDataManager().set(TYPE, angelType);
    }
}