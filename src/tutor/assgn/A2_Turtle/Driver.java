package tutor.assgn.A2_Turtle;

public class Driver {

    public static void main(String[] args) {
        Turtle turtle = new Turtle(10);

        turtle.tailDown();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.tailUp();

        turtle.turnRight();
        turtle.move(7);
        turtle.turnRight();

        turtle.printGrid();
    }
}
