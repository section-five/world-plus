package com.bpteam.worldplus.init;

import com.bpteam.worldplus.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    //Ice
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block RED_ICE = new ABlockIceBase("red_ice");
    public static final Block WHITE_ICE = new ABlockIceBase("white_ice");
    public static final Block ORANGE_ICE = new ABlockIceBase("orange_ice");
    public static final Block MAGENTA_ICE = new ABlockIceBase("magenta_ice");
    public static final Block LIGHT_BLUE_ICE = new ABlockIceBase("light_blue_ice");
    public static final Block YELLOW_ICE = new ABlockIceBase("yellow_ice");
    public static final Block LIME_ICE = new ABlockIceBase("lime_ice");
    public static final Block PINK_ICE = new ABlockIceBase("pink_ice");
    public static final Block GRAY_ICE = new ABlockIceBase("gray_ice");
    public static final Block LIGHT_GRAY_ICE = new ABlockIceBase("light_gray_ice");
    public static final Block CYAN_ICE = new ABlockIceBase("cyan_ice");
    public static final Block PURPLE_ICE = new ABlockIceBase("purple_ice");
    public static final Block BLUE_ICE = new ABlockIceBase("blue_ice");
    public static final Block BROWN_ICE = new ABlockIceBase("brown_ice");
    public static final Block GREEN_ICE = new ABlockIceBase("green_ice");
    public static final Block BLACK_ICE = new ABlockIceBase("black_ice");
    public static final Block ICY_SNOW = new ABlockIcySnow("icy_snow");
    public static final Block ICE_ICLE_SMALL = new ABlockIceIcleSmall("icicle_small");
    public static final Block ICE_ICLE_BIG = new ABlockIceIcleBig("icicle_big");
    public static final Block ICE_ICLE_THIN = new ABlockIceIcleSmall("icicle_thin");

    //Blocks
    public static final Block FROZEN_LAMP = new ABlockFrozenLantern("frozen_lamp", Material.REDSTONE_LIGHT);
    public static final Block SNOWY_BRICKS = new ABlockBase("snowy_bricks", Material.ROCK);
    public static final Block CRACKED_SNOWY_BRICKS = new ABlockBase("cracked_snowy_bricks", Material.ROCK);
    public static final Block CHISELED_SNOWY_BRICKS = new ABlockBase("chiseled_snowy_bricks", Material.ROCK);
    public static final Block MOSSY_SNOWY_BRICKS = new ABlockBase("mossy_snowy_bricks", Material.ROCK);
    public static final Block SPIKES = new ABlockSpikes("spikes", Material.WOOD);

}