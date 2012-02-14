package com.crumbdev.crumb;

/**
 * Everyone loves a standard Javadoc. Will fix this up later.
 */

import com.thenetdev.Commons.Debug;
import com.thenetdev.Commons.Keyboard;

public class Crumb {

    public static void main(String[] args)
    {
    	int dt = 1; //Debug toggle. 1 for on, 0 for off.
        Debug.msg("Crumb, version 0.1 starting up",dt);
        System.out.print("What is your name? ");
        String name = Keyboard.readString();
        System.out.println("Hello "+name+"!");
        
    }

}
