package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		
	  String input = JOptionPane.showInputDialog("Enter your choice of farm animal");
	   
	 if(input.equals("Cow")){
		playMoo();
	 }
	 if(input.equals("Duck")){
			playQuack();
		 }
	 if(input.equals("Dog")){
			playWoof();
		 }
	 if(input.equals("Cat")){
			playMeow();
		 }
	 if(input.equals("Llama")){
			playLlama();
		 }
	 
	 
	 
	 
	 /* 2. Make it so that the user can keep entering new animals. */


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
	void playMeow() {
		playNoise(meowFile);
	}
	void playLlama() {
		playNoise(llamaFile);
	}
	
	
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";
	
	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
