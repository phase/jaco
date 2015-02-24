/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco.sys.out;

import java.awt.Color;

import xyz.jadonfowler.jaco.Jaco;

/**
 * @author Jadon "Phase" Fowler on Feb 22, 2015
 */
public class PrintStream {
	
	public void println(String s){
		Jaco.getConsole().println(s, Jaco.getConsole().trace);
	}
	
	public void print(String s){
		Jaco.getConsole().print(s, Jaco.getConsole().trace);
	}
	
	public void notify(String s){
		Jaco.getConsole().println(s, Jaco.getConsole().trace, Color.GREEN);
	}
	
	public void update(String s){
		Jaco.getConsole().println(s, Jaco.getConsole().trace, Color.CYAN);
	}
	
	public void error(String s){
		Jaco.getConsole().println(s, Jaco.getConsole().trace, new Color(255, 155, 155));
	}
	
}
