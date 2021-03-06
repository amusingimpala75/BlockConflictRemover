package com.github.amusingimpala75.blockconflictremover;

import com.github.amusingimpala75.blockconflictremover.block.FabricBlock;
import com.github.amusingimpala75.blockconflictremover.util.Identifier;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BCR implements ModInitializer {
	//public static Block TEST_BLOCK;

	@Override
	public void onInitialize() {
		//System.out.println("Hello Fabric world!");
		//TEST_BLOCK = new FabricBlock(200, Material.STONE, new Identifier("fabric", "test"));
		//System.out.println(TEST_BLOCK.id);
	}

	//Cannot be int i = 0 as MC hangs on the load/create world screen
	public static int getNextBlockId() {
		for (int i = 1; i < Block.BLOCKS.length; i++) {
			if (Block.BLOCKS[i] == null) {
				return i;
			}
		}
		return -1;
	}
}
