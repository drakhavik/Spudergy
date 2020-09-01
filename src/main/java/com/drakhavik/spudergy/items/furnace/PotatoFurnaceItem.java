package com.drakhavik.spudergy.items.furnace;

import com.drakhavik.spudergy.blocks.furnace.PotatoFurnaceBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class PotatoFurnaceItem extends BlockItem {
    static final int MAXIMUM_STACK_SIZE = 20;  // player can only hold 20 of this block in their hand at once
    public static final Properties PROPERTIES = new Properties().maxStackSize(MAXIMUM_STACK_SIZE).group(ItemGroup.BUILDING_BLOCKS);

    public PotatoFurnaceItem() {
        // which inventory tab?
        super(new PotatoFurnaceBlock(), PROPERTIES);
    }

    public PotatoFurnaceItem(PotatoFurnaceBlock blockIn, Properties builder) {
        super(blockIn, builder);
    }
}
