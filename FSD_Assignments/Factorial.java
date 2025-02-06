package FSD_Assignments;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n, int numberOfZeros, int powers) {
		if (n >= (int) Math.pow(5, powers)) {
			numberOfZeros += n / (int) Math.pow(5, powers);
			return factorial(n, numberOfZeros, powers + 1);
		} else {
			return numberOfZeros;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = s.nextInt();
		int answer = factorial(number,0, 1);
//		while(number>=divisor) {
//			numberOfZeros+=(number/divisor);
//			divisor*=5;
//		}
		System.out.println("The number of trailing Zeros: " + answer);
		s.close();
	}
}
 	 	 			 	 		
				
