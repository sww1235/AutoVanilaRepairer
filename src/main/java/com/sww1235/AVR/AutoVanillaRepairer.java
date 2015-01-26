package com.sww1235.AVR;

import com.sww1235.AVR.handler.ConfigurationHandler;
import com.sww1235.AVR.init.ModBlocks;
import com.sww1235.AVR.init.ModItems;
import com.sww1235.AVR.init.Recipes;
import com.sww1235.AVR.proxy.IProxy;
import com.sww1235.AVR.reference.Reference;
import com.sww1235.AVR.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class AutoVanillaRepairer
    {
        @Mod.Instance(Reference.MOD_ID)
        public static AutoVanillaRepairer instance;

        @SidedProxy(clientSide =Reference.CLIENT_PROXY_CLASS ,serverSide = Reference.SERVER_PROXY_CLASS)
        public static IProxy proxy;


        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event)
            {
                ConfigurationHandler.init(event.getSuggestedConfigurationFile());
                FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

                //proxy.registerKeyBindings();

                ModItems.init();


                ModBlocks.init();


                LogHelper.info("Pre Initialization Complete");

            }
        @Mod.EventHandler
        public void Init(FMLInitializationEvent event)
            {

                //FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
                Recipes.init();
                LogHelper.info("Initialization Complete");
            }
        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event)
            {
                LogHelper.info("Post Initialization Complete");
            }


    }
