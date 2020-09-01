package com.drakhavik.spudergy;

import com.drakhavik.spudergy.blocks.PootyFurnace;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import static com.drakhavik.spudergy.ModBlocks.POTATO_BLOCK;

/**
 * This class has the register event handler for all custom items.
 * This class uses @Mod.EventBusSubscriber so the event handler has to be static
 * This class uses @ObjectHolder to get a reference to the items
 */
@Mod.EventBusSubscriber(modid = SpudergyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(SpudergyMod.MOD_ID)
public class ModItems {

    public static final Item potato_sword = null;

    /**
     * The actual event handler that registers the custom items.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //In here you pass in all item instances you want to register.
        //Make sure you always set the registry name.
        BlockItem potatoBlockItem = new BlockItem(POTATO_BLOCK, new BlockItem.Properties());
        potatoBlockItem.setRegistryName(POTATO_BLOCK.getRegistryName());

        event.getRegistry().registerAll(
                new Item(new Item.Properties()).setRegistryName(SpudergyMod.MOD_ID, "potatosword"),
                potatoBlockItem,
                new com.drakhavik.spudergy.items.PootyFurnace(new com.drakhavik.spudergy.blocks.PootyFurnace())
        );
    }
}
