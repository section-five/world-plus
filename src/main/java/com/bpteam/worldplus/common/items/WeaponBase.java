package com.bpteam.worldplus.common.items;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.util.IHasModel;
import net.minecraft.item.ItemSword;

public class WeaponBase extends ItemSword implements IHasModel {

    public WeaponBase(String name, ToolMaterial material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(WorldPlus.arctic);
        setMaxStackSize(1);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        WorldPlus.proxy.registerItemRenderer(this, 0 ,"inventory");
    }
}
