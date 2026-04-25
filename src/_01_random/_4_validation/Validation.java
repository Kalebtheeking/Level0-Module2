//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
 
		// 1. Use each value of randomNumber to give the user a random compliment.
	    if (randomNumber == 0) {
        	JOptionPane.showMessageDialog(null, "You are smart!");
    	}
        else if (randomNumber == 1) {
        	JOptionPane.showMessageDialog(null, "You are cool!");
    	}
        else if (randomNumber == 2) {
        	JOptionPane.showMessageDialog(null, "you smell good (I checked)");
    	}
        else if (randomNumber == 3) {
        	JOptionPane.showMessageDialog(null, "your feet are well sized");
    	}
        else if (randomNumber == 4) {
        	JOptionPane.showMessageDialog(null, "You are somewhat important");
    	}
        else {
        	JOptionPane.showMessageDialog(null, "You have good hygene");
        }
		// 3. Find someone to test out your program. They will like it :)
	}
}
