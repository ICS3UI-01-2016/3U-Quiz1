
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
 * @author manok5757
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();

        // create a robot to perform the required task
        Robot cliff = new Robot(km, 4, 0, Direction.EAST);

        // create the stairs in the city which cliff will climb and descend
        new Wall(km, 4, 2, Direction.WEST);
        new Wall(km, 4, 2, Direction.NORTH);
        new Wall(km, 3, 3, Direction.WEST);
        new Wall(km, 3, 3, Direction.NORTH);
        new Wall(km, 2, 4, Direction.WEST);
        new Wall(km, 2, 4, Direction.NORTH);
        new Wall(km, 2, 5, Direction.NORTH);
        new Wall(km, 2, 5, Direction.EAST);
        new Wall(km, 3, 6, Direction.NORTH);
        new Wall(km, 3, 6, Direction.EAST);
        new Wall(km, 4, 7, Direction.NORTH);
        new Wall(km, 4, 7, Direction.EAST);

        // place things along the stairs for cliff to pick up and eventually put down
        new Thing(km, 4, 1);
        new Thing(km, 3, 2);
        new Thing(km, 2, 3);
        new Thing(km, 1, 4);

        // instruct cliff to get to the top of the stairs, picking things up along the way
        cliff.move();
        cliff.pickThing();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        cliff.pickThing();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        cliff.pickThing();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        cliff.pickThing();

        // instruct cliff to descend down the stairs, while putting things down periodically
        cliff.move();
        cliff.putThing();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.putThing();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.putThing();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.putThing();
        cliff.move();


    }
}
