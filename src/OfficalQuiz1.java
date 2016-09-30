
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
 * @author gavra1870
 */
public class OfficalQuiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for robot
        City jk = new City();
        Robot bob = new Robot(jk, 6, 0, Direction.EAST);
        // new walls
         new Wall(jk, 6, 2, Direction.WEST);
         new Wall(jk, 6, 2, Direction.NORTH);
         new Wall(jk, 5, 3, Direction.WEST);
         new Wall(jk, 5, 3, Direction.NORTH);
         new Wall(jk, 4, 4, Direction.WEST);
         new Wall(jk, 4, 4, Direction.NORTH);
         new Wall(jk, 4, 5, Direction.NORTH);
         new Wall(jk, 5, 6, Direction.EAST);
         new Wall(jk, 5, 6, Direction.NORTH);
         new Wall(jk, 4, 5, Direction.EAST);
         new Wall(jk, 6, 7, Direction.NORTH);
         new Wall(jk,6, 7, Direction.EAST);
         new Thing(jk, 6, 1);
         new Thing(jk, 5, 2);
         new Thing(jk, 4, 3);
         new Thing(jk, 3, 4);
         
         //get bob to move and pick up Thing
         bob.move();
         bob.pickThing();
         bob.turnLeft(); 
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.pickThing();
         bob.turnLeft();
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.pickThing();
         bob.turnLeft();
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.pickThing();
         bob.move();
         bob.putThing();
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.putThing();
         bob.turnLeft();
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.putThing();
         bob.turnLeft();
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.putThing();   
    }
}
