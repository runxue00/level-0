import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Dizzi_Tortoise {


	public static void main(String[] args) {
				 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
String answer=JOptionPane.showInputDialog("From 1-10, how dizzy do you want the tortoise to be?");
int dizzy=Integer.valueOf(answer);

 // 1. Use the dance method to make the Tortoise spin.
		 dance(dizzy);


	}


	static void dance(int dance) {
		for (int i = 0; i < dance; i++) {
			Tortoise.turn(360);
		}
	}
}