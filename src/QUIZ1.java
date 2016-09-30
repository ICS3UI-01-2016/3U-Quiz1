
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
 * @author petet9087
 */
public class QUIZ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a new city
        City kw = new City();
        // create a robot
        RobotSE lang = new RobotSE(kw, 4, 0, Direction.EAST);
        // create new walls to make he hill he climbs
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
        // create new things/objects for lang to pick up and move
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        // get lang to move
        // get lang to climb the first part of the hill
        lang.move();
        lang.pickThing();
        lang.turnLeft();
        lang.move();
        lang.turnRight();
        // get lang to climb the first part of the hill
        lang.move();
        lang.pickThing();
        lang.turnLeft();
        lang.move();
        lang.turnRight();
        // get lang to climb the second part of the hill
        lang.move();
        lang.pickThing();
        lang.turnLeft();
        lang.move();
        lang.turnRight();
        // get lang to climb the third part of the hill
        lang.move();
        lang.pickThing();
        //get labng to move down the hill
        lang.move();
        lang.putThing();
        lang.move();
        lang.turnRight();
        lang.move();
        lang.turnLeft();
        lang.putThing();
        lang.move();
        lang.turnRight();
        lang.move();
        lang.turnLeft();
        lang.putThing();
        lang.move();
        lang.turnRight();
        lang.move();
        lang.turnLeft();
        lang.putThing();
        lang.move();



    }
}
