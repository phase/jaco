/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco;

import xyz.jadonfowler.jaco.command.CommandManager;
import xyz.jadonfowler.jaco.command.sys.SystemCommandManager;
import xyz.jadonfowler.jaco.sys.in.InputStream;
import xyz.jadonfowler.jaco.sys.out.PrintStream;

/**
 * @author Jadon "Phase" Fowler on Feb 22, 2015
 */
public class Jaco {
	
	private static Console console;
	private static CommandManager commandManager;
	public static PrintStream out;
	public static InputStream in;
	private static boolean initialized;
	
	public static void main(String... args){
		init();
	}
	
	public static void init(){
		initialized = true;
		console = new Console();
		commandManager = new CommandManager();
		new SystemCommandManager();
		out = new PrintStream();
		in = new InputStream();
	}
	
	public static Console getConsole(){
		if(!initialized) init();
		return console;
	}
	
	public static CommandManager getCommandManager(){
		if(!initialized) init();
		return commandManager;
	}
	
}
