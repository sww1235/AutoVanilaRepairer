package com.sww1235.AVR.client.gui;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

import java.util.Set;

/**
 * Created by Stephen on 1/24/15.
 */
public class GuiFactory implements IModGuiFactory
    {
        @Override
        public void initialize(Minecraft minecraftInstance)
            {

            }

        @Override
        public Class<? extends GuiScreen> mainConfigGuiClass()
            {
                return null;
            }

        @Override
        public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
            {
                return null;
            }

        @Override
        public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
            {
                return null;
            }
    }