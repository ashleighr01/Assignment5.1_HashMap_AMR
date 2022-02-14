/**
 * HashMapApplication will implement a dictionary (DictionaryWordValuePairs.txt)
 * using the Java HashMap collection. The words and definitions will be added
 * to a HashMap (originally derived from the Dictionary Class), 
 * then five words will be printed with their respective definitions and HashCodes.
 * 
 * @author Ashleigh Rufus
 * CS215-ON: Assignment 5.1
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashMapApplication {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		/*
		 * A HashMap--instantiated from the Dictionary class--has been created as well as a file and scanner
		 */
		
		Dictionary newDictionary = new Dictionary ();
		File dictionaryWords = new File ("DictionaryWordValuePairs.txt");
		Scanner scan = new Scanner(dictionaryWords);

		System.out.println("-----List of words and definitions added to the HashMap-----");
	
		/*
		 * All inputs from the dictionary file have been added to newDictionary using
		 * add() method from Dictionary class
		 */
		
		newDictionary.add(scan);
		
		/*
		 * The dictionary HashMap has been completed and will now be printed
		 * Multiple word terms did not seem to add correctly in some cases
		 * i.e.: Sea Smoke (printed as "sea= smoke fog," instead of "sea smoke= fog,")
		 */
		
		System.out.println("\nAll words and definitions have been added.");
		System.out.println(newDictionary.printAll());
		
		/*
		 * The get() method was then used to find the definition attached to the
		 * selected word as well as printing the HashCode for that word.
		 */
		
		System.out.println("\n-----Time to search for words-----");
		
		System.out.println(newDictionary.get("timbrel"));
		System.out.println("\n" + newDictionary.get("watch"));
		System.out.println("\n" + newDictionary.get("apothecary"));
		System.out.println("\n" + newDictionary.get("inscribe"));
		System.out.println("\n" + newDictionary.get("champaign"));

	
	} // end main

} //end HashMapApplication
