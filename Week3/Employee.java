package Week3;

import java.util.Scanner;

public class Employee {
	private int empId;
	private String empName;
	private double sal;
	private int experience;

	Employee(int empId, String empName, double sal) {
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	void setEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your years of experience:");
		experience = scanner.nextInt();

	}

	double getLoadEligibility() {
		setEmployeeDetails();
		if (getEmployeeDetails() > 5) {
			if (sal >= 1500000.00) {
				return 700000.00;
			} else if (sal >= 1000000.00) {
				return 500000.00;
			} else if (sal == 600000.00) {
				return 200000.00;
			} else {
				return 0.0;
			}

		} else {
			return 0.0;
		}

	}

	int getEmployeeDetails() {
		return experience;

	}
}
