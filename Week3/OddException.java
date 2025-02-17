package Week3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class OddException {
	public static void evenNumber(int number) {
		if(number%2!=0) {
			throw new InputMismatchException();
		}
		else {
			System.out.println(number);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter a number:");
			int number=scanner.nextInt();
			evenNumber(number);
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			
		}
		finally {
			scanner.close();
		}
		

	}

}
