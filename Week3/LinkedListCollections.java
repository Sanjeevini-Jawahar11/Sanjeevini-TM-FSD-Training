package Week3;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(0);
		System.out.println(list);//appending specfied element at the end
		list.forEach(System.out::println);//iterating elements
		//Iterating from specified location
		list.listIterator(3).forEachRemaining(System.out::println);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);//Printing in reverse order
		list.add(0, -1);//Adding elements at specfied position
		//Adding elements at first and last
		list.addFirst(-100);
		list.addLast(100);
		LinkedList<Integer> list2=new LinkedList<>();
		// adding some elements at the specfied location
		list2.add(-5);
		list2.add(-100);
		list2.add(5);
		list.addAll(1,list2);
		System.out.println(list);
		//removing first and last occurence of an list
		System.out.println(list.removeFirstOccurrence(-100));
		System.out.println(list.removeLastOccurrence(list2));

		
	}

}
