package Week3;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class ArrayListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Pink");
		colors.add("Green");
		System.out.println(colors);// 1.printing
		colors.forEach(System.out::println);// 2.Iterating elements
		colors.add(0, "purple");// 3.inserting element in 0th index
		System.out.println(colors);
		System.out.println("The element at the 4th index is: " + colors.get(4));
		System.out.println("Removing 3rd element " + colors.remove(3));
		System.out.println(colors.contains("Blue"));// searching an element
		colors.stream().sorted().forEach(System.out::println);// sorting
		List<String> dupColors = List.copyOf(colors);
		System.out.println(dupColors);// Copying elements
		Collections.shuffle(colors);
		System.out.println(colors);// shuffling elements

	}

}
