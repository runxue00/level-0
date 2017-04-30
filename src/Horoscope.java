import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String month = JOptionPane.showInputDialog("What is your birthday month?");
	//String day = JOptionPane.showInputDialog("What is your birthday day?");
	//String year = JOptionPane.showInputDialog("(Optional)What is your birthday year?");
	//ArrayList<String> list = new ArrayList<String>();
	//list.add("you will get hit by a car in 3 days.");
	//list.add("you will break your leg in 1 month.");
	//list.add("you will damage your head in 3 days.");
	//list.add("you will meet and/or see your uncle tomorrow.");
	
	if(month.equalsIgnoreCase("January")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the garnet.");
	}
	else if(month.equalsIgnoreCase("February")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the Amethyst.");
	}
	else if(month.equalsIgnoreCase("March")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the Aquamarine.");
	}
	else if(month.equalsIgnoreCase("April")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the diamond.");
	}
	else if(month.equalsIgnoreCase("May")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the emerald.");
	}
	else if(month.equalsIgnoreCase("June")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the pearl.");
	}
	else if(month.equalsIgnoreCase("July")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the ruby.");
	}
	else if(month.equalsIgnoreCase("August")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the peridot.");
	}
	else if(month.equalsIgnoreCase("September")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the sapphire.");
	}
	else if(month.equalsIgnoreCase("October")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the Tourmaline.");
	}
	else if(month.equalsIgnoreCase("November")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the topaz.");
	}
	else if(month.equalsIgnoreCase("December")){
		JOptionPane.showMessageDialog(null, "Your birthstone is the Tanzanite.");
	}
	else {
		JOptionPane.showMessageDialog(null, "That is not a known month...");
	}
}
}
