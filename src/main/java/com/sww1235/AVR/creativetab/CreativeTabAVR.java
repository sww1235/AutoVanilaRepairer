package com.sww1235.AVR.creativetab;

import com.sww1235.AVR.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Stephen on 1/25/15.
 */
public class CreativeTabAVR
    {
        //add this again with a diffenrt name, to create a different tab
        public static final CreativeTabs AVR_TAB = new CreativeTabs(Reference.MOD_ID)
        {
            @Override
            public Item getTabIconItem()
                {
                    return null;
                }



        };
    }
