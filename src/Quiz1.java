
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create city
        City q1 = new City();

        // Create stairs
        new Wall(q1, 4, 2, Direction.WEST);
        new Wall(q1, 4, 2, Direction.NORTH);
        new Wall(q1, 3, 3, Direction.WEST);
        new Wall(q1, 3, 3, Direction.NORTH);
        new Wall(q1, 2, 4, Direction.WEST);
        new Wall(q1, 2, 4, Direction.NORTH);
        new Wall(q1, 2, 5, Direction.NORTH);
        new Wall(q1, 2, 5, Direction.EAST);
        new Wall(q1, 3, 6, Direction.NORTH);
        new Wall(q1, 3, 6, Direction.EAST);
        new Wall(q1, 4, 7, Direction.NORTH);
        new Wall(q1, 4, 7, Direction.EAST);

        // Create robot
        RobotSE rick = new RobotSE(q1, 4, 0, Direction.EAST);

        // Create things
        new Thing(q1, 4, 1);
        new Thing(q1, 3, 2);
        new Thing(q1, 2, 3);
        new Thing(q1, 1, 4);

        // rick goes up mountain picking up things, looped
        // Create integer to store moves
        int moves = 0;
        // Move 3 times before stopping
        while (moves < 3) {
            // Each loop = 1 move
            moves = moves + 1;
            // Looped actions
            rick.move();
            rick.pickThing();
            rick.turnLeft();
            rick.move();
            rick.turnRight();
        }

        // Actions at top of stairs
        rick.move();
        rick.pickThing();

        // rick moves down stairs dropping things (can't do another loop)
        rick.move();
        rick.putThing();
        rick.move();
        rick.turnRight();
        rick.move();
        rick.putThing();
        rick.turnLeft();
        rick.move();
        rick.turnRight();
        rick.move();
        rick.putThing();
        rick.turnLeft();
        rick.move();
        rick.turnRight();
        rick.move();
        rick.putThing();
        
        // Actions at bottom of stairs
        rick.turnLeft();
        rick.move();

    }
}
