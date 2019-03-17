package com.bpteam.worldplus.common.items;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.util.IHasModel;
import net.minecraft.item.Item;

public class AItemBase extends Item implements IHasModel {

    public AItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(WorldPlus.arctic);

        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        WorldPlus.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
