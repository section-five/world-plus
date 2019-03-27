package com.bpteam.worldplus.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModItems.RAW_PENGUIN, new ItemStack(ModItems.COOKED_PENGUIN, 1), 1.5f);
        GameRegistry.addSmelting(ModItems.RAW_SEAL, new ItemStack(ModItems.COOKED_SEAL, 1), 1.5f);
        GameRegistry.addSmelting(ModItems.RAW_POLAR_BEAR, new ItemStack(ModItems.COOKED_POLAR_BEAR, 1), 1.5f);
    }
}
