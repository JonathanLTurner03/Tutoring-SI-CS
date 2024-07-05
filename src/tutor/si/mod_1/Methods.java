package tutor.si.mod_1;

import tutor.si.Application;

// This class demonstrates the use of methods in Java
public class Methods extends Application {

    // This method prints a number
    public void printNumber(int number) {
        print("The number is: " + number);
    }

    // This method prints a string
    public void printString(String text) {
        print("The string is: " + text);
    }

    // This method adds two numbers and returns the result
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // This method concatenates two strings and returns the result
    public String concatenateStrings(String a, String b) {
        return a + b;
    }

    // This method is called from the main method
    public void run() {
        printNumber(10);
        printString("Hello, World!");

        int sum = addNumbers(5, 7);
        print("The sum is: " + sum);

        String result = concatenateStrings("Hello, ", "World!");
        print("The concatenated string is: " + result);
    }

    public static void main(String[] args) {
        Methods program = new Methods();
        program.run();
        program.cleanup();
    }

}