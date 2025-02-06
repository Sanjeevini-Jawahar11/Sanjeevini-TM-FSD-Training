package FSD_Assignments;

import java.util.Scanner;

public class EnumDemo {
	public enum DaysOfWeek {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Available Days");
		for (DaysOfWeek daysofweek : DaysOfWeek.values()) {
			System.out.println(daysofweek);
		}
		System.out.println("Enter a day from the above list:");
		String day = scanner.next().toUpperCase();
		switch (DaysOfWeek.valueOf(day)) {
		case SATURDAY:
		case SUNDAY:
			System.out.println(day + " is a Holiday");
			break;
		default:
			System.out.println(day + " is not a Holiday");
		}
		scanner.close();

	}

}
