package tutor.solutions.A3_SimpleCalculator;

/*
In this practice assignment, we will create a simple calculator that will take two numbers
from a user and multiply them. It will store it in a variable and print out the result at the end.

These are the guided instructions for it:

1. Begin by adding some new lines to the run method.
2. Print a welcome message to the user.
3. Ask the user to enter the first number.
4. Utilize the getInteger() method to get the number and store it in a variable, you can name it anything.
5. Ask the user to enter the second number.
6. Utilize the getInteger() method to get the number and store it in a variable, you can name it anything.
7. Multiply these two integers together and store the result in a new variable called result.
8. Print out the result to the user using the print() method.
*/

/* This is the solution to the A_SimpleCalculator assignment. */

import tutor.si.Application;

public class Calculator extends Application {

    public void run() {
        print("Welcome to the Simple Calculator!"); // TODO: #2

        print("Please enter the first number: "); // TODO: #3
        int x = getInteger(); // TODO: #4
        print("Please enter the second number: "); // TODO: #5
        int y = getInteger(); // TODO: #6
        int result = x * y; // TODO: #7
        print("The result of " + x + " multiplied by " + y + " is: " + result); // TODO: #8 (only need to print result)
    }


    // Don't stress about this yet.
    public static void main(String[] args) {
        Calculator program = new Calculator();
        program.run();
        program.cleanup();
    }

}
