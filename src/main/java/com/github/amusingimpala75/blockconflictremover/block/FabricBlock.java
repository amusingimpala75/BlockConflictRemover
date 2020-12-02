package com.github.amusingimpala75.blockconflictremover.block;

import com.github.amusingimpala75.blockconflictremover.util.Identifier;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class FabricBlock extends Block {

    private final Identifier stringId;

    public FabricBlock(int textureId, Material material, Identifier stringId) {
        super(getNextId(), textureId, material);
        this.stringId = stringId;
    }

    public Identifier getStringId() {
        return stringId;
    }

    //Cannot be 0 otherwise MC hangs on loading screen
    public static int getNextId() {
        for (int i = 1; i < Block.BLOCKS.length; i++) {
            if (BLOCKS[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
