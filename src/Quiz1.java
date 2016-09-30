
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
 * @author shieg0688
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //quizStart
        //Create City 
        City chiraq = new City();
        //Build stairs
        new Wall(chiraq, 4, 2, Direction.WEST);
        new Wall(chiraq, 4, 2, Direction.NORTH);
        new Wall(chiraq, 3, 3, Direction.WEST);
        new Wall(chiraq, 3, 3, Direction.NORTH);
        new Wall(chiraq, 2, 4, Direction.WEST);
        new Wall(chiraq, 2, 4, Direction.NORTH);
        new Wall(chiraq, 2, 5, Direction.NORTH);
        new Wall(chiraq, 2, 5, Direction.EAST);
        new Wall(chiraq, 3, 6, Direction.NORTH);
        new Wall(chiraq, 3, 6, Direction.EAST);
        new Wall(chiraq, 4, 7, Direction.EAST);
        new Wall(chiraq, 4, 7, Direction.NORTH);
        //Place Things
        new Thing(chiraq, 1, 4);
        new Thing(chiraq, 2, 3);
        new Thing(chiraq, 3, 2);
        new Thing(chiraq, 4, 1);
        //Create robot
        Robot rondo = new Robot(chiraq, 4, 0, Direction.EAST);
        //Command rondo to pick Things
        rondo.move();
        rondo.pickThing();
        rondo.turnLeft();
        rondo.move();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.move();
        rondo.pickThing();
        rondo.turnLeft();
        rondo.move();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.move();
        rondo.pickThing();
        rondo.turnLeft();
        rondo.move();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.move();
        rondo.pickThing();
        //Command rondo to put Things
        rondo.move();
        rondo.putThing();
        rondo.move();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.move();
        rondo.putThing();
        rondo.turnLeft();
        rondo.move();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.move();
        rondo.putThing();
        rondo.turnLeft();
        rondo.move();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.turnLeft();
        rondo.move();
        rondo.putThing();
        rondo.turnLeft();
        rondo.move();
        //quizEnd
        




    }
}
