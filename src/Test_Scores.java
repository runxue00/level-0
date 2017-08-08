import javax.swing.JOptionPane;

public class Test_Scores {
	public static void main(String[] args) {
		
		String percent = JOptionPane.showInputDialog("What percent did you get on your latest test?");
		int num = Integer.parseInt(percent);
		
		if(num <= 100 && num >= 81){
			JOptionPane.showMessageDialog(null, "You were very successful!");
		}
		if(num <= 80 && num >= 51){
			JOptionPane.showMessageDialog(null, "You did good-ish.");
		}
		if(num <= 50 && num >= 26){
			JOptionPane.showMessageDialog(null, "I think you might need to study more.");
		}
		if(num <= 25 && num >= 0){
			JOptionPane.showMessageDialog(null, "At least you completed the test?");
		}
	}

}
