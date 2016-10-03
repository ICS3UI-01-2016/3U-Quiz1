
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Create a city
         City quiz = new City();
        // Create a robot
          Robot a; 
          a = new Robot(quiz,4,0,Direction.EAST);
          a.setColor(new Color(196, 42, 213));
        // Create things
            new Thing(quiz,4,1);
            new Thing(quiz,3,2);
            new Thing(quiz,2,3);
            new Thing(quiz,1,4);
         // Create walls
            new Wall(quiz,4,2,Direction.WEST);
            new Wall(quiz,4,2,Direction.NORTH);
            new Wall(quiz,3,3,Direction.WEST);
            new Wall(quiz,3,3,Direction.NORTH);
            new Wall(quiz,2,4,Direction.WEST);
            new Wall(quiz,2,4,Direction.NORTH);
            new Wall(quiz,2,5,Direction.NORTH);
            new Wall(quiz,2,5,Direction.EAST);
            new Wall(quiz,3,6,Direction.NORTH);
            new Wall(quiz,3,6,Direction.EAST);
            new Wall(quiz,4,7,Direction.NORTH);
            new Wall(quiz,4,7,Direction.EAST);
            
        // Movements
            a.move();
            a.pickThing();
            a.turnLeft();
            a.move();
            a.turnLeft();
            a.turnLeft();
            a.turnLeft();
            a.move();
            a.pickThing();
            a.turnLeft();
            a.move();
            a.turnLeft();
            a.turnLeft();
            a.turnLeft();
            a.move();
            a.pickThing();
            a.turnLeft();
            a.move();
            a.turnLeft();
            a.turnLeft();
            a.turnLeft();
            a.move();
            a.pickThing();
            a.move();
            a.putThing();
            a.move();
            a.turnLeft();
            a.turnLeft();
            a.turnLeft();
            a.move();
            a.putThing();
            a.turnLeft();
            a.move();
            a.turnLeft();
            a.turnLeft();
            a.turnLeft();
            a.move();
            a.putThing();
            a.turnLeft();
            a.move();
            a.turnLeft();
            a.turnLeft();
            a.turnLeft();
            a.move();
            a.putThing();
            a.turnLeft();
            a.move();
            
            
           
            
            
            
            
                
            
           
    }
}
