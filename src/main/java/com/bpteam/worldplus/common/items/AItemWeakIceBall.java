package com.bpteam.worldplus.common.items;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.common.entities.EntityWeakIceBall;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class AItemWeakIceBall extends Item implements IHasModel {

    public AItemWeakIceBall(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setMaxStackSize(16);
        setCreativeTab(WorldPlus.aitems);

        ModItems.ITEMS.add(this);
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode) {
            itemstack.shrink(1);
        }

        if (!worldIn.isRemote) {
            EntityWeakIceBall ice = new EntityWeakIceBall(worldIn, playerIn);
            ice.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.spawnEntity(ice);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public void registerModels() {
        WorldPlus.proxy.registerItemRenderer(this, 0, "inventory");
    }
}


