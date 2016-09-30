
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city
        City kw = new City();

        //make the mountain (a.k.a. walls)
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);

        //Make the things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);

        //Create the Robot
        RobotSE bob = new RobotSE(kw, 4, 0, Direction.EAST);

        //Make robot climb up first half while picking things up
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.pickThing();

        //Make robot go down second half of mountain while dropping things
        bob.move();
        bob.putThing();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
    }
}