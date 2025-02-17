package Week3;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlternativeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> alternativearray=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
			if(i%2==0) {
				alternativearray.add(array[i]);
			}
		}
		System.out.println("The original Array: "+Arrays.toString(array));
		System.out.println("The alternative elements are: "+alternativearray);

	}

}
