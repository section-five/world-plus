package com.bpteam.arcticmod.init;

import com.bpteam.arcticmod.common.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item WEAKER_ICE_BALL= new ItemBase("weaker_ice_ball");
    public static final Item STRONGER_ICE_BALL= new ItemBase("stronger_ice_ball");
    public static final Item HAMMER= new ItemBase("hammer");
}