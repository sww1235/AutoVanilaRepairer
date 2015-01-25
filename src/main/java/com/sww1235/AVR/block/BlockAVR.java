package com.sww1235.AVR.block;

import com.sww1235.AVR.creativetab.CreativeTabAVR;
import com.sww1235.AVR.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Stephen on 1/25/15.
 */
public class BlockAVR extends Block
    {
        public BlockAVR(Material material)
            {
                super(material);
                this.setCreativeTab(CreativeTabAVR.AVR_TAB);
                //override this in individual items in order to change tabs.
            }

        public BlockAVR()
            {
                this(Material.rock);
            }
        @Override
        public String getUnlocalizedName()
            {
                return String.format("tile.%s%s", Reference.MOD_ID+":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
            }
        @Override
        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister iconRegister)
            {
                blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
            }
        protected String getUnwrappedUnlocalizedName(String unlocalizedName)
            {
                return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
            }
    }
