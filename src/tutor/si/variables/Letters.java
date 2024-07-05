package tutor.si.variables;

import tutor.si.Application;

/**
 * This class shows how characters and strings are represented and treated
 * in code.
 *
 * @author Jonathan Turner
 * @version 1.0
 */
public class Letters extends Application {

    // Let's look at the code.
    public void run() {

        /*
        Characters are single letters or symbols. They are defined by single quotes and the keyword 'char'.
         */
        print("Let's start with characters.");

        char a = 'A';
        char b = 'B';
        print("We have two characters: " + a + " and " + b + "\n");

        print("We can compare characters. Is 'A' equal to 'B'?");
        boolean areEqual = a == b;
        print("Are they equal? " + areEqual + "\n");

        // Of course 'A' and 'B' are not the same, so the answer will be false.

        /*
        Now what if we compared 'A' to 'a'?
         */
        print("What if we compare 'A' to 'a'?");

        char c = 'a';
        boolean areEqual2 = a == c;
        print("Are they equal? " + areEqual2 + "\n");

        // So its important for us to know that all characters are case-sensitive and unique.

        /*
        So now how do we represent a word? We don't want to make a variable for each and every
        character in a word, so we will use a String.

        Strings can be added together, also called concatenated, and compared, but a little
        different. They are added together by using the + sign.
         */
        print("Now, let's move to strings.");

        String hello = "Hello";
        String world = "World";
        print("We have two strings: " + hello + " and " + world + "\n");

        print("We can concatenate strings. Let's concatenate 'Hello' and 'World'.");
        String helloWorld = hello + world;
        print(helloWorld + "\n");

        /*
        If we look at the output of helloWorld, we would see that the two words were put together,
        but there was no space between them. We can add a space by adding a space character to the
        concatenation.
         */

        print("Let's add a space between 'Hello' and 'World'.");
        String helloWorld2 = hello + " " + world;
        print(helloWorld2 + "\n");


        /*
        We can also compare strings. Is 'Hello' equal to 'Hello'?
         */
        print("We can also compare strings. Is 'Hello' equal to 'Hello'?");

        String hello2 = new String("Hello"); // This can be ignored for now.

        boolean areEqual3 = hello == hello2;
        print("Are they equal? " + areEqual3 + "\n");

        /*
        So what happened here? Well string are different then all the other data types we have
        seen so far. Strings are objects, and objects are not compared by their values, but by
        their stored location. So that means besides comparing "hello" to "hello", we are comparing
        the location of the first hello, to some completely different location of the second hello.

        So how do we compare strings? We use the .equals() method.
         */
        print("So how do we compare strings? We use the .equals() method.");
        boolean areEqual4 = hello.equals("Hello");
        print("Are they equal? " + areEqual4 + "\n");

        /*
        So now we know how to compare strings. Strings are how we represent words, sentences,
        certain numbers, paragraphs, and so much more in code. They are very useful and important
        to know how to use properly.
         */

        print("And that's a basic introduction to characters and strings in Java.");
    }

    public static void main(String[] args) {
        Letters program = new Letters();
        program.run();
    }
}
