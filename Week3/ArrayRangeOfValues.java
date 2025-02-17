package Week3;
import java.util.Arrays;

public class ArrayRangeOfValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,5};
		int[] array2=Arrays.copyOfRange(array, 2, array.length);
		System.out.println(Arrays.toString(array2));
		
	}

}
