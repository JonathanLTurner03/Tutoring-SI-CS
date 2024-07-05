package tutor.si;

import java.util.Scanner;

/**
 * This class is used to define various different methods useful in the simple classes.
 *
 * @author Jonathan Turner
 * @version 1.0
 */
public abstract class Application {

    private Scanner sc;

    /**
     * Abstracts the print method to make it simpler to understand at first.
     * @param o the object being printed.
     */
    public static void print(Object o) {
        System.out.println(o);
    }

    /**
     * Constructor for the Application class.
     */
    public Application() {
        this.sc = new Scanner(System.in);
    }

    /**
     * Abstracts the run method to make it simpler to understand at first.
     */
    public void cleanup() {
        sc.close();
    }

    /**
     * Abstracts getting user input for an integer to make it simpler to understand at first.
     * @return the integer the user entered.
     */
    public int getInteger() {
        int number = 0;
        boolean isNumber = false;

        while (!isNumber) {
            try {
                number = Integer.parseInt(sc.nextLine());
                isNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        return number;
    }

    /**
     * Abstracts getting user input for a double to make it simpler to understand at first.
     * @return the double the user entered.
     */
    public double getDouble() {
        double number = 0;
        boolean isNumber = false;

        while (!isNumber) {
            try {
                number = Double.parseDouble(sc.nextLine());
                isNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid double.");
            }
        }

        return number;
    }

    /**
     * Abstracts getting user input for a string to make it simpler to understand at first.
     * @return the string the user entered.
     */
    public String getString() {
        String string = "";
        boolean isString = false;

        while (!isString) {
            try {
                string = sc.nextLine();
                isString = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid string.");
            }
        }

        return string;
    }

    /**
     * Abstracts getting user input for a boolean to make it simpler to understand at first.
     * @return the boolean the user entered.
     */
    public boolean getBoolean() {
        boolean bool = false;
        boolean isBool = false;

        while (!isBool) {
            try {
                bool = Boolean.parseBoolean(sc.nextLine());
                isBool = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid boolean.");
            }
        }

        return bool;
    }

    /**
     * Abstracts getting user input for a character to make it simpler to understand at first.
     * @return the character the user entered.
     */
    public char getChar() {
        char character = ' ';
        boolean isChar = false;

        while (!isChar) {
            try {
                character = sc.nextLine().charAt(0);
                isChar = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid character.");
            }
        }
        return character;
    }
}