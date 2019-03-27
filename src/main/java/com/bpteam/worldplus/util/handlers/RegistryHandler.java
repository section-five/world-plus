package com.bpteam.worldplus.util.handlers;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.common.entities.*;
import com.bpteam.worldplus.init.ModBiomes;
import com.bpteam.worldplus.init.ModBlocks;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import static com.bpteam.worldplus.util.handlers.SpawnHandler.setUpSpawns;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ModItems.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModels();
            }
        }
        for (Block block : ModBlocks.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
            }
        }
    }

    public static void PreInit(FMLPreInitializationEvent event) {
        SoundsHandler.registerSounds();
        ModBiomes.registerBiomes();
    }

    @SubscribeEvent
    public static void addEntities(RegistryEvent.Register<EntityEntry> e) {
        IForgeRegistry<EntityEntry> reg = e.getRegistry();
        reg.registerAll(EntityEntries.PENGUIN, EntityEntries.SEAL, EntityEntries.WEAK_ICEBALL, EntityEntries.STRONG_ICEBALL, EntityEntries.WALRUS, EntityEntries.ARCTIC_FOX, EntityEntries.SNAKE);
        setUpSpawns();
    }

    // Entities
    @GameRegistry.ObjectHolder(WorldPlus.MODID)
    public static class EntityEntries {
        public static final EntityEntry PENGUIN = EntityEntryBuilder.create().entity(EntityPenguin.class).id(new ResourceLocation(WorldPlus.MODID, "penguin"), 0).name("penguin").tracker(80, 3, true).egg(16777215, 000000).build();
        public static final EntityEntry WEAK_ICEBALL = EntityEntryBuilder.create().entity(EntityWeakIceBall.class).id(new ResourceLocation(WorldPlus.MODID, "weakiceball"), 1).name("weakiceball").tracker(80, 3, true).build();
        public static final EntityEntry STRONG_ICEBALL = EntityEntryBuilder.create().entity(EntityStrongIceBall.class).id(new ResourceLocation(WorldPlus.MODID, "strongiceball"), 2).name("strongiceball").tracker(80, 3, true).build();
        public static final EntityEntry SEAL = EntityEntryBuilder.create().entity(EntitySeal.class).id(new ResourceLocation(WorldPlus.MODID, "seal"), 3).name("seal").tracker(80, 3, true).egg(16777215, 11184810).build();
        public static final EntityEntry WALRUS = EntityEntryBuilder.create().entity(EntityWalrus.class).id(new ResourceLocation(WorldPlus.MODID, "walrus"), 4).name("walrus").tracker(80, 3, true).egg(7029783, 5980968).build();
        public static final EntityEntry ARCTIC_FOX = EntityEntryBuilder.create().entity(EntityArcticFox.class).id(new ResourceLocation(WorldPlus.MODID, "arctic_fox"), 5).name("arctic_fox").tracker(80, 3, true).egg(16777215, 5636095).build();
        public static final EntityEntry SNAKE = EntityEntryBuilder.create().entity(EntitySnake.class).id(new ResourceLocation(WorldPlus.MODID, "snake"), 6).name("snake").tracker(80, 3, true).egg(43520, 16777045).build();
    }
}
