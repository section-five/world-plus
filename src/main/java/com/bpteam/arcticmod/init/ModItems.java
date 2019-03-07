package com.bpteam.arcticmod.init;

import com.bpteam.arcticmod.common.items.*;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item WEAKER_ICE_BALL = new ItemWeakIceBall("weaker_ice_ball");
    public static final Item STRONGER_ICE_BALL = new ItemStrongIceBall("stronger_ice_ball");
    public static final Item HAMMER = new ItemBase("hammer");
    public static final Item RAW_POLAR_BEAR = new FoodBase("raw_polar_bear", 2, 2F, true);
    public static final Item COOKED_POLAR_BEAR = new FoodBase("cooked_polar_bear", 4, 8F, true);
}