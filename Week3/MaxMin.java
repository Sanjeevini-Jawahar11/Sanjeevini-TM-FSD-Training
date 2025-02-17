package Week3;
import java.util.Arrays;
import java.util.List;
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array=Arrays.asList(1,2,3,4,5,6,7);
		System.out.println("The Highest element in an array is: "+array.stream().mapToInt(Integer::intValue).max().getAsInt());
		System.out.println("The Lowest element in an array is: "+array.stream().mapToInt(Integer::intValue).min().getAsInt());

	}

}
