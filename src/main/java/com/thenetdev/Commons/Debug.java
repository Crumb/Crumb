package com.thenetdev.Commons;

/**
 * 
 * A basic debugging class, will add more functionality later.
 * 
 * @author Matthew Sowden
 *
 */

public class Debug {
	
	/**
	 * 
	 * Main use of the Debug Class. Used to print messages to console for debugging 
	 * using System.out.println()
	 * 
	 * @param str    Debug message to be printed
	 * @param dt     Debug toggle for easy switching
	 */
	public static void msg(String str,int dt)
	{
		if(dt == 1)
		{
		System.out.println("[DEBUG] "+str);
		}
	}
	
	/**
	 * 
	 * Like msg() however this is formatted for mathematical operations.
	 * 
	 * @param dbl    Debug math function to be printed.
	 * @param dt     Debug toggle for easy switching
	 */
	public static void math(double dbl, int dt)
	{
		if(dt == 1)
		{
		System.out.println("[DEBUG] "+dbl);
		}
	}
	
}
