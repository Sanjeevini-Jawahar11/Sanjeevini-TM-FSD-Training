package FSD_Assignments;

import java.util.Scanner;

public class Reciprocal {
	public static void processInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();
		float reciprocal = 0.0f;
		try {
			if (number == 0) {
				throw new ArithmeticException("Division by zero is not allowed.");
			}
			reciprocal = 1 / (float) number;
			System.out.println("The Reciprocal of the given Number is: " + reciprocal);

		} finally {
			scanner.close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		processInput();

	}

}
