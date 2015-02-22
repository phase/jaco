/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco.command.sys;

import java.io.IOException;

import xyz.jadonfowler.jaco.Jaco;
import xyz.jadonfowler.jaco.command.Command;

/**
 * @author Jadon "Phase" Fowler on Feb 22, 2015
 */
public class Open extends Command {

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#exec(java.lang.String, java.lang.String[])
	 */
	@Override
	public void exec(String in, String[] args) {
		String message = "";
		for(int i = 1; i < args.length; i++){
			message += args[i];
			if(i != args.length - 1){
				message += " ";
			}
		}
		String cmd = "cmd.exe /c start " + message;
		try {
			Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			Jaco.out.error(e.getMessage());
		}
	}

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#getCommand()
	 */
	@Override
	public String getCommand() {
		return "open";
	}

}
