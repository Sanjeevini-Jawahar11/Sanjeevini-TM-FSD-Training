package Week3;
import java.util.Arrays;
import java.util.List;

public class StudentMarks {
	private String name;
	private List<Integer> marks;
	private int total;
	private double average;

	StudentMarks(String name, List<Integer>marks){
		this.name=name;
		this.marks=marks;
		this.total=calculateTotal();
		this.average=calculateAverage();
		
	}
	StudentMarks(String name,int total,double average){
		this.name=name;
		this.total=total;
		this.average=average;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	private double calculateAverage() {
		return total/marks.size();
	}
	private int calculateTotal() {
		return marks.stream().mapToInt(Integer::intValue).sum();
	}
	void display() {
		
	}

}
