package tutor.assgn.A1_HelloWorld;

import tutor.si.Application;

/*
In this practice assignment, we will create a simple program that will print out the message "Hello, World!".
Recall, the run method is the first method that is called when the program is run. We need to write a line
of code that will print out the message "Hello, World!". Remember we have a function call print that accepts a string.
 */

public class HelloWorld extends Application {

    public void run() {
        // TODO: Write a line of code that prints out the message "Hello, World!"
    }

    public static void main(String[] args) {
        HelloWorld program = new HelloWorld();
        program.run();
        program.cleanup();
    }
}
