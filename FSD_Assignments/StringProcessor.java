package FSD_Assignments;

import java.util.Scanner;
import java.util.regex.*;

public class StringProcessor {
	public static int countOccurrences(String str, String subStr)
	{
		if((subStr==null)||(str==null)||(subStr.isEmpty())||(str.isEmpty()))
			return 0;
		else
			return (str.split(Pattern.quote(subStr),-1).length-1);
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scanner.next();
		StringBuffer string=new StringBuffer(str);
//		System.out.println("The reverse of the string is: "+string.reverse());
		System.out.println("Enter a sub to count the occurences:");
		String subStr=scanner.next();
		System.out.println("The number of Occurences of substring in the string is: "+countOccurrences(str,subStr));
		
		
	}

}
