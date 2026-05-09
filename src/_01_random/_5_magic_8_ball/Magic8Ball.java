//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
		
	
	// 2. Get the user to enter a question for the 8 ball to answer
	String question =JOptionPane.showInputDialog("what seems to be your question today?");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random answer = new Random();
	int randomChoice = answer.nextInt (8);

	if(randomChoice == 0) {
		JOptionPane.showMessageDialog(null, "yes");
	}
    else if (randomChoice == 1) {
    	JOptionPane.showMessageDialog(null, "no");
    }
    else if (randomChoice == 2) {
    	JOptionPane.showMessageDialog(null, "maybe you should ask gooogle?");
    }
    else if (randomChoice == 3) {
    	JOptionPane.showMessageDialog(null, "honestly bro you should get a job");
    }
    else if (randomChoice == 4) {
    	JOptionPane.showMessageDialog(null, "invest in stocks");
    }
    else if (randomChoice == 5) {
    	JOptionPane.showMessageDialog(null, "put it all on red");
    }
    else if (randomChoice == 6) {
    	JOptionPane.showMessageDialog(null, "most likely");
    }
    else if (randomChoice == 7) {
    	JOptionPane.showMessageDialog(null, "I wasn't listening, try again");
    }
    else if (randomChoice == 8) {
    	JOptionPane.showMessageDialog(null, "nah ");
    }
	
	if (question == "is caleb gay") {
		JOptionPane.showMessageDialog(null, "no ");
	}

	// 4. If the random number is 0

	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer
	}
}
