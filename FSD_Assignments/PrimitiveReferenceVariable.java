package FSD_Assignments;

import java.util.Scanner;
import java.util.Arrays;

public class PrimitiveReferenceVariable {
	public static int primitive(int number) {
		number += 5;
		return number;
	}

	public static int[] referenceVariable(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 3) {
				array[i] = 7;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int primitiveValue = scanner.nextInt();
		System.out.println("The Original value is: " + primitiveValue);
		System.out.println("The updated value after calling the method: " + primitive(primitiveValue));
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println("The original array is: " + Arrays.toString(array));
		System.out.println("The updated array after calling the method: " + Arrays.toString(referenceVariable(array)));
		scanner.close();

	}

}
