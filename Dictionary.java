/**
 * Dictionary Class has been created to instantiate the HashMap, as
 * well as, create the get(), add(), and printAll() methods used in
 * the Application class
 * 
 * @author Ashleigh Rufus
 * CS215-ON: Assignment 5.1
 */

import java.util.HashMap; 
import java.util.Scanner;

public class Dictionary {

	private HashMap<String, String> entry;
	private String word;
	private String definition;
	
	/*
	 * Empty argument constructor used to instantiate HashMap
	 */
	public Dictionary() {
		
		entry = new HashMap<String, String> ();

	} // end empty-argument constructor
	
	/**
	 * Method used to implement a scan that will run through a file
	 * to add each entry to a given HashMap
	 * @param scan; a scanner must be created to be used within this method
	 */
	
	public void add(Scanner scan) {
		while (scan.hasNext()) {
			String key = scan.next();
			String value = scan.nextLine();
			key.hashCode();
			value.hashCode();
			
			entry.put(key, value);

		} // end while loop
	} //end add

	/**
	 * Method used to retrieve information on the given word of the dictionary
	 * @param key; key will the desired word
	 * @return a string of information about the word such as definition and HashCode
	 */
	
	public String get(String key) {
		return "The definition and hash code for " + key + " is:" + entry.get(key) + "; " + key.hashCode();

	} //end get
	
	/*
	 * Getters and setters for word & definition
	 */
	
	public String getWord() {
		return word;

	} //end getWord

	public void setWord(String word) {	
		this.word = word;

	} //end setWord

	public String getDefinition() {		
		return definition;
		
	} //end getDefinition

	public void setDefinition(String definition) {		
		this.definition = definition;

	} //end setDefinition
	
	/**
	 * Method used to print out the full HashMap with words and definitions
	 * @return entry or HashMap contents
	 */
	
	public HashMap<String, String> printAll() {
		return entry;

	} //end printAll
	
} //end Dictionary
