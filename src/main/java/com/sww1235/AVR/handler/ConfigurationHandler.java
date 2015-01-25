package com.sww1235.AVR.handler;

import com.sww1235.AVR.reference.Names;
import com.sww1235.AVR.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Stephen on 1/24/15.
 */
public class ConfigurationHandler
    {
        public static Configuration configuration;
        public static boolean vanillaBonus = false;

        public static void init(File configFile)
            {
                //create configuration object from given config file
                if(configuration == null)
                    {
                        configuration = new Configuration(configFile);
                        loadConfiguration();
                    }
            }
        @SubscribeEvent
        public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
            {
                if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
                    {
                        loadConfiguration();

                    }
            }
        private static void loadConfiguration()
            {
                vanillaBonus = configuration.getBoolean("vanillaBonus", Names.CATAGORY_MOREOPNESS,true,"If you feel that the 10% bonus is too OP in an already OP mod, disable it here.");

                if(configuration.hasChanged())
                    {
                        configuration.save();
                    }
            }
    }
