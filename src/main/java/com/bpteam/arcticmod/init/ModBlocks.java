package com.bpteam.arcticmod.init;

import com.bpteam.arcticmod.common.blocks.BlockBase;
import com.bpteam.arcticmod.common.blocks.FrozenLantern;
import com.bpteam.arcticmod.common.blocks.IceBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    //Ice
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block RED_ICE = new IceBase("red_ice");
    public static final Block WHITE_ICE = new IceBase("white_ice");
    public static final Block ORANGE_ICE = new IceBase("orange_ice");
    public static final Block MAGENTA_ICE = new IceBase("magenta_ice");
    public static final Block LIGHT_BLUE_ICE = new IceBase("light_blue_ice");
    public static final Block YELLOW_ICE = new IceBase("yellow_ice");
    public static final Block LIME_ICE = new IceBase("lime_ice");
    public static final Block PINK_ICE = new IceBase("pink_ice");
    public static final Block GRAY_ICE = new IceBase("gray_ice");
    public static final Block LIGHT_GRAY_ICE = new IceBase("light_gray_ice");
    public static final Block CYAN_ICE = new IceBase("cyan_ice");
    public static final Block PURPLE_ICE = new IceBase("purple_ice");
    public static final Block BLUE_ICE = new IceBase("blue_ice");
    public static final Block BROWN_ICE = new IceBase("brown_ice");
    public static final Block GREEN_ICE = new IceBase("green_ice");
    public static final Block BLACK_ICE = new IceBase("black_ice");

    //Blocks
    public static final Block FROZEN_LAMP = new FrozenLantern("frozen_lamp", Material.REDSTONE_LIGHT);
    public static final Block SNOWY_BRICKS = new BlockBase("snowy_bricks", Material.ROCK);
    public static final Block CRACKED_SNOWY_BRICKS = new BlockBase("cracked_snowy_bricks", Material.ROCK);
    public static final Block CHISELED_SNOWY_BRICKS = new BlockBase("chiseled_snowy_bricks", Material.ROCK);
    public static final Block MOSSY_SNOWY_BRICKS = new BlockBase("mossy_snowy_bricks", Material.ROCK);
    public static final Block SNOWY_SAND = new BlockBase("snowy_sand", Material.SAND);
}