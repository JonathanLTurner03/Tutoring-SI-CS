package tutor.assgn.A2_Turtle;

public class Turtle {

    // Private Fields
    private int x, y;
    private boolean tailDown;
    private int direction;
    private final char[][] grid;
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    /**
     * Constructor for the Turtle class
     * @param gridSize The size of the drawing grid
     */
    public Turtle(int gridSize) {
        this.x = 0;
        this.y = 0;
        this.tailDown = false;
        this.direction = 0; // Start moving right
        this.grid = new char[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    /**
     * Raises the tail and stops drawing the path in the grid
     */
    public void tailUp() {
        this.tailDown = false;
    }

    /**
     * Lowers the tail and starts drawing the path in the grid
     */
    public void tailDown() {
        this.tailDown = true;
    }

    /**
     * Turns the turtle to the right
     */
    public void turnRight() {
        this.direction = (this.direction + 1) % directions.length;
    }

    /**
     * Turns the turtle to the left
     */
    public void turnLeft() {
        this.direction = (this.direction - 1 + directions.length) % directions.length;
    }

    /**
     * Moves the turtle one step in the current direction
     */
    public void move() {
        move(1);
    }

    /**
     * Moves the turtle a specified number of steps in the current direction
     * @param steps The number of steps to move
     */
    public void move(int steps) {
        for (int i = 0; i < steps; i++) {
            int newX = this.x + directions[this.direction][0];
            int newY = this.y + directions[this.direction][1];

            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length) {
                if (this.tailDown) {
                    grid[this.x][this.y] = '#';
                }

                this.x = newX;
                this.y = newY;

                clearConsole();
                System.out.flush();

                // Print the grid
                printGrid();

                // Add a delay
                try {
                    Thread.sleep(250); // 500 milliseconds = 0.5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Prints the grid with the turtle's current position
     */
    public void printGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == this.x && j == this.y) {
                    // This is the turtle's current position
                    switch (this.direction) {
                        case 0:
                            System.out.print('>');
                            break;
                        case 1:
                            System.out.print('v');
                            break;
                        case 2:
                            System.out.print('<');
                            break;
                        case 3:
                            System.out.print('^');
                            break;
                    }
                } else {
                    System.out.print(grid[i][j]);
                }
            }
            System.out.println();
        }
    }

    /**
     * Clears the console by adding 50 new lines
     */
    public void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}