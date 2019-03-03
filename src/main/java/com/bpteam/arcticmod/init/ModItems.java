package com.bpteam.arcticmod.init;

import com.bpteam.arcticmod.common.items.ItemBase;
import com.bpteam.arcticmod.common.items.ItemStrongIceBall;
import com.bpteam.arcticmod.common.items.ItemWeakIceBall;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item WEAKER_ICE_BALL = new ItemWeakIceBall("weaker_ice_ball");
    public static final Item STRONGER_ICE_BALL = new ItemStrongIceBall("stronger_ice_ball");
    public static final Item HAMMER = new ItemBase("hammer");
}