
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
 * @author katop7929
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kpl = new City();
        
        //create a robot
        Robot obama = new Robot(kpl,4,0,Direction.EAST);
        
        //create walls 
        new Wall(kpl,4,2,Direction.WEST);
        new Wall(kpl,4,2,Direction.NORTH);
        new Wall(kpl,3,3,Direction.WEST);
        new Wall(kpl,2,4,Direction.WEST);
        new Wall(kpl,2,4,Direction.NORTH);
        new Wall(kpl,2,5,Direction.NORTH);
        new Wall(kpl,3,3,Direction.NORTH);
        new Wall(kpl,2,5,Direction.EAST);
        new Wall(kpl,3,6,Direction.EAST);
        new Wall(kpl,4,7,Direction.EAST);
        new Wall(kpl,3,6,Direction.NORTH);
        new Wall(kpl,4,7,Direction.NORTH);
        
        //make things 
        new Thing(kpl,4,1); 
        new Thing(kpl,3,2);
        new Thing(kpl,2,3);
        new Thing(kpl,1,4);
        
        //get robot to move
        obama.move();
        obama.pickThing();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.pickThing();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.pickThing();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.pickThing();
        obama.move();
        obama.putThing();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.putThing();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.putThing();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.putThing();
        obama.turnLeft();
        obama.move(); 
    }
}
