package com.bpteam.arcticmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs
{
    public BlocksTab()
    {
        super("blocks");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.BLUE_ICE);
    }
}