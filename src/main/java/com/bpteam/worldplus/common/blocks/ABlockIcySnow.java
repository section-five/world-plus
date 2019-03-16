package com.bpteam.worldplus.common.blocks;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.init.ModBlocks;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.util.IHasModel;
import net.minecraft.block.BlockIce;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ABlockIcySnow extends BlockIce implements IHasModel {
    public ABlockIcySnow(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(WorldPlus.ablocks);
        setSoundType(SoundType.SNOW);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        WorldPlus.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
