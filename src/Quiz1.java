
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
 * @author dhimm3399
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //create a city of the robot 

       City On = new City ();
        
       //create a robot 
       Robot Krina = new Robot (On,4,0,Direction.EAST);
       
       new Wall(On,4,2,Direction.WEST);
       new Wall(On,3,2,Direction.SOUTH);
       new Wall(On,3,3,Direction.WEST);
       new Wall(On,2,3,Direction.SOUTH);
       new Wall(On,2,4,Direction.WEST);
       new Wall(On,1,4,Direction.SOUTH);
       new Wall(On,1,5,Direction.SOUTH);
       new Wall(On,2,5,Direction.EAST);
       new Wall(On,2,6,Direction.SOUTH);
       new Wall(On,3,6,Direction.EAST);
       new Wall(On,3,7,Direction.SOUTH);
       new Wall(On,4,7,Direction.EAST);
       new Thing(On,4,1);
       new Thing(On,3,2);
       new Thing(On,2,3);
       new Thing(On,1,4);
       
       Krina.move();
       Krina.pickThing();
       Krina.turnLeft();
       Krina.move();
       Krina.turnLeft();
       Krina.turnLeft();
       Krina.turnLeft();
       Krina.move();
       Krina.pickThing();
       Krina.turnLeft();
       Krina.move();
       Krina.turnLeft();
       Krina.turnLeft();
       Krina.turnLeft();
       Krina.move();
       Krina.pickThing();
       Krina.turnLeft();
       Krina.move();
       Krina.turnLeft();
       Krina.turnLeft();
       Krina.turnLeft();
       Krina.move();
       Krina.pickThing();
       Krina.move();
       Krina.putThing();
       Krina.move();
       Krina.turnLeft();
       Krina.turnLeft();
       Krina.turnLeft();
       Krina.move();
       Krina.putThing();
       Krina.turnLeft();
      Krina.move();
      Krina.turnLeft();
      Krina.turnLeft();
      Krina.turnLeft();
      Krina.move();
      Krina.putThing();
      Krina.turnLeft();
      Krina.move();
      Krina.turnLeft();
      Krina.turnLeft();
      Krina.turnLeft();
      Krina.move();
      Krina.putThing();
      Krina.turnLeft();
      Krina.move();
       
        
        
        
        
        
        
        
        
        
        
    }
}
