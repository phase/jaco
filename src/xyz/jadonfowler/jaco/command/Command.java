/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco.command;

import xyz.jadonfowler.jaco.Jaco;

/**
 * @author Jadon "Phase" Fowler on Feb 22, 2015
 */
public abstract class Command {
	
	public Command(){
		Jaco.getCommandManager().addCommand(this);
	}
	
	public abstract void exec(String in, String[] args);
	
	public abstract String getCommand();
	
}
