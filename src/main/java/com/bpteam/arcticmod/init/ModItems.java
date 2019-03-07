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

    //Foods
    public static final Item RAW_POLAR_BEAR = new FoodBase("raw_polar_bear", 2, 2F, true);
    public static final Item COOKED_POLAR_BEAR = new FoodBase("cooked_polar_bear", 4, 8F, true);
    public static final Item RAW_PENGUIN = new FoodBase("raw_penguin", 2, 2F, true);
    public static final Item COOKED_PENGUIN = new FoodBase("cooked_penguin", 4, 8F, true);
    public static final Item RAW_SEAL = new FoodBase("raw_seal", 2, 2F, true);
    public static final Item COOKED_SEAL = new FoodBase("cooked_seal", 4, 8F, true);
}