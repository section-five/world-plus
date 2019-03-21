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

    //Foods
    public static final Item RAW_POLAR_BEAR = new AFoodBase("raw_polar_bear", 2, 2F, true);
    public static final Item COOKED_POLAR_BEAR = new AFoodBase("cooked_polar_bear", 4, 8F, true);
    public static final Item RAW_PENGUIN = new AFoodBase("raw_penguin", 2, 2F, true);
    public static final Item COOKED_PENGUIN = new AFoodBase("cooked_penguin", 4, 8F, true);
    public static final Item RAW_SEAL = new AFoodBase("raw_seal", 2, 2F, true);
    public static final Item COOKED_SEAL = new AFoodBase("cooked_seal", 4, 8F, true);
    public static final Item BERRY = new AFoodBase("berry",1,1F,false);
}