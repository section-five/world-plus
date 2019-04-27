package com.bpteam.worldplus.common.blocks;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockWoodenSpikes extends Block implements IHasModel {

    public BlockWoodenSpikes(String name, Material material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(WorldPlus.arctic); // TODO Change to another tab
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn, pos, entityIn);
        entityIn.attackEntityFrom(new DamageSource("spikes"), 0.5f);
    }

    @Override
    public void registerModels() {
        WorldPlus.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0 , "inventory");
    }
}
