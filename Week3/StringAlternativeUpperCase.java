package Week3;
import java.util.*;
public class StringAlternativeUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String:");
		String string = scanner.next();
		StringBuffer str=new StringBuffer(string);
//		String uppercaseString="";
		char c=str.charAt(0);
		for(int i=0;i<string.length();i++) {
			if(i%2==0) {
				str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
		}
		System.out.println(str);
		

	}

}
