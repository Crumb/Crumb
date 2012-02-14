package com.crumbdev.crumb;

/**
 * Everyone loves a standard Javadoc. Will fix this up later.
 */

import com.thenetdev.Commons.Keyboard;

public class Crumb {

    public static void main(String[] args)
    {
        i18n.i18nInit();
        Logger.init();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                Logger.close();
            }
        });
        Logger.debug("Crumb, version 0.1 starting up");
        //Logger.debug("Logfile: " + System.getProperty("user.home") + System.getProperty("file.separator") + ".crumb" + System.getProperty("file.separator") + "crumb.log");
        Logger.info("What is your name? ");
        String name = Keyboard.readString();
        Logger.info("Hello "+name+"!");
    }

}
