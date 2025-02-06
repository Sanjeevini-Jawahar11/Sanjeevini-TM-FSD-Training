package FSD_Assignments;

import java.util.Scanner;

public class IntegerLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();
		System.out.println("The length of the given integer is: " + Utility.integerLength(number));
		scanner.close();

	}

}
