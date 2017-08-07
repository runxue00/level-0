import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Tortoise_Houses {
	public static void main(String[] args) {
		//1. have the tortoise start in the bottom left corner
  Robot houseDrawer = new Robot();
  //HouseDrawer.setX(0);
  houseDrawer.moveTo(0, 500);
  //HouseDrawer.setY(900);
  //houseDrawer.
		//2. draw a house of height 100 with grass after it. This shape: |**|_
  houseDrawer.penDown();
  
  houseDrawer.setPenWidth(10);
  
  houseDrawer.setSpeed(210);
  
  houseDrawer.turn(90);
  
  houseDrawer.setPenColor(0,204,0);
  houseDrawer.move(200);
  
  for (int i = 0; i < 10; i++) {
  houseDrawer.setPenColor(Color.black);
  
  houseDrawer.turn(-90);
  
  houseDrawer.move(300);
  
  houseDrawer.turn(90);
  
  houseDrawer.move(100);
  
  houseDrawer.turn(90);
  
  houseDrawer.move(300);
  
  houseDrawer.turn(-90);
  
  houseDrawer.setPenColor(0,204,0);

  houseDrawer.move(40);
  
  }
  houseDrawer.move(40);
  houseDrawer.setPenColor(Color.DARK_GRAY);
  houseDrawer.turn(-90);
  houseDrawer.move(100);
  houseDrawer.turn(45);
  houseDrawer.move(100);
  houseDrawer.turn(90);
  houseDrawer.move(100);
  houseDrawer.turn(45);
  houseDrawer.move(100);
  houseDrawer.turn(-90);
  houseDrawer.setPenColor(0,204,0);
  houseDrawer.move(300);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  //houseDrawer.setPenColor(0,204,0);
  //houseDrawer.move(300);
  
  
		//3. extract the piece of code that draws the house into a method. Draw 10 houses.

		//4. Change the method to take int height as a parameter. Draw 9 houses of different heights

		//5. Make the method take a String instead of a height. 	
			
		//“small” 		60
		//“medium”	 	120
		//“large”			250

		//6. Make the method take a color as well as a height. The houses are drawn in that color.

		//[optional] Set the scene to night time by setting the background to black using Tortoise.getBackgroundWindow().setColor

		//7. Give the houses peaked roofs

		//8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”.

		//9. make large houses have flat rooves

	}

}
