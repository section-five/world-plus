package com.bpteam.arcticmod.init;

import com.bpteam.arcticmod.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    //Ice
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block RED_ICE = new BlockIceBase("red_ice");
    public static final Block WHITE_ICE = new BlockIceBase("white_ice");
    public static final Block ORANGE_ICE = new BlockIceBase("orange_ice");
    public static final Block MAGENTA_ICE = new BlockIceBase("magenta_ice");
    public static final Block LIGHT_BLUE_ICE = new BlockIceBase("light_blue_ice");
    public static final Block YELLOW_ICE = new BlockIceBase("yellow_ice");
    public static final Block LIME_ICE = new BlockIceBase("lime_ice");
    public static final Block PINK_ICE = new BlockIceBase("pink_ice");
    public static final Block GRAY_ICE = new BlockIceBase("gray_ice");
    public static final Block LIGHT_GRAY_ICE = new BlockIceBase("light_gray_ice");
    public static final Block CYAN_ICE = new BlockIceBase("cyan_ice");
    public static final Block PURPLE_ICE = new BlockIceBase("purple_ice");
    public static final Block BLUE_ICE = new BlockIceBase("blue_ice");
    public static final Block BROWN_ICE = new BlockIceBase("brown_ice");
    public static final Block GREEN_ICE = new BlockIceBase("green_ice");
    public static final Block BLACK_ICE = new BlockIceBase("black_ice");
    public static final Block ICY_SNOW = new BlockIcySnow("icy_snow");
    public static final Block ICE_ICLE_SMALL = new BlockIceIcleSmall("icicle_small");
    public static final Block ICE_ICLE_BIG = new BlockIceIcleBig("icicle_big");
    public static final Block ICE_ICLE_THIN = new BlockIceIcleSmall("icicle_thin");

    //Blocks
    public static final Block FROZEN_LAMP = new BlockFrozenLantern("frozen_lamp", Material.REDSTONE_LIGHT);
    public static final Block SNOWY_BRICKS = new BlockBase("snowy_bricks", Material.ROCK);
    public static final Block CRACKED_SNOWY_BRICKS = new BlockBase("cracked_snowy_bricks", Material.ROCK);
    public static final Block CHISELED_SNOWY_BRICKS = new BlockBase("chiseled_snowy_bricks", Material.ROCK);
    public static final Block MOSSY_SNOWY_BRICKS = new BlockBase("mossy_snowy_bricks", Material.ROCK);
    public static final Block SNOWY_SAND = new BlockBase("snowy_sand", Material.SAND);
}