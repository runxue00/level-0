import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class Buzzbot {
    Robot buzz = new Robot();
	private String Shape;
	private String imageURL;

	 
	public Buzzbot(String Shape, String imageURL) {
		this.imageURL = imageURL;
		this.Shape = Shape;
		buzz.changeRobot(this.imageURL);
	}
	public String getShape() {
		return Shape;
	}
	public void setShape(String Shape) {
		this.Shape=Shape;
	}
	public String getimageURL() {
		return Shape;
	}
	public void setimageURL(String imageURL) {
		this.imageURL=imageURL;
		buzz.changeRobot(this.imageURL);
	}
	public void draw() {
		for(int i = 0; i<360;i++) {
			buzz.setSpeed(40);
			buzz.penDown();
			buzz.move(1);
			buzz.turn(360/360);
		}
	}
}
