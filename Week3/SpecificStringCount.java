package Week3;
import java.util.Arrays;
import java.util.List;
public class SpecificStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Sanjeevini","Sumathy","Siva Sarojini","Prietha");
		System.out.println("The numeber of names starts with S are: "+names.stream().filter(s->s.startsWith("S")).count());

	}

}
