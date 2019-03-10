package com.bpteam.arcticmod.common.items;

import com.bpteam.arcticmod.ArcticPlus;
import com.bpteam.arcticmod.init.ModItems;
import com.bpteam.arcticmod.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcticPlus.items);

        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        ArcticPlus.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
