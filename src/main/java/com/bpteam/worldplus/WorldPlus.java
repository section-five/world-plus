package com.bpteam.worldplus;

import com.bpteam.worldplus.init.ModBlocks;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.proxy.CommonProxy;
import com.bpteam.worldplus.util.Reference;
import com.bpteam.worldplus.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WorldPlus.MODID, name = WorldPlus.NAME, version = WorldPlus.VERSION,dependencies = WorldPlus.DEPENDENCIES, updateJSON = WorldPlus.UPDATEURL)
public class WorldPlus
{
    public static final String MODID = "worldplus";
    public static final String NAME = "World Plus";
    public static final String VERSION = "1.4";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2768,)";
    public static final String UPDATEURL = "https://raw.githubusercontent.com/bpteammc/world-plus/master/update.json";

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs arctic = new CreativeTabs("arctic")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.WEAKER_ICE_BALL);
        }
    };

  //  public static CreativeTabs desert = new CreativeTabs("desert")
  //  {
 //       @Override
 //       public ItemStack createIcon() {
  //          return new ItemStack(ModItems.HAMMER);
   //     }
  //  };

  //  public static CreativeTabs jungle = new CreativeTabs("jungle")
   // {
    //    @Override
   //     public ItemStack createIcon() {
   //         return new ItemStack(ModItems.HAMMER);
   //     }
   // };


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        RegistryHandler.PreInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
