package com.bpteam.worldplus.common.blocks;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.init.ModBlocks;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ABlockBase extends Block implements IHasModel {
    public ABlockBase(String name, Material material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(WorldPlus.ablocks);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        WorldPlus.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}
