import javax.swing.JOptionPane;

public class Grader {
	public static void main(String[] args) {
		String squirt = JOptionPane.showInputDialog("Enter a scorebetween 0-100...");
		int squirtball = Integer.parseInt(squirt);
		if (squirtball >= 90 && squirtball <= 100) {
			System.out.println("You got an A!!!");
		} else if (squirtball >= 80 && squirtball <= 89) {
			System.out.println("You got a B!!!");
		} else if (squirtball >= 70 && squirtball <= 79) {
			System.out.println("You got a C!!!");
		} else if (squirtball >= 60 && squirtball <= 69) {
			System.out.println("You got a D!!!");
		} else if (squirtball >= 0 && squirtball <= 59) {
			System.out.println("You got a F!!!");
		}
	}
}
