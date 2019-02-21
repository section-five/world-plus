package com.bpteam.arcticmod.common.items;

import com.bpteam.arcticmod.ArcticMod;
import com.bpteam.arcticmod.init.ModItems;
import com.bpteam.arcticmod.util.handlers.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ArcticMod.items);

        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        ArcticMod.proxy.registerItemRenderer(this, 0, "inventory");
    }

}