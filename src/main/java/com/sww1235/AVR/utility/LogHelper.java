package com.sww1235.AVR.utility;

import com.sww1235.AVR.reference.Reference;
import cpw.mods.fml.common.FMLLog;

import java.util.logging.Level;

/**
 * Created by Stephen on 1/24/15.
 */
public class LogHelper
    {
        public static void log(Level logLevel, Object object)
            {
                FMLLog.log(Reference.MOD_NAME, logLevel, "%s", String.valueOf(object));
            }
        public static void all(Object object)
            {
                log(Level.ALL,object);
            }
        public static void severe(Object object)
            {
                log(Level.SEVERE, object);
            }

        public static void warning(Object object)
            {
                log(Level.WARNING, object);
            }

        public static void info(Object object)
            {
                log(Level.INFO, object);
            }

        public static void config(Object object)
            {
                log(Level.CONFIG, object);
            }

        public static void fine(Object object)
            {
                log(Level.FINE, object);
            }

        public static void finer(Object object)
            {
                log(Level.FINER, object);
            }
        public static void trace(Object object)
            {
                log(Level.FINEST, object);
            }

        public static void off(Object object)
            {
                log(Level.OFF, object);
            }
    }
