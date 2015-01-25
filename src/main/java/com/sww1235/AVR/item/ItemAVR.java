package com.sww1235.AVR.item;

import com.sww1235.AVR.creativetab.CreativeTabAVR;
import com.sww1235.AVR.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Stephen on 1/25/15.
 */
public class ItemAVR extends Item
    {
        public ItemAVR()
            {
                super();
                this.setCreativeTab(CreativeTabAVR.AVR_TAB);
            }
        @Override
        public String getUnlocalizedName()
            {
                return String.format("item.%s%s", Reference.MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
            }
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IIconRegister iconRegister)
            {
                itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
            }

        @Override
        public String getUnlocalizedName(ItemStack itemStack)
            {
                return String.format("item.%s%s", Reference.MOD_ID+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
            }


        protected String getUnwrappedUnlocalizedName(String unlocalizedName)
            {
                return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
            }



    }
