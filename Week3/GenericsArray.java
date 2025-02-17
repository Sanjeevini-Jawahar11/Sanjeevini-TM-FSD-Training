package Week3;

import java.util.Arrays;

public class GenericsArray {
	public static <T> boolean arrayEqual(T[] array1,T[] array2){
		return Arrays.equals(array1,array2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []array1= {1,2,3,4,5};
		Integer[] array2= {1,2,3,4,5};
		System.out.println(arrayEqual(array1,array2));

	}

}
