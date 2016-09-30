
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
 * @author slatz8075
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City Quiz1 = new City();
        //Create robot
        Robot karel = new Robot(Quiz1, 4, 0, Direction.EAST);
        //Create the walls
        new Wall(Quiz1, 4, 2, Direction.WEST);
        new Wall(Quiz1, 4, 2, Direction.NORTH);
        new Wall(Quiz1, 3, 3, Direction.WEST);
        new Wall(Quiz1, 3, 3, Direction.NORTH);
        new Wall(Quiz1, 2, 4, Direction.WEST);
        new Wall(Quiz1, 2, 4, Direction.NORTH);
        new Wall(Quiz1, 2, 5, Direction.EAST);
        new Wall(Quiz1, 2, 5, Direction.NORTH);
        new Wall(Quiz1, 3, 6, Direction.EAST);
        new Wall(Quiz1, 3, 6, Direction.NORTH);
        new Wall(Quiz1, 4, 7, Direction.EAST);
        new Wall(Quiz1, 4, 7, Direction.NORTH);
        //Create the Things
        new Thing(Quiz1,4,1);
        new Thing(Quiz1,3,2);
        new Thing(Quiz1,2,3);
        new Thing(Quiz1,1,4);
        //Get karel to move and pick up things
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
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
