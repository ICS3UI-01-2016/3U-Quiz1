
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
 * @author wangk9757
 */
public class START {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for the robot and walls and things
        City kw = new City();
        //create robot 
        Robot john = new Robot(kw,4,0,Direction.EAST);
        //create walls
        new Wall (kw,4,2,Direction.WEST);
        new Wall (kw,4,2,Direction.NORTH);
        new Wall (kw,3,3,Direction.WEST);
        new Wall (kw,3,3,Direction.NORTH);
        new Wall (kw,2,4,Direction.WEST);
        new Wall (kw,2,4,Direction.NORTH);
        new Wall (kw,2,5,Direction.NORTH);
        new Wall (kw,2,5,Direction.EAST);
        new Wall (kw,3,6,Direction.NORTH);
        new Wall (kw,3,6,Direction.EAST);
        new Wall (kw,4,7,Direction.EAST);
        new Wall (kw,4,7,Direction.NORTH);
        //create things for robot to pick up and drop 
        new Thing(kw,1,4);
        new Thing(kw,3,2);
        new Thing(kw,2,3);
        new Thing(kw,4,1);
        //get john to pick up the things while scaling the mountain
        john.move();
        john.pickThing();
        john.turnLeft();
        john.move();
        john.turnLeft();
        john.turnLeft();
        john.turnLeft();
        john.move();
        john.pickThing();
        john.turnLeft();
        
        john.move();
        
        john.turnLeft();
        john.turnLeft();
        john.turnLeft();
        john.move();
        john.pickThing();
        john.turnLeft();
        john.move();
        john.turnLeft();
        john.turnLeft();
        john.turnLeft();
        john.move();
        john.pickThing();
        john.move();
        john.putThing();
        john.move();
        john.turnLeft();
        john.turnLeft();
        john.turnLeft();
        john.move();
        john.putThing();
        john.turnLeft();
        
        john.move();
        john.turnLeft();
        john.turnLeft();
        john.turnLeft();
        john.move();
        john.putThing();
        john.turnLeft();
        
        john.move();
        john.turnLeft();
        john.turnLeft();
        john.turnLeft();
        john.move();
        john.putThing();
        john.turnLeft();
        john.move();
               
    }
}
