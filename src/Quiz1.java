
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Make necessaries
        City kw = new City();
        RobotSE jim = new RobotSE(kw, 4, 0, Direction.EAST);
        //Needless labelling
        jim.setColor(Color.blue);
        jim.setLabel("Jim");
        //Make all walls
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        //Make all things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        //Put Jim in position
        jim.move();
        //Make loop run until final position
        while (jim.getAvenue() != 9) {
            //while he is on the first side he will pick up things
            if (jim.canPickThing()) {
                jim.pickThing();
                //if he's at the top he'll move to the other side
                if (jim.frontIsClear()) {
                    jim.move();
                } //if he isn't at the top he will ascend a step
                else if (!jim.frontIsClear()) {
                    jim.turnLeft();
                    jim.move();
                    jim.turnRight();
                    jim.move();
                }
            } //while he's on the other side of the mountain
            else if (!jim.canPickThing()) {
                jim.putThing();
                //last step will need a special movement
                if (jim.getAvenue() != 8) {
                    jim.move();
                    jim.turnRight();
                    jim.move();
                    jim.turnLeft();
                } //all he needs is one movement at the end
                else if (jim.getAvenue() == 8) {
                    jim.move();
                }
            }
        }
    }
}
