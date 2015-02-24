/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco.command.sys;

import xyz.jadonfowler.jaco.Jaco;
import xyz.jadonfowler.jaco.command.Command;

/**
 * @author Jadon "Phase" Fowler on Feb 23, 2015
 */
public class Help extends Command{

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#exec(java.lang.String, java.lang.String[])
	 */
	@Override
	public void exec(String in, String[] args) {
		for(Command c : Jaco.getCommandManager().getCommands())
			Jaco.out.update(" " + c.getCommand() + " " + c.getDescription());
	}

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#getCommand()
	 */
	@Override
	public String getCommand() {
		return "help";
	}

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#getDescription()
	 */
	@Override
	public String getDescription() {
		return "General Help";
	}

}
