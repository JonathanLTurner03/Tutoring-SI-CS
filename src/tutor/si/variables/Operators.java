package tutor.si.variables;

public class Operators {

    public void run() {
        // The '=' operator is used for assignment.
        System.out.println("Let's start with the = operator.");
        int a = 5;
        int b = 10;
        System.out.println("We have two numbers: a = " + a + " and b = " + b);

        // The '==' operator is used for comparison, tells whether two values are equal.
        System.out.println("\nNow, let's move to the == operator.");
        boolean isEqual = a == b;
        System.out.println("Is 'a' equal to 'b'? " + isEqual);

        // The '!' operator is used for logical negation, if you have true, then !true is false.
        System.out.println("\nLet's demonstrate the ! operator.");

        boolean isNotEqual = !(a == b);
        // this can also be written as (a != b) which reads as 'a is not equal to b'

        System.out.println("Is 'a' not equal to 'b'? " + isNotEqual);

        // The '<', '>', '<=', and '>=' operators are used for comparison.
        System.out.println("\nNow, let's demonstrate the <, >, <=, and >= operators.");
        boolean isLessThan = a < b;
        System.out.println("Is 'a' less than 'b'? " + isLessThan);

        boolean isGreaterThan = a > b;
        System.out.println("Is 'a' greater than 'b'? " + isGreaterThan);

        boolean isLessThanOrEqual = a <= b;
        System.out.println("Is 'a' less than or equal to 'b'? " + isLessThanOrEqual);

        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Is 'a' greater than or equal to 'b'? " + isGreaterThanOrEqual);
    }

    public static void main(String[] args) {
        Operators program = new Operators();
        program.run();
    }
}