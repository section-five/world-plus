package com.bpteam.arcticmod.init;

import java.util.ArrayList;
import java.util.List;
import com.bpteam.arcticmod.blocks.RedIce;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	//Ice
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block RED_ICE = new RedIce("red_ice", Material.ROCK);
}