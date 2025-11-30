import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */

/** This class tests FacebookUser account
 * @author Nirupama Poojari
 * @version 1.0
 */
public class FacebookUserDriver {
 
	/**
	 * Recursive method 
	 */
	public FacebookUserDriver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Exercises methods and fields from FacebookUser
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates users to add to ArrayList
		FacebookUser niru = new FacebookUser("Niru", "password1");
		FacebookUser giri = new FacebookUser("Giri", "password2");
		FacebookUser yogita = new FacebookUser("yogita", "password2");
		FacebookUser shriya = new FacebookUser("shriya", "password2");
		
		niru.friend(yogita);

		niru.friend(giri);
		niru.friend(shriya);
		System.out.println(niru.getFriends()); 

		// Sorting
		ArrayList<FacebookUser> arraylist1 = new ArrayList<FacebookUser>();
	    arraylist1.add(new FacebookUser("Niru", "password1"));
	    arraylist1.add(new FacebookUser("Giri", "password2"));
	    arraylist1.add(new FacebookUser("shriya", "password2"));
	    System.out.println("List before sort: ");
	    for(FacebookUser f: arraylist1){
			System.out.println(f.toString());
		    } 
	    
	    Collections.sort(arraylist1);
	    System.out.println("List after sort: ");
	    for(FacebookUser f: arraylist1){
		System.out.println(f.toString());
	    } 
       // end sort
	    
	    niru.setPasswordHint("What password order first?");
	    niru.getPasswordHelp();
	    
	    niru.defriend(shriya);
	    System.out.println(niru.getFriends()); 
}
	
}
