import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Animal_Farm {

	Animal_Farm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.*/
  for (int i = 0; i < 10; i++) {
	  String noise = JOptionPane.showInputDialog("Which animal noise do you want to play? (Duck, Cow, Dog, Cat, Llama)");
	  if(noise.equalsIgnoreCase("Duck")){
		  playNoise(quackFile);
	  }
	  if(noise.equalsIgnoreCase("Cow")){
		  playNoise(mooFile);
	  }
	  if(noise.equalsIgnoreCase("Dog")){
		  playNoise(woofFile);
	  }
	  if(noise.equalsIgnoreCase("Cat")){
		  playNoise(meowFile);
	  }
	  if(noise.equalsIgnoreCase("Llama")){
		  playNoise(llamaFile);
	  }
}
  
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new Animal_Farm();
	}

}


