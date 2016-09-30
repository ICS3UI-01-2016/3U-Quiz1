
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
 * @author tomlj9878
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create City and Robot
        City JT = new City();
        Robot climber = new Robot(JT,4,0,Direction.EAST);
        //create Walls
        new Wall(JT,4,2,Direction.WEST);
        new Wall(JT,4,2,Direction.NORTH);
        new Wall(JT,3,3,Direction.WEST);
        new Wall(JT,3,3,Direction.NORTH);
        new Wall(JT,2,4,Direction.WEST);
        new Wall(JT,2,4,Direction.NORTH);
        new Wall(JT,2,5,Direction.EAST);
        new Wall(JT,2,5,Direction.NORTH);
        new Wall(JT,3,6,Direction.EAST);
        new Wall(JT,3,6,Direction.NORTH);
        new Wall(JT,4,7,Direction.EAST);
        new Wall(JT,4,7,Direction.NORTH);
        //create Things
        new Thing(JT,4,1,Direction.EAST);
        new Thing(JT,3,2,Direction.EAST);
        new Thing(JT,2,3,Direction.EAST);
        new Thing(JT,1,4,Direction.EAST);
        //climb stairs
        climber.move();
        climber.pickThing();
        climber.turnLeft();
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        //1st Stair ^
        climber.move();
        climber.pickThing();
        climber.turnLeft();
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        //2nd Stair ^
        climber.move();
        climber.pickThing();
        climber.turnLeft();
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        climber.move();
        climber.pickThing();
        //3rd Stair ^
        climber.move();
        climber.putThing();
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        climber.move();
        //1st Stair ^
        climber.putThing();
        climber.turnLeft();
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        climber.move();
        //2nd Stair ^
        climber.putThing();
        climber.turnLeft();
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        climber.move();
        climber.putThing();
        climber.turnLeft();
        climber.move();
        //Done
        
    }
}
