package apllescost;

import java.util.Scanner;

public class ApplesCost {

	public static void main(String[] args) {

		int appleCost = 2;
		int applesAmount;
		int summ;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter amount of apples: ");
		applesAmount = sc.nextInt();
		
		summ = applesAmount * appleCost;
		System.out.println("The amount payable: " + summ + " $");
		
	}
	
}
