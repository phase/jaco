/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco.command;

import java.util.ArrayList;

import xyz.jadonfowler.jaco.Jaco;

/**
 * @author Jadon "Phase" Fowler on Feb 22, 2015
 */
public class CommandManager {

	ArrayList<Command> commands;

	public CommandManager() {
		commands = new ArrayList<Command>();
	}

	public Command addCommand(Command c) {
		commands.add(c);
		return c;
	}

	public void performCommand(String in, String[] args) {
		boolean ran = false;
		for (Command c : commands) {
			if(c.getCommand().equalsIgnoreCase(args[0])){
				c.exec(in, args);
				ran = true;
			}
		}
		if(!ran){
			Jaco.out.error("command not found");
		}
	}

}
