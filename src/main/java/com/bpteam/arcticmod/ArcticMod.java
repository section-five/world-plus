package com.bpteam.arcticmod;

import com.bpteam.arcticmod.init.ModBlocks;
import com.bpteam.arcticmod.init.ModItems;
import com.bpteam.arcticmod.proxy.ClientProxy;
import com.bpteam.arcticmod.proxy.CommonProxy;
import com.bpteam.arcticmod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//import net.minecraft.init.Blocks;
//import org.apache.logging.log4j.Logger;

import java.io.File;

@Mod(modid = ArcticMod.MODID, name = ArcticMod.NAME, version = ArcticMod.VERSION, updateJSON = ArcticMod.UPDATEURL)
public class ArcticMod
{
    public static final String MODID = "arctic";
    public static final String NAME = "Arctic Mod";
    public static final String VERSION = "1.0.0";
    public static final String UPDATEURL = "https://raw.githubusercontent.com/bpteammc/arcticmod/master/update.json";

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;
    public static ClientProxy clientproxy;

    //private static Logger logger; (unused right now)

    public static CreativeTabs items = new CreativeTabs("items")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.WEAKER_ICE_BALL);
        }
    };

    public static CreativeTabs blocks = new CreativeTabs("blocks")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModBlocks.RED_ICE);
        }
    };

    public static File config;
    public static Object instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.PreInitRegistry(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
