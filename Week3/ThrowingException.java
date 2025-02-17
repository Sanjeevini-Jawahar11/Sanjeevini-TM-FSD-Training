package Week3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter a integer value:");
			int input=scanner.nextInt();
			if(input>0) {
				System.out.println(input);	
			}
			else {
				throw new InputMismatchException();
			}
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}

	}

}
