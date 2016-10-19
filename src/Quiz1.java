
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
 * @author ANNT0773
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       City kw=new City();
       Robot taylor=new Robot(kw,4,0,Direction.EAST);
       //creating the walls
       new Wall(kw,4,2,Direction.WEST);
       new Wall(kw,4,2,Direction.NORTH);
       new Wall(kw,3,3,Direction.WEST);
       new Wall(kw,3,3,Direction.NORTH);
       new Wall(kw,2,4,Direction.WEST);
       new Wall(kw,2,4,Direction.NORTH);
       new Wall(kw,2,5,Direction.NORTH);
       new Wall(kw,2,5,Direction.EAST);
       new Wall(kw,3,6,Direction.NORTH);
       new Wall(kw,3,6,Direction.EAST);
       new Wall(kw,4,7,Direction.NORTH);
       new Wall(kw,4,7,Direction.EAST);
       //put things
       new Thing(kw,4,1);
       new Thing(kw,3,2);
       new Thing(kw,2,3);
       new Thing(kw,1,4);
       //pick things and move
       taylor.canPickThing();
       taylor.move();
       taylor.pickThing();
       taylor.turnLeft();
       taylor.move();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.move();
       taylor.pickThing();
       taylor.turnLeft();
       taylor.move();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.move();
       taylor.pickThing();
       taylor.turnLeft();
       taylor.move();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.move();
       taylor.pickThing();
       taylor.move();
       taylor.putThing();
       taylor.move();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.move();
       taylor.turnLeft();
       taylor.putThing();
       taylor.move();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.move();
       taylor.turnLeft();
       taylor.putThing();
       taylor.move();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.turnLeft();
       taylor.move();
       taylor.turnLeft();
       taylor.putThing();
       taylor.move();
       
       
       
       // TODO code application logic here
    }
}
