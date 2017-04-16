import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
	int happinessLevel = 0;
	

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String pet = JOptionPane.showInputDialog("What pet would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.

			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Make your pet happy!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "Give pet food and water" , " take a walk" , "groom him/her" , "clean up poop"}, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void cuddle(){
		JOptionPane.showMessageDialog(null, "Your pet shall be warm soon.");
		happinessLevel = happinessLevel + 9;
	}
}
