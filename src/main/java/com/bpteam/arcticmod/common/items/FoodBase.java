package com.bpteam.arcticmod.common.items;

import com.bpteam.arcticmod.ArcticMod;
import com.bpteam.arcticmod.init.ModItems;
import com.bpteam.arcticmod.util.IHasModel;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{

    public FoodBase(String name, int amount, float saturation, boolean isAnimalFood)
    {
        super(amount, saturation, isAnimalFood);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcticMod.items);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        ArcticMod.proxy.registerItemRenderer(this, 0, "inventory");
    }

}