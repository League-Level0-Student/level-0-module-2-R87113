//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random bot = new Random();
	// 3. Print out this variable
	System.out.println(bot);
	// 4. Get the user to enter a question for the 8 ball
   JOptionPane.showInputDialog(null, "Enter Question");
	// 5. If the random number is 0
   int randomChoice = bot.nextInt(5);
   
   if (randomChoice == 0) {
	   System.out.println("Yes");
		
	} else if (randomChoice == 1) {
		System.out.println("No");
	} else if (randomChoice == 2) {
		System.out.println("Maybe you should ask Googl?");
	} else if (randomChoice == 3) {
		System.out.println("Don't worry about it");
	}
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
}