/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco.sys.in;

import java.util.ArrayList;

/**
 * @author Jadon "Phase" Fowler on Feb 23, 2015
 */
public class InputStream {
	
	private ArrayList<InputHandler> handlers;
	
	public InputStream(){
		handlers = new ArrayList<InputHandler>();
	}
	
	public void addHandler(InputHandler i){
		handlers.add(i);
	}
	
	public void input(String input){
		for(InputHandler h : handlers)
			h.input(input);
	}
	
}
