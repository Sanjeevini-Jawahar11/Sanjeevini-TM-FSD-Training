package Week3;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class StudentMarksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<StudentMarks> studentMarks=Arrays.asList(new StudentMarks("Sanjeevini",Arrays.asList(89,90,96,56,43)),
																new StudentMarks("Anusha",Arrays.asList(97,99,56,43,83)),
																new StudentMarks("Varsha",Arrays.asList(92,79,76,33,53)),
																new StudentMarks("Monisha",Arrays.asList(47,89,56,93,83)));
		List<List<Object>> sortedStudentMarks=new ArrayList<>();
		for(StudentMarks student : studentMarks){
			sortedStudentMarks.add(Arrays.asList(student.getName(),student.getTotal(),student.getAverage()));
		}
		sortedStudentMarks.sort(Comparator.comparingInt(sortedStudentmark->(int)sortedStudentmark.get(1)));
		for(List<Object> student:sortedStudentMarks) {
			System.out.println(student);
			
		}
		
		

	}

}
