package com.drakhavik.spudergy;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * This class has the register event handler for all custom blocks. This class uses @Mod.EventBusSubscriber so the event handler has to be static This class uses @ObjectHolder to get a reference to the blocks
 */
@Mod.EventBusSubscriber(modid = SpudergyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(SpudergyMod.MOD_ID)
public class ModBlocks {

    public static final Block POTATO_BLOCK = new Block(
            Block.Properties
                    .create(Material.IRON)
                    .hardnessAndResistance(5)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE))
            .setRegistryName(SpudergyMod.MOD_ID, "potato_block");

    /**
     * The actual event handler that registers the custom blocks.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //In here you pass in all block instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(POTATO_BLOCK);
    }
}
