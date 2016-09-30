
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
 * @author fabed2976
 */
public class A1Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city for the Robot
        City ch = new City ();
        Robot sehun = new Robot (ch, 4,0, Direction.EAST);
        
        //create wall
        new Wall (ch, 4,2, Direction. WEST);
        new Wall (ch, 4,2, Direction. NORTH);
        new Wall (ch, 3,3, Direction. WEST);
        new Wall (ch, 3,3, Direction. NORTH);
        new Wall (ch, 2,4, Direction. WEST);
        new Wall (ch, 2,4, Direction. NORTH);
        new Wall (ch, 2,5, Direction. NORTH);
        new Wall (ch, 2,5, Direction. EAST);
        new Wall (ch, 3,6, Direction. NORTH);
        new Wall (ch, 3,6, Direction. EAST);
        new Wall (ch, 4,7, Direction. NORTH);
        new Wall (ch, 4,7, Direction. EAST);
        new Thing (ch, 4,1);
        new Thing (ch, 3,2);
        new Thing (ch, 2,3);
        new Thing (ch, 1,4);
        
        //get sehun to move and pick up things
        sehun. move();
        sehun.pickThing();
        sehun. turnLeft();
        sehun.move();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun. move();
        sehun.pickThing();
        sehun. turnLeft();
        sehun.move();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun. move();
        sehun.pickThing();
        sehun. turnLeft();
        sehun.move();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.move ();
        sehun.pickThing();
        sehun.move();
        sehun.putThing();
        sehun.move();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.move();
        sehun.putThing();
        sehun.turnLeft();
        sehun.move();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.move();
        sehun.putThing();
        sehun.turnLeft();
        sehun.move();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.turnLeft();
        sehun.move();
        sehun.putThing(); 
        sehun.turnLeft();
        sehun.move();
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
    }
}
