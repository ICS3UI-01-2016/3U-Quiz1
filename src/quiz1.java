
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
 * @author lawd8918
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw = new City();

        //create walls
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

        //create things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);

        //create robot
        Robot dave = new Robot(kw, 4, 0, Direction.EAST);

        //climb stairs while picking up things
        dave.move();
        dave.pickThing();
        dave.turnLeft();
        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();

        dave.move();
        dave.pickThing();
        dave.turnLeft();
        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();

        dave.move();
        dave.pickThing();
        dave.turnLeft();
        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();

        dave.move();
        dave.pickThing();

        //head down the stairs while putting things down
        dave.move();
        dave.putThing();

        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();
        dave.move();
        dave.putThing();
        dave.turnLeft();

        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();
        dave.move();
        dave.putThing();
        dave.turnLeft();

        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();
        dave.move();
        dave.putThing();
        dave.turnLeft();

        //move to final position
        dave.move();
    }
}
