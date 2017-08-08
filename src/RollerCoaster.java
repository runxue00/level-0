import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How tall are you? (in inches)");
		int number = Integer.parseInt(answer);
		if(number <= 48){
			JOptionPane.showMessageDialog(null, "You are too short to ride this roller coaster. You must be 48 inches(4 feet) or taller to ride this roller coaster. "); 
		}
		else{
			JOptionPane.showMessageDialog(null, "You are tall enough to ride this roller coaster.");
		}
	}

}
