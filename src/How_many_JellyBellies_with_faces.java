import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class How_many_JellyBellies_with_faces {
public static void main(String[] args) {
	ImageIcon iconI = new ImageIcon("JellyBelly.png");
	//21 JellyBellies
	String a = (String) JOptionPane.showInputDialog(null,"How many jellybeans with faces are there?",null,0,iconI,null,null);
	if(a.equals ("21")){
		//System.out.println("Correct!");
		JOptionPane.showMessageDialog(null, "Correct!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Fail!");
	}
	ImageIcon iconB = new ImageIcon("candy.jpg");
	//21 JellyBellies
	String[] selectionValues = {"excited", "embarrased", "mutual"};
	String b = (String) JOptionPane.showInputDialog(null,"Are you excited, embarrased, or mutual?",null,0,iconB,selectionValues,null);
	JOptionPane.showMessageDialog(null, "Me Too!");
	
	//if(a.equals ("21")){
		//System.out.println("Correct!");
		//JOptionPane.showMessageDialog(null, "Correct!");
	//}
	//else {
		//JOptionPane.showMessageDialog(null, "Fail!");
	//}
}
}
