package com.drakhavik.spudergy.blocks.furnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PotatoFurnaceBlock extends Block {
    public static final String REGISTRY_NAME = "potatofurnace";

    public PotatoFurnaceBlock() {
        super(Block.Properties.create(Material.IRON));
    }
    public PotatoFurnaceBlock(Properties properties) {
        super(properties);
    }

}
