
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
 * @author ayyaf3300
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        // create a city for the robot
        City kw = new City();
        // create a robot for it to pick things and drop things while moving around the walls
        Robot dino = new Robot(kw, 4, 0, Direction.EAST);
        // create walls in a staircase pattern
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
        // create things for robot to pick up
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        // make the robot move to pick up the things and then drop them on the other side of the "staircase."
        dino.move();
        dino.pickThing();
        dino.turnLeft();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        dino.pickThing();
        dino.turnLeft();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        dino.pickThing();
        dino.turnLeft();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        dino.pickThing();
        dino.move();
        dino.putThing();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        dino.putThing();
        dino.turnLeft();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        dino.putThing();
        dino.turnLeft();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        dino.putThing();
        dino.turnLeft();
        dino.move();
        // end of program
    }
}
