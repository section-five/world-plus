package com.bpteam.worldplus.init;

import com.bpteam.worldplus.WorldPlus;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModMaterials {
    public static final List<Material> MATERIALS = new ArrayList<Material>();

    public static final ItemArmor.ArmorMaterial HIDE = EnumHelper.addArmorMaterial("hide", WorldPlus.MODID + ":hide", 13,  new int[] {1,3,2,1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    public static final ItemTool.ToolMaterial CLUB = EnumHelper.addToolMaterial("club", 1,750, 4, 1, 1);
}
