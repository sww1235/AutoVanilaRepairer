package com.sww1235.AVR.init;

import com.sww1235.AVR.item.ItemBasicItem;
import com.sww1235.AVR.item.ItemAVR;
import com.sww1235.AVR.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import com.sww1235.AVR.reference.Names;

/**
 * Created by Stephen on 1/25/15.
 */
public class ModItems
    {
        public static final ItemAVR BasicItem = new ItemBasicItem();

        public static void init()
            {
                GameRegistry.registerItem(BasicItem, Names.Items.BASIC_ITEM, Reference.MOD_ID);
            }
    }
