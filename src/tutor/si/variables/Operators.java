package tutor.si.variables;

import tutor.si.Application;

public class Operators extends Application {

    public void run() {
        // The '=' operator is used for assignment.
        print("Let's start with the = operator.");
        int a = 5;
        int b = 10;
        print("We have two numbers: a = " + a + " and b = " + b);

        // The '==' operator is used for comparison, tells whether two values are equal.
        print("\nNow, let's move to the == operator.");
        boolean isEqual = a == b;
        print("Is 'a' equal to 'b'? " + isEqual);

        // The '!' operator is used for logical negation, if you have true, then !true is false.
        print("\nLet's demonstrate the ! operator.");

        boolean isNotEqual = !(a == b);
        // this can also be written as (a != b) which reads as 'a is not equal to b'

        print("Is 'a' not equal to 'b'? " + isNotEqual);

        // The '<', '>', '<=', and '>=' operators are used for comparison.
        print("\nNow, let's demonstrate the <, >, <=, and >= operators.");
        boolean isLessThan = a < b;
        print("Is 'a' less than 'b'? " + isLessThan);

        boolean isGreaterThan = a > b;
        print("Is 'a' greater than 'b'? " + isGreaterThan);

        boolean isLessThanOrEqual = a <= b;
        print("Is 'a' less than or equal to 'b'? " + isLessThanOrEqual);

        boolean isGreaterThanOrEqual = a >= b;
        print("Is 'a' greater than or equal to 'b'? " + isGreaterThanOrEqual);
    }

    public static void main(String[] args) {
        Operators program = new Operators();
        program.run();
        program.cleanup();
    }
}