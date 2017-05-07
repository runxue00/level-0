import javax.swing.JOptionPane;

public class Are_you_happy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
		
		else if(happy.equalsIgnoreCase("no")){
			String popcorn = JOptionPane.showInputDialog("Do you want to be happy?");
			if(popcorn.equalsIgnoreCase("Yes")){
				JOptionPane.showMessageDialog(null, "Change something!");
			}
			else if(popcorn.equalsIgnoreCase("No")){
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}else{
				JOptionPane.showMessageDialog(null, "error, error, error!");
			}
		} else{
			JOptionPane.showMessageDialog(null, "error, error, error!");
		}
		JOptionPane.showMessageDialog(null, "Now take my advice, and get out of here");
		
	}
}
