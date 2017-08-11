 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLow {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
     String guess = JOptionPane.showInputDialog("Type in any number from 1 to 100. What is your guess?");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
    int guess2 = Integer.parseInt(guess);
			// 5. if the guess is correct
     if(guess2 == random){
    	 JOptionPane.showMessageDialog(null, "You win!");
     }
				// 6. win
			// 7. if the guess is high
     if(guess2 > random){
    	 JOptionPane.showMessageDialog(null, "Too high");
     }
				// 8. tell them it's too high
			// 9. if the guess is low
     if(guess2 < random){
    	 JOptionPane.showMessageDialog(null, "Too low");
     }else{
    	 JOptionPane.showMessageDialog(null, "You lose");
     }
				// 10. tell them it's too low

		// 12. tell them they lose
	}

}

