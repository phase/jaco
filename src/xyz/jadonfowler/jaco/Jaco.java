/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco;

import xyz.jadonfowler.jaco.command.CommandManager;
import xyz.jadonfowler.jaco.command.sys.SystemCommandManager;

/**
 * @author Jadon "Phase" Fowler on Feb 22, 2015
 */
public class Jaco {
	
	static Console console;
	static CommandManager commandManager;
	
	public static void main(String... args){
		console = new Console();
		commandManager = new CommandManager();
		new SystemCommandManager();
	}
	
	public static Console getConsole(){
		return console;
	}
	
	public static CommandManager getCommandManager(){
		return commandManager;
	}
	
}
