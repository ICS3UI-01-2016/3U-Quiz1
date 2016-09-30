
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tmister911
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot geo = new Robot(kw, 4, 0, Direction.EAST);
        Wall Wall = new Wall(kw, 4, 2, Direction.WEST);
//Goin up
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
// Goin down
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
// Things 
        Thing Thing = new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
//moving up
        geo.move();
        geo.turnLeft();
        geo.pickThing();
        geo.move();
        geo.turnLeft();
        geo.turnLeft();
        geo.turnLeft();
        geo.move();
        geo.pickThing();
        geo.turnLeft();
        geo.move();
        geo.turnLeft();
        geo.turnLeft();
        geo.turnLeft();
        geo.move();
        geo.pickThing();
        geo.turnLeft();
        geo.move();
        geo.turnLeft();
        geo.turnLeft();
        geo.turnLeft();
        geo.move();
        geo.pickThing();
//going down
        geo.move();
        geo.putThing();
        geo.move();
        geo.turnLeft();
        geo.turnLeft();
        geo.turnLeft();
        geo.move();
        geo.putThing();
        geo.turnLeft();
        geo.move();
        geo.turnLeft();
        geo.turnLeft();
        geo.turnLeft();
        geo.move();
        geo.putThing();
        geo.turnLeft();
        geo.move();
        geo.turnLeft();
        geo.turnLeft();
        geo.turnLeft();
        geo.move();
        geo.putThing();
        geo.turnLeft();
        geo.move();
    }

}
