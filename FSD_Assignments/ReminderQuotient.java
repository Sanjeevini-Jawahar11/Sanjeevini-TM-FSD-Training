package FSD_Assignments;

import java.util.Scanner;

public class ReminderQuotient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Numerator:");
		int numerator = scanner.nextInt();
		System.out.println("Enter a Denominator:");
		int denominator = scanner.nextInt();
		int reminder = 0, quotient = 0;
		while (numerator >= denominator) {
			reminder = numerator - denominator;
			quotient += 1;
			numerator = reminder;

		}
		System.out.println("The Reminder is: " + reminder);
		System.out.println("The Quotient is: " + quotient);
		scanner.close();

	}

}
