package com.bpteam.worldplus.common.blocks;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.init.ModBlocks;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ABlockSpikes extends Block implements IHasModel {

    public ABlockSpikes(String name, Material material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(WorldPlus.arctic); // TODO Change to another tab

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public boolean isFullBlock(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean canBeConnectedTo(IBlockAccess world, BlockPos pos, EnumFacing facing) {
        return false;
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return new AxisAlignedBB(0, 0, 0, 1, 0.2, 1);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0, 0, 0, 0, 0.2, 0);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn, pos, entityIn);
        entityIn.attackEntityFrom(new DamageSource("spikes"), 0.5f);
        if(entityIn instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityIn;
            player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 50, 3));
        }
    }

    @Override
    public void registerModels() {
        WorldPlus.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
