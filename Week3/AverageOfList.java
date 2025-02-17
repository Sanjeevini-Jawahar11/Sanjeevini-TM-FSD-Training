package Week3;

import java.util.Arrays;
import java.util.List;
public class AverageOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array=Arrays.asList(1,2,3,4,5);
		System.out.println("The average value of a given list is "+array.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());

	}

}
