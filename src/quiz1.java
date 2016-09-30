
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
 * @author vandl4973
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new city
        City qs = new City();
        //new citizen
        Robot bob = new Robot(qs, 4, 0, Direction.EAST);
        // the hill he climbs
        new Wall(qs, 4, 2, Direction.WEST);
        new Wall(qs, 3, 3, Direction.WEST);
        new Wall(qs, 2, 4, Direction.WEST);
        new Wall(qs, 2, 5, Direction.EAST);
        new Wall(qs, 3, 6, Direction.EAST);
        new Wall(qs, 4, 7, Direction.EAST);
        new Wall(qs, 4, 2, Direction.NORTH);
        new Wall(qs, 3, 3, Direction.NORTH);
        new Wall(qs, 2, 4, Direction.NORTH);
        new Wall(qs, 2, 5, Direction.NORTH);
        new Wall(qs, 3, 6, Direction.NORTH);
        new Wall(qs, 4, 7, Direction.NORTH);
        //the objects he collects
        new Thing(qs, 3, 2);
        new Thing(qs, 2, 3);
        new Thing(qs, 4, 1);
        new Thing(qs, 1, 4);
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        bob.move();
        bob.putThing();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.putThing();
        bob.move();
    }
}
