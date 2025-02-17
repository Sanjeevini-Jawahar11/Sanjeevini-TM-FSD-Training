package Week3;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Employee ID:");
		int id=scanner.nextInt();
		System.out.println("------------------------------");
		System.out.println("Enter your Name:");
		String name=scanner.next();
		System.out.println("------------------------------");
		System.out.println("Enter your salaray:");
		double sal=scanner.nextDouble();
		System.out.println("------------------------------");
		Employee employee=new Employee(id,name,sal);
		double loan=employee.getLoadEligibility();
		if(loan==0.0) {
			System.out.println("Sorry... Your Loan is Not Granted");
		}
		else {
			System.out.println("Congratulations...Rs."+loan+" Amount of Loan is Granted...");
		}

	}

}
