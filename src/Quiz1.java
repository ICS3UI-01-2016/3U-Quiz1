
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
 * @author baayl3669
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a city
        City af = new City();
        // create a robot
        Robot rem = new Robot(af, 4, 0, Direction.EAST);

        // create walls
        new Wall(af, 4, 2, Direction.WEST);
        new Wall(af, 4, 2, Direction.NORTH);
        new Wall(af, 3, 3, Direction.WEST);
        new Wall(af, 3, 3, Direction.NORTH);
        new Wall(af, 2, 4, Direction.WEST);
        new Wall(af, 2, 4, Direction.NORTH);
        new Wall(af, 2, 5, Direction.NORTH);
        new Wall(af, 2, 5, Direction.EAST);
        new Wall(af, 3, 6, Direction.NORTH);
        new Wall(af, 3, 6, Direction.EAST);
        new Wall(af, 4, 7, Direction.NORTH);
        new Wall(af, 4, 7, Direction.EAST);

        // create Things
        new Thing(af, 4, 1);
        new Thing(af, 3, 2);
        new Thing(af, 2, 3);
        new Thing(af, 1, 4);
        
        // make robot move and pick thing 
        rem.move();
        rem.pickThing();
        rem.turnLeft();
        rem.move();
        rem.turnLeft();
        rem.turnLeft();
        rem.turnLeft();
        rem.move();
        rem.pickThing();
        rem.turnLeft();
        rem.move();
        rem.turnLeft();
        rem.turnLeft();
        rem.turnLeft();
        rem.move();
        rem.pickThing();
        rem.turnLeft();
        rem.move();
        rem.turnLeft();
        rem.turnLeft();
        rem.turnLeft();
        rem.move();
        rem.pickThing();
        rem.move();
        rem.putThing();
        rem.move();
        rem.turnLeft();
        rem.turnLeft();
        rem.turnLeft();
        rem.move();
        rem.putThing();
        rem.turnLeft();
        rem.move();
        rem.turnLeft();
        rem.turnLeft();
        rem.turnLeft();
        rem.move();
        rem.putThing();
        rem.turnLeft();
        rem.move();
        rem.turnLeft();
        rem.turnLeft();
        rem.turnLeft();
        rem.move();
        rem.putThing();
        rem.turnLeft();
        rem.move();







    }
}
