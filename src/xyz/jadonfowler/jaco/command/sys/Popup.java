/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco.command.sys;

import javax.swing.JOptionPane;

import xyz.jadonfowler.jaco.command.Command;

/**
 * @author Jadon "Phase" Fowler on Feb 22, 2015
 */
public class Popup extends Command{

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
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#getCommand()
	 */
	@Override
	public String getCommand() {
		return "popup";
	}

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Popup a message";
	}

}
