package Week3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase_LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Sanjeevini", "PRIETHA", "Siva Sarojini", "Sumathy");
		names.stream().map(word -> word.chars().mapToObj(c -> (char) c) 
				.map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c)) 
				.map(String::valueOf) 
				.collect(Collectors.joining())) 
				.collect(Collectors.toList()).forEach(System.out::println);
	}

}
