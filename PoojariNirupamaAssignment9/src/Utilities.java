import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
//import java.util.HashSet;
/**
 * @author Nirupama Poojari
 *
 */
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
public class Utilities implements Comparable<FacebookUser> { // Utilities starts
	public String username;
	public int password;
	private static ArrayList<FacebookUser> items;
	
	/**
	 * Creates constructors for parameters for FacebookUser Objects
	 * */
	public Utilities(String username, int password) { // Nested Utilities starts
		this.username = username;
		this.password = password;
	} // Nested Utilities ends
	
	/**
	 * Retrieves user's username
	 * */
	public String getUsername() { //username getter starts
		return username; 
	} // username getter ends
	
	/**
	 * password getter
	 * */
	public int getPassword() { //getPassword() starts
		return password; 
	} // getPassword() ends
	
	/**
	 * Returns username
	 * */
	public String toString() { // toString() starts
		return username + ": " + password;
	} // toString() ends

	/**
	 * Created items ArrayList
	 * */
	public void utilitiesClass() { //utilitiesClass() starts
		items = new ArrayList<>();
	} //utilitiesClass() ends
	
	/**
	 * Adds a FacebookUser
	 * */
	public void add(FacebookUser newUser) { //add() starts
		items.add(newUser);
		Collections.sort(items);
	} // add() ends

	/**
	 * Removes a FacebookUser
	 * */
	public void remove(FacebookUser removeUser) { // remove() ends
		items.remove(removeUser);
	} // remove() ends
	
	/**
	 * FacebookUser element getter
	 * */
	public FacebookUser getFirst() { //getFirst() starts
		return items.get(0);
	} //getFirst() ends
	
	/**
	 * Displays elements in an ArrayList
	 * */
	public static void display() { // display() starts
		System.out.println(items);
	} // display() ends
	
	/**
	 * compareTo method
	 * */
	public int compareTo(FacebookUser user) { // compareTo() method starts
		return user.toString().compareTo(super.toString());
	} // compareTo() method ends

	/** 
	    * Linear search through array arr for the provided key. 
	    * @param 
	    * @param key  in array
	    * @return index or -1 if not in the array.
	    */ 
	  public static <E extends Comparable<E>> int linearSearch(List<E> list,
	                                  E key) { // linearSearch() starts
	    int ret = -1; // Return value initialized to -1     
	    for (int i = 0; i < list.size(); i++) { // For loop starts
	      if (list.get(i).compareTo(key)==0) { // If starts
	        ret = i; // i assigned to ret
	      } // If ends
	    } // For loop ends
	    return ret; // Returns ret
	  } // linearSearch() starts
	  
	  
	  /** 
	    * Removes duplicate items in an arrayList 
	    * @param Generic ArrayList list which is modified for duplicate removal
	    * @param key  in array
	    */ 
	 public static <E extends Comparable<E>> void removeDuplicates(List<E> list) { // removeDuplicates()
		    //Set<E> dups = new HashSet<>();
		 List<E> listRet = new ArrayList<>();		    
		    E current;
		    // remove duplicate
		    for (int i = 0; i < list.size() - 1; i++) { // for loop starts
		    	current = list.get(i);
		    	//int counter = 0;
		    	for (int j = i + 1; j < list.size(); j++) { // for loop starts
		    		int c = current.compareTo(list.get(j));
			        if (c == 0) { // if starts
			        	listRet.add(current);
			        //	list.remove(i);
			        } // if ends
		    	} // for loop ends
		    } // for loop ends

		    list.removeAll(listRet);
		    Iterator<E> it= listRet.iterator();
		    while(it.hasNext()) { // while loop starts
		    	E dup = it.next();	
		    	if(!list.contains(dup)) {
		    		list.add(dup);
		    	}
		    } // while loop ends
		  
		  } //removeDuplicates ends
	 /** 
	    * sort method for a generic ArrayList based on number of friends
	    * @param list 
	    * @return an index for ArrayList
	    */ 
	  public static <E extends Comparable<E>> void sort1(List<E> list) { // sort starts
	    E currentMin;
	    int currentMinIndex;

	    for (int i = 0; i < list.size() - 1; i++) { // for loop starts
	      // Find the minimum in the list[i..list.length-1]
	      currentMin = list.get(i);
	      currentMinIndex = i;

	      for (int j = i + 1; j < list.size(); j++) { // for loop starts
	        if (currentMin.compareTo(list.get(j)) > 0) { // if starts
	          currentMin = list.get(j);
	          currentMinIndex = j;
	        } // if ends
	      } // for loop ends

	      // Swap list[i] with list[currentMinIndex] if necessary;
	      if (currentMinIndex != i) { // if starts
	    	  E temp = list.get(i);
	    	  list.set(i, currentMin);
	    	  list.set(currentMinIndex,temp);
	      } // if ends
	    } // for loop ends
	  } // sort ends
	 /** 
	    * sort method for a generic ArrayList 
	    * @param list 
	    * @return an index for ArrayList
	    */ 
	  public static <E extends Comparable<E>> void sort(List<E> list) { // sort starts
	    E currentMin;
	    int currentMinIndex;

	    for (int i = 0; i < list.size() - 1; i++) { // for loop starts
	      // Find the minimum in the list[i..list.length-1]
	      currentMin = list.get(i);
	      currentMinIndex = i;

	      for (int j = i + 1; j < list.size(); j++) { // for loop starts
	        if (currentMin.compareTo(list.get(j)) > 0) { // if starts
	          currentMin = list.get(j);
	          currentMinIndex = j;
	        } // if ends
	      } // for loop ends

	      // Swap list[i] with list[currentMinIndex] if necessary;
	      if (currentMinIndex != i) { // if starts
	    	  E temp = list.get(i);
	    	  list.set(i, currentMin);
	    	  list.set(currentMinIndex,temp);
	      } // if ends
	    } // for loop ends
	  } // sort ends
	  /** 
	    * Displays the generic ArrayList 
	    * @param generic ArrayList list 
	    */ 
	  public static <E> void printList(List<E> list) { // printList starts
		  for (int i = 0; i < list.size(); i++) { // for loop starts
			  System.out.print(list.get(i)+" ");
		  } // for loop ends
		  System.out.println();
	  } // printList ends
	
	
 
} // Utilities ends

