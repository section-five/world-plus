package com.bpteam.worldplus.common.items;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.util.IHasModel;
import net.minecraft.item.ItemFood;

public class AFoodBase extends ItemFood implements IHasModel
{

    public AFoodBase(String name, int amount, float saturation, boolean isAnimalFood)
    {
        super(amount, saturation, isAnimalFood);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(WorldPlus.arctic);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        WorldPlus.proxy.registerItemRenderer(this, 0, "inventory");
    }

}