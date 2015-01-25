package com.sww1235.handler;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Stephen on 1/24/15.
 */
public class ConfigurationHandler
    {
        public static void init(File configFile)
            {
                Configuration configuration = new Configuration(configFile);

                try
                    {
                        //load config file
                        configuration.load();

                        //read in properties from config file
                        boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
                    }
                catch (Exception e)
                    {
                        e.printStackTrace();

                        //log the exception
                    }
                finally
                    {
                        if(configuration.hasChanged())
                            {
                                configuration.save();
                            }
                    }
            }
    }
