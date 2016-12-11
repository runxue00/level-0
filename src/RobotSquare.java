
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Robot Square
 *    Duration=.25
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=for loop
 *    
 *    
 ******************************************************************************/

/**
 Used in workshop	
 Introduce for loops before beginning.	
*/

import org.jointheleague.graphical.robot.Robot;


public class RobotSquare {
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot slack=new Robot();

        // 3. Put the robot's pen down
slack.penDown();

        // 6. Make the robot move as fast as possible
slack.setSpeed(10);

        // 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {
	


        //         2. Move your robot 200 pixels
slack.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
slack.turn(90);

}

    }
}