package tutor.si.mod_1.variables;

import tutor.si.Application;

/**
 * This class shows how numbers are represented and treated
 * in code. There are many different ways of representing
 * numbers so lets being.
 *
 * @author Jonathan Turner
 * @version 1.0
 */
public class Numbers extends Application {

    // Let's look at this code
    public void run() {

        /*
        Integers are whole numbers.
        These include: 0, 3, 7, 2, 3, ... and even negative numbers: -1, -3, -7, ... etc.

        Integers are defined by the word `int`
         */
        print("Lets add 5 and 2 together.");

        int x = 5;
        int y = 2;
        int sum = x + y;
        print("The sum is: " + sum + "\n");

        /*
        Let's do the same thing but subtracting
         */
        print("Lets subtract 2 from 5.");
        int difference = x - y;
        print("The difference is: " + difference + "\n");

        /*
        ... So we're starting to understand that if we just use normal arithmetic signs
        such as + - * / we get what we would expect... right?
         */


        /*
        Let's say we want to divide two Integers, lets say... 6 and 2.
        What would we expect to see?
         */
        print("What if we divided 6 and 2?");

        int quotient = 6 / 2;
        print("The quotient is: " + quotient + "!\n");

        /*
        So it seems like we will always get the answer we would expect!
        ... right? ... well, not really. What if we divide two integers,
        which again are whole numbers, with a non-whole number quotient?
        For example, what about 7 / 2.
         */
        print("What if we divide two whole numbers with an irrational quotient?");

        int a = 7;
        int b = 2;
        int unknown = a / b;
        print("And the result is.... " + unknown + "... well that's not fun.\n");

        /*
        So what happened here? Well, we divide two whole numbers that did not evenly
        go into each other. 7 / 2 is 3.5, which is not an integer. So what happened?
        Well when you run 7 / 2 the computer does the math ends with 3.5, but an integer
        has to be whole number. So it just chops off the decimal. So 3.5 turns into 3
         */

        /*
        So what can hold an irrational number? Doubles and floats, but we're going to
        ignore floats for now. So what is a double?

        A double is a number that can have a decimal place. So lets look at those.
         */

        print("What if we added 3.5 to 2.75 to a double?");
        double decimal_sum = 3.5 + 2.75;
        print("The resulting sum: " + decimal_sum + "\n");

        /*
        So now if we assign 7 / 2 to a double, does that work as expected?
         */
        print("Lets try 7.0 / 2.0 again but assigned to a double?");
        double decimal_quotient = 7.0 / 2.0;
        print("The resulting sum: " + decimal_quotient + "\n");

        /*
        One last thing. Computers are pretty bad with being precise with decimals.
        If we multiply two doubles together, we will get an oddly.. close.. result.
         */
        print("Lets try 1.5 * 3.0 it should be 4.95. So lets see if it is.");
        double final_result = 1.5 * 3.3;
        print("The result is: " + final_result + " which is close.. but not 4.95\n");

        print("So we need to always be careful with what we use to represent numbers.");
        /*
        Boom. We now know how to do represent numbers in code.
         */
        print("And boom, we now know how to represent numbers in code.");
    }


    // Don't stress about this yet.
    public static void main(String[] args) {
        Numbers program = new Numbers();
        program.run();
        program.cleanup();
    }

}
