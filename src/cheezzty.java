import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class cheezzty {
	public static void main(String[] args) {
		Robot cheese = new Robot();

		cheese.setSpeed(10);
		cheese.setPenWidth(8);
		cheese.setPenColor(Color.pink);
		cheese.penDown();
		cheese.move(400);
		cheese.penUp();
		cheese.move(-400);
		cheese.turn(-90);
		cheese.setPenColor(Color.GRAY);
		cheese.move(10);
		cheese.turn(90);
		cheese.penDown();
		cheese.move(400);
		cheese.move(-400);
		cheese.turn(90);
		cheese.move(200);
		cheese.turn(-90);
		cheese.move(5);
		cheese.setPenColor(Color.PINK);
		cheese.turn(-90);
		cheese.move(190);
		cheese.penUp();
		cheese.move(-400);

	}
}
