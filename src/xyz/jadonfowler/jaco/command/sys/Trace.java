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
public class Trace extends Command {

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#exec(java.lang.String, java.lang.String[])
	 */
	@Override
	public void exec(String in, String[] args) {
		Jaco.getConsole().trace = !Jaco.getConsole().trace;
	}

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#getCommand()
	 */
	@Override
	public String getCommand() {
		return "trace";
	}

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Trace where commands come from";
	}

}
