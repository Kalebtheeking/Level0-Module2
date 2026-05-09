package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
	
		
	Random FirstNum = new Random();
	int Lot1 = FirstNum.nextInt (99);
	
	Random SecNum = new Random();
	int Lot2 = SecNum.nextInt (99);
	
	Random ThirdNum = new Random();
	int Lot3 = ThirdNum.nextInt (99);
	
	Random FourthNum = new Random();
	int Lot4 = FourthNum.nextInt (99);
	
	Random FifthNum = new Random();
	int Lot5 = FifthNum.nextInt (99);
	
	Random SixthNum = new Random();
	int Lot6 = SixthNum.nextInt (99);
	
	JOptionPane.showMessageDialog(null, Lot1 + "  " + Lot2 + "  " + Lot3 +"  " + Lot4 + "  "+ Lot5+"  "+Lot6);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
