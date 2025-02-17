package Week3;
import java.util.Arrays;
import java.util.List;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array=Arrays.asList(1,2,3,4,5,6,7);
		System.out.println("The sum of even numbers: "+array.stream().filter(s->(s%2==0)).mapToInt(Integer::intValue).sum());
		System.out.println("The sum of odd numbers: "+array.stream().filter(s->(s%2!=0)).mapToInt(Integer::intValue).sum());

	}

}
