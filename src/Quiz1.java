
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 * Quiz 1 30/09/2016
 *
 * @author micla1676
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for the robot
        City Quiz = new City();

        //create a robot 
        Robot karel = new Robot(Quiz, 4, 0, Direction.EAST);

        //create walls
        new Wall(Quiz, 4, 2, Direction.WEST);
        new Wall(Quiz, 4, 2, Direction.NORTH);
        new Wall(Quiz, 3, 3, Direction.WEST);
        new Wall(Quiz, 3, 3, Direction.NORTH);
        new Wall(Quiz, 2, 4, Direction.WEST);
        new Wall(Quiz, 2, 4, Direction.NORTH);
        new Wall(Quiz, 2, 5, Direction.EAST);
        new Wall(Quiz, 2, 5, Direction.NORTH);
        new Wall(Quiz, 3, 6, Direction.EAST);
        new Wall(Quiz, 3, 6, Direction.NORTH);
        new Wall(Quiz, 4, 7, Direction.EAST);
        new Wall(Quiz, 4, 7, Direction.NORTH);


        //create things for the robot to pick up
        new Thing(Quiz, 4, 1);
        new Thing(Quiz, 3, 2);
        new Thing(Quiz, 2, 3);
        new Thing(Quiz, 1, 4);



        //get karel to execute program
        //create a variable to stop movement
        int moves = 0;

        //loop that tells karel to exceute movements 3 times only
        while (moves < 3) {
            //tells robot to move
            karel.move();
            //pick up thing
            karel.pickThing();
            //karel turns left
            karel.turnLeft();
            //karel move
            karel.move();
            //karel turns right
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();

            //add 1 to integer
            moves = moves + 1;
        }

        //karel move
        karel.move();
        //karel pick thing
        karel.pickThing();
        //karel moves forward
        karel.move();

        //get karel to execute program
        //create a variable to stop movement
        int movesTwo = 0;
        //loop that tells karel to exceute movements 3 times only
        while (movesTwo < 3) {
            //karel puts thing down
            karel.putThing();
            //karel moves forward
            karel.move();

            //karel turns right
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            //karel moves forward
            karel.move();
            //karel turns left
            karel.turnLeft();
            // add 1 to integer
            movesTwo = movesTwo + 1;

        }

        //karel puts thing down
        karel.putThing();

        //karel moves forward
        karel.move();


    }
}
