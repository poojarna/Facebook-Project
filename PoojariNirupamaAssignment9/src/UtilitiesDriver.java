import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
import java.util.Scanner;
//import java.util.Set;

/**
 * @author Nirupama Poojari
 *
 */
// Code is supposed to find duplicates
/**
 * Class: CIS 2217 Java Programming Development II <br />
 * Instructor: Reece Newman <br />
 * Description: (Give a brief description for Exercise 1) <br />
 * Due: 9/11/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Nirupama Poojari <br />

 */
/**
 * Allows user to view different scenarios for different inputs
 * */
public class UtilitiesDriver { // Utilities starts
	/**
	 * @param args
	 */
	public static void main(String[] args) { // main starts
	    Scanner in = new Scanner(System.in);
	    System.out.println("Welcome to Utilities!");
	    System.out.println("Test case FacebookUser ArrayList");
		System.out.println("Enter your username: ");
		
        String username = in.next();
        
        System.out.println("Enter your password: ");
		
        String password = in.next();
	    FacebookUser userAdded = new FacebookUser(username, password);
		FacebookUser Gary = new FacebookUser("Gary", "passwd");
		FacebookUser niru = new FacebookUser("niru", "niru");
		FacebookUser Yogi = new FacebookUser("yogi", "yogi");
		FacebookUser Giri = new FacebookUser("giri", "giri");
		FacebookUser niru1 = new FacebookUser("niru", "niru");
     
        ArrayList<FacebookUser> currentUsers = new ArrayList<FacebookUser>();
		currentUsers.add(Gary);
		currentUsers.add(niru);
		currentUsers.add(Yogi);
		currentUsers.add(Giri);
		currentUsers.add(niru1);
	    currentUsers.add(userAdded);
	//	ArrayList<FacebookUser> copy = (ArrayList<FacebookUser>) currentUsers.clone();
		System.out.println("FacebookUser ArrayList - Before removing duplicates");
		System.out.println(currentUsers);
	//	printList(currentUsers);
		System.out.println("FacebookUser ArrayList - After removing duplicates");
		Utilities.removeDuplicates(currentUsers);
		System.out.println(currentUsers);
		System.out.print("FacebookUser search for " + niru.toString() +" returned index ");
		System.out.println(Utilities.linearSearch(currentUsers,niru));
		
		//printList(currentUsers);
		//----------------------------------------
		System.out.println("Empty List Before removing duplicates");
		 ArrayList<FacebookUser> emptyList = new ArrayList<FacebookUser>();
		 System.out.println(emptyList);
		System.out.println("Empty List After removing duplicates");
		Utilities.removeDuplicates(emptyList);
		System.out.println(emptyList);
		System.out.println("End of Test case FacebookUser ArrayList");
		//---------------------
		//String userString = new String(String username, Stringpassword);
		System.out.println("Test case String ArrayList");
		System.out.println("Enter a string: ");
		String stringWord = in.next();
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add(stringWord);
		stringList.add("Giri");
		stringList.add("niru");
		stringList.add("Yogi");
		stringList.add("Giri");
		stringList.add("Yogi");

		System.out.println("Before removing duplicates");
		System.out.println(stringList);
		//printList(stringList);
		System.out.println("After removing duplicates");
		Utilities.removeDuplicates(stringList);
		System.out.println(stringList);
		System.out.print("String search for " + "Yogi" +" returned index ");
		System.out.println(Utilities.linearSearch(stringList,"Yogi"));
		
		
		//printList(stringList);
		//------------------
		ArrayList<String> oneElementList = new ArrayList<String>();
		oneElementList.add("Giri");
		System.out.println("Before removing duplicates");
		System.out.println(oneElementList);
		//printList(stringList);
		System.out.println("After removing duplicates");
		Utilities.removeDuplicates(oneElementList);
		System.out.println(oneElementList);
		System.out.println("End of Test case String ArrayList");
		//--------------------------
		System.out.println("Test case Integer ArrayList");
		System.out.println("Enter a number");
		int numberInput = in.nextInt();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(numberInput);
		intList.add(10);
		intList.add(3);
		intList.add(numberInput);
		intList.add(10);
		intList.add(4);
		intList.add(4);
		System.out.println("Before removing duplicates");
		Utilities.printList(intList);	
		System.out.println("After removing duplicates");
		Utilities.removeDuplicates(intList);		
		Utilities.printList(intList);	
		//--------------------------
		ArrayList<Integer> sameElementList = new ArrayList<Integer>();
		sameElementList.add(10);
		sameElementList.add(10);
		sameElementList.add(10);
		sameElementList.add(10);
		sameElementList.add(10);
		System.out.println("Before removing duplicates");
		Utilities.printList(sameElementList);	
		System.out.println("After removing duplicates");
		Utilities.removeDuplicates(sameElementList);		
		Utilities.printList(sameElementList);	
		System.out.println("Same element test ends");
	//	System.out.println("After removing duplicatesort");
	//	sort(intList);
	//	printList(intList);
		//display();
		//--------------------------
		ArrayList<Integer> searchIntList = new ArrayList<Integer>();
		searchIntList.add(10);
		searchIntList.add(3);
		searchIntList.add(2);
		
		System.out.println("Int Arraylist for search");
		Utilities.printList(searchIntList);	
		System.out.print("Int search for " + 3 +" returned index ");
		System.out.println(Utilities.linearSearch(searchIntList,3));	
		System.out.println("End of Test case Integer ArrayList");
		//--------------------------
		ArrayList<Character> searchCharList = new ArrayList<Character>();
	
		System.out.println("Test case char ArrayList");
		System.out.println("Enter a character: ");
		String str = in.next();
		char charInput = str.charAt(0);
		searchCharList.add(charInput);
		searchCharList.add('N');
		searchCharList.add('N');
		searchCharList.add('R');
		System.out.println("Before removing duplicates");
		Utilities.printList(searchCharList);	
		System.out.println("After removing duplicates");
		Utilities.removeDuplicates(searchCharList);	
		Utilities.printList(searchCharList);	
		System.out.print("Char search for " + 'N' +" returned index ");
		System.out.println(Utilities.linearSearch(searchCharList,'N'));	
		
		System.out.println("End of Test case char ArrayList");
				
	}
 
} // Utilities ends

