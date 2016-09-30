
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // create a robot
        Robot karel = new Robot(kw, 4, 0, Direction.EAST);

        // create walls
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);

        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.NORTH);

        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.EAST);

        // create a thing
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);

        // get robot to move up and pick thing

        int moves = 0;

        while (moves < 3) {
            karel.move();
            karel.pickThing();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();

            // add 1 to the movement counter
            moves = moves + 1;
        }

        // finish up moving

        karel.move();
        karel.pickThing();

        // get robot to move down and place thing


        karel.move();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();

        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();

        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();

        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();











    }
}
