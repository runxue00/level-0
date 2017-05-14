import javax.swing.JOptionPane;

public class Palindrome {
	
	public static void main(String[] args) {
		String pal = JOptionPane.showInputDialog("Input a palindrome.");
		String reversepal = reverse(pal);
		if(pal.equals(reversepal)){
			JOptionPane.showMessageDialog(null, "That is a palindrome.");
		} else{
			JOptionPane.showMessageDialog(null, "ERROR That is NOT a palindrome");
		}
			
	}


	public static String reverse(String s) {

		String reversedString = "";
		for (int i = s.length(); i > 0; i--) {
			reversedString += s.charAt(i - 1);
		}

		return reversedString;
	}

}
