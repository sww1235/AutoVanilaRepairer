package com.sww1235.AVR.client.gui;

import com.sww1235.AVR.handler.ConfigurationHandler;
import com.sww1235.AVR.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by Stephen on 1/24/15.
 */
public class ModGuiConfig extends GuiConfig
    {
        public ModGuiConfig(GuiScreen parentScreen)
            {
                super(
                        parentScreen,
                        new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                        Reference.MOD_ID,
                        true,
                        true,
                        GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));}
    }
