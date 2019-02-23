package com.bpteam.arcticmod;

import com.bpteam.arcticmod.init.ModBlocks;
import com.bpteam.arcticmod.proxy.ClientProxy;
import com.bpteam.arcticmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ArcticMod.MODID, name = ArcticMod.NAME, version = ArcticMod.VERSION, updateJSON = ArcticMod.UPDATEURL)
public class ArcticMod
{
    public static final String MODID = "arctic";
    public static final String NAME = "Arctic Mod";
    public static final String VERSION = "0.2.1";
    public static final String UPDATEURL = "https://raw.githubusercontent.com/bpteammc/arcticmod/master/update.json";

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;
    public static ClientProxy clientproxy;

    private static Logger logger;

    public static CreativeTabs blocks = new CreativeTabs("blocks")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModBlocks.RED_ICE);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
