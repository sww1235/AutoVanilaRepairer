package com.sww1235.AVR;

import com.sww1235.AVR.proxy.IProxy;
import com.sww1235.AVR.reference.Reference;
import com.sww1235.AVR.handler.ConfigurationHandler;
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
            }
        @Mod.EventHandler
        public void Init(FMLInitializationEvent event)
            {

            }
        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event)
            {

            }


    }
