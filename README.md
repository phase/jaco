![Example]
(http://prntscr.com/68dfch)

# jaco
A console written in Java.

This is a console written in Java using Swing.

##API
###Commands
Make your class extend the `Command` class.
```java
public class TestCommand extends Class
```
(Be sure to make a new instance in your main method)
```java
public static void main(String... args){
	new TestCommand();
}
```
Put the `getCommand()` and `exec()` methods in your command class.
```java
public String getCommand(){
	return "test";
}

public void exec(String in, String[] args) {
	//Run Command
}
```
Jaco automatically tests if your command is the command being inputed, so you don't have to worry about it (that's what the `getCommand()` is used for).

The `exec()` method is run when your command is inputed. In here, you can use the rest of the Jaco API to do different things.

###PrintStream
PrintStream is what is used to print to the console.
//todo PrintStream