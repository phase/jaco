/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco.sys.in;

import xyz.jadonfowler.jaco.Jaco;

/**
 * @author Jadon "Phase" Fowler on Feb 23, 2015
 */
public abstract class InputHandler {
	
	public InputHandler(){
		Jaco.in.addHandler(this);
	}
	
	public abstract void input(String input);
	
}
