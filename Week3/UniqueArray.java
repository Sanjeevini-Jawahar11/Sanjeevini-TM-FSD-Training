package Week3;
import java.util.Arrays;
import java.util.List;
public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array=Arrays.asList(1,2,3,4,5,1,4,3,7);
		array.stream().distinct().forEach(System.out::println);

	}

}
