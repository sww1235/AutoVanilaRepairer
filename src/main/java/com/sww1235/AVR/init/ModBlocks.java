package com.sww1235.AVR.init;

import com.sww1235.AVR.block.BlockAVR;
import com.sww1235.AVR.block.BlockTest;
import com.sww1235.AVR.reference.Names;
import com.sww1235.AVR.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Stephen on 1/25/15.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
    {
        public static final BlockAVR basicBlock = new BlockTest();
        public static void init()
            {
                GameRegistry.registerBlock(basicBlock, Names.Blocks.TEST);
            }

    }
