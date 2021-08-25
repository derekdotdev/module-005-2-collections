package com.javaforbeginners.collections.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NameListRunner {

	public static void main(String[] args) {

		// Initialize scanner
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// Declare an ArrayList of Strings
		ArrayList<String> names = new ArrayList<String>(9);

		// Welcome user
		System.out.println("Thanks for choosing nameList- the PREMIERE name listing experience.");

		// Ask user for eight names
		System.out.println("\nPlease enter eight names, individually.");

		// Loop until user adds eight names to the collection
		for (int i = 0; i <= 7; i++) {
			String name = scanner.next();
			names.add(name);
		}

		// Print names to consule using enhanced for loop
		System.out.println("\nNames: ");
		printNames(names);

		// Sort alphabetically
		Collections.sort(names);

		// Print sorted names to consule using enhanced for loop
		System.out.println("\nAlphabetically Sorted Names: ");
		printNames(names);

		// Shuffle the list
		Collections.shuffle(names);

		// Print sorted names to consule using enhanced for loop
		System.out.println("\nShuffled Names: ");
		printNames(names);

		// Convert the list to an array using toArray. (Two Ways)
		// Object[] namesArray = names.toArray(); - Simpler

		// More difficult, but allows Arrays.toString() Method to be called
		String namesArray[] = new String[names.size()];
		namesArray = names.toArray(namesArray);

		System.out.println("\n\nNames ArrayList<String> converted to an Array[].");

		// Output the elements of the array.
		System.out.println("Names Array[]: " + Arrays.toString(namesArray));

		// Convert the array back into a list using asList.
		List<String> namesArrayList = Arrays.asList(namesArray);

		System.out.println("\nNames Array[] converted back to a List<String>.");

		// Output the elements of the list.
		System.out.println("\nNames List: ");
		printNames(namesArrayList);

		// Ask user for a valid name and output the location where found
		System.out.println("\nType a name from your list to find it's index location: ");
		String validName = scanner.next();

		System.out.printf("\n%s is at index: ", validName);
		System.out.print(names.indexOf(validName.toString()));

		// Ask user for an INVALID name and output the location where "found"
		System.out.println("\n\nType a name NOT on your list for a surprise: ");
		String invalidName = scanner.next();


		if (names.indexOf(invalidName) < 0) {
			System.out.println("\nERROR: This name does not appear in the list!");
			System.out.printf("\nTherefore, our systems put %s is at index: ", invalidName);
			System.out.print(names.indexOf(invalidName));
		}

		System.out.println("\n\nThanks for choosing nameList. Goodbye!");

	}

	// Method to print names to console from ArrayList
	private static void printNames(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

	// Overloaded Method to print names to console from List
	private static void printNames(List<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

}
