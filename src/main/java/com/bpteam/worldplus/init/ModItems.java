package com.bpteam.worldplus.init;

import com.bpteam.worldplus.common.items.*;
import net.minecraft.item.Item;


import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item WEAKER_ICE_BALL = new AItemWeakIceBall("weaker_ice_ball");
    public static final Item STRONGER_ICE_BALL = new AItemStrongIceBall("stronger_ice_ball");
    public static final Item HAMMER = new AItemBase("hammer");
    public static final Item CLUB = new WeaponBase("club", ModMaterials.CLUB);
    public static final Item LUCK_COOKIE = new FoodBase("luck_cookie", 2, 4F, false);
    public static final Item CLOVER = new AItemBase("clover");

    //Foods
    public static final Item RAW_POLAR_BEAR = new FoodBase("raw_polar_bear", 2, 2F, true);
    public static final Item COOKED_POLAR_BEAR = new FoodBase("cooked_polar_bear", 4, 8F, true);
    public static final Item RAW_PENGUIN = new FoodBase("raw_penguin", 2, 2F, true);
    public static final Item COOKED_PENGUIN = new FoodBase("cooked_penguin", 4, 8F, true);
    public static final Item RAW_SEAL = new FoodBase("raw_seal", 2, 2F, true);
    public static final Item COOKED_SEAL = new FoodBase("cooked_seal", 4, 8F, true);
    public static final Item BERRY = new FoodBase("berry",1,1F,false);
}