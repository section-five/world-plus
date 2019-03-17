package com.bpteam.worldplus.init;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.common.fluids.ModFluid;
import com.bpteam.worldplus.util.handlers.ModMaterials;
import com.google.common.collect.ImmutableSet;
import net.minecraft.util.ResourceLocation;

import java.util.Set;

public class ModFluids {

    public static final ModFluid QUICKSAND = (ModFluid) new ModFluid(
            "quicksand",
            new ResourceLocation(WorldPlus.MODID, "quicksand_still"),
            new ResourceLocation(WorldPlus.MODID, "quicksand_flow")
    )
            .setMaterial(ModMaterials.QUICKSAND)
            .setDensity(1100)
            .setGaseous(false)
            .setLuminosity(9)
            .setViscosity(25000)
            .setTemperature(300);

    public static final Set<ModFluid> SET_FLUIDS = ImmutableSet.of(
            QUICKSAND);
}

