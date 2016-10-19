
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
 * @author woodc9217
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 4, 0, Direction.EAST);
        //Place Walls
        new Wall(mtl, 4, 2, Direction.WEST);
        new Wall(mtl, 3, 3, Direction.WEST);
        new Wall(mtl, 2, 4, Direction.WEST);
        new Wall(mtl, 2, 5, Direction.EAST);
        new Wall(mtl, 4, 2, Direction.NORTH);
        new Wall(mtl, 3, 3, Direction.NORTH);
        new Wall(mtl, 2, 4, Direction.NORTH);
        new Wall(mtl, 2, 5, Direction.NORTH);
        new Wall(mtl, 3, 6, Direction.EAST);
        new Wall(mtl, 4, 7, Direction.EAST);
        new Wall(mtl, 3, 6, Direction.NORTH);
        new Wall(mtl, 4, 7, Direction.NORTH);
        //Place things
        new Thing(mtl, 4, 1);
        new Thing(mtl, 3, 2);
        new Thing(mtl, 2, 3);
        new Thing(mtl, 1, 4);
        //Instruct Robot to climb up the stairs while picking up things
        candice.move();
        candice.pickThing();
        candice.turnLeft();
        candice.move();
        candice.turnLeft();
        candice.turnLeft();
        candice.turnLeft();
        candice.move();
        candice.pickThing();
        //repeat upstairs actions
        candice.turnLeft();
        candice.move();
        candice.turnLeft();
        candice.turnLeft();
        candice.turnLeft();
        candice.move();
        candice.pickThing();
        //repeat upstairs actions
        candice.turnLeft();
        candice.move();
        candice.turnLeft();
        candice.turnLeft();
        candice.turnLeft();
        candice.move();
        candice.pickThing();
        //Instruct Robot to climb down the stairs, putting down things
        candice.move();
        candice.putThing();
        candice.move();
        candice.turnLeft();
        candice.turnLeft();
        candice.turnLeft();
        candice.move();
        candice.turnLeft();
        candice.putThing();
        //repeat downstairs actions
        candice.move();
        candice.turnLeft();
        candice.turnLeft();
        candice.turnLeft();
        candice.move();
        candice.turnLeft();
        candice.putThing();
        //repeat downstairs actions
        candice.move();
        candice.turnLeft();
        candice.turnLeft();
        candice.turnLeft();
        candice.move();
        candice.turnLeft();
        candice.putThing();
        //End
        candice.move();



    }
}
