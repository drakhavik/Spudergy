package com.drakhavik.spudergy.blocks.furnace;

import com.drakhavik.spudergy.SpudergyMod;
import com.drakhavik.spudergy.items.furnace.PotatoFurnaceItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Optional;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 * <p>
 * The Startup classes for this example are called during startup, in the following order:
 * onBlocksRegistration then onItemsRegistration
 * See MinecraftByExample class for more information
 */
@Mod.EventBusSubscriber(modid = SpudergyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(SpudergyMod.MOD_ID)
public class StartupCommon {
    public static PotatoFurnaceBlock potatoFurnaceBlock;  // this holds the unique instance of your block
    public static BlockItem potatoFurnaceItemBlock;  // this holds the unique instance of the ItemBlock corresponding to your block

    @SubscribeEvent
    public static void onBlocksRegistration(final RegistryEvent.Register<Block> blockRegisterEvent) {
        potatoFurnaceBlock = new PotatoFurnaceBlock();
        potatoFurnaceBlock.setRegistryName(SpudergyMod.MOD_ID, PotatoFurnaceBlock.REGISTRY_NAME);
        blockRegisterEvent.getRegistry().register(potatoFurnaceBlock);
    }

    @SubscribeEvent
    public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
        // We need to create a BlockItem so the player can carry this block in their hand and it can appear in the inventory
        System.out.println("registering furnace item");
        potatoFurnaceItemBlock = new PotatoFurnaceItem(potatoFurnaceBlock, PotatoFurnaceItem.PROPERTIES);

        potatoFurnaceItemBlock.setRegistryName(SpudergyMod.MOD_ID, PotatoFurnaceBlock.REGISTRY_NAME);
//        Optional.ofNullable(potatoFurnaceBlock.getRegistryName())
//                .map(potatoFurnaceItemBlock::setRegistryName);
        itemRegisterEvent.getRegistry().register(potatoFurnaceItemBlock);
    }

    @SubscribeEvent
    public static void onCommonSetupEvent(FMLCommonSetupEvent event) {
        // not actually required for this example....
    }
}
