package Week3;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
public class StringAscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Sanjeevini","Prietha","Satheesh","Jawahar");
		System.out.println("The Natural Order is:");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("-----------------------------");
		System.out.println("The Descending Order is:");
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		

	}

}
