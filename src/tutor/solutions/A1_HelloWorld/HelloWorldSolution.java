package tutor.solutions.A1_HelloWorld;

import tutor.si.Application;

/*
In this practice assignment, we will create a simple program that will print out the message "Hello, World!".
Recall, the run method is the first method that is called when the program is run. We need to write a line
of code that will print out the message "Hello, World!". Remember we have a function call print that accepts a string.
 */

/* This is the solution to the A1_HelloWorld assignment. */
public class HelloWorldSolution extends Application {

    public void run() {
        print("Hello, World!");
    }

    // Ignore this still
    public static void main(String[] args) {
        HelloWorldSolution program = new HelloWorldSolution();
        program.run();
        program.cleanup();
    }
}
