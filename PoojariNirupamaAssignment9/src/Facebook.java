import java.util.ArrayList;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class: CIS 2217 Java Programming Development II <br />
 * Instructor: Reece Newman <br />
 * Description: (Give a brief description for Exercise 1) <br />
 * Due: 9/25/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Nirupama Poojari <br />

 */

/**
 * The Facebook.java program will serialize and deserialize
 */
public class Facebook implements Serializable{ // Class Facebook starts

	/**
	 * Contains Arraylist and serialization information.
	 */
	//private static final long serialVersionUID = 4970923994437001650L;
	private ArrayList<FacebookUser> users;
	private ArrayList<FacebookUser> friends;
	
	/**
	 * Generates instance Facebook assigned with username, password, and new ArrayList
	 * @param username String
	 * @param password String
	 */
	
	
	public Facebook() { // class Facebook is nested starts
		users = new ArrayList<FacebookUser>();
		friends = new ArrayList<FacebookUser>();
	} // Class Facebook(String username, String password) ends
	
	/**
	 * adduser method is created to add user
	 * @param newUser Facebook
	 * @param password String
	 */
	 public void adduser(FacebookUser newUser) { // class Adduser starts
	    	
			boolean isAdded = users.add(newUser); // False if cannot be added
			if (isAdded == false) { // if starts
				System.out.println("FacebookUser is already in the users.");
			} // if ends
		} // class Adduser ends
	    /**
		 * Removes user
		 * @param formerFriend FacebookUser
		 */
		public void removeUser(FacebookUser formerUser) { // removeUser starts
			boolean isRemoved = users.remove(formerUser); // False if cannot be removed
			if (isRemoved == false) { // if starts
				System.out.println("FacebookUser is not in the users.");
			} // if ends
		} // removeUser ends
		
		/**
		 * Adds a friend
		 * @param formerFriend FacebookUser
		 */
		public void addFriend(Facebook friend) { // addFriend() starts
			boolean isAdded = users.add(null); // False if cannot be added
			if (isAdded == false) { // if starts
				System.out.println("FacebookUser is already in the friends list");
			} // if ends
		} //addFriend() ends
		
		/**
		 * remove a friend
		 * @param friend FacebookUser
		 */
		public void deFriend(Facebook friend) { // deFriend() starts
			boolean isAdded = users.remove(null); // False if cannot be added
			if (isAdded == false) { // if starts
				System.out.println("FacebookUser is already in the friends list");
			} // if ends
		} // deFriend() ends
		
		/**
		 * Creates a new array for getFriends()
		 * @return the friends
		 */
		public ArrayList<FacebookUser> getFriends() { // getFriends() starts
			ArrayList<FacebookUser> copy = new ArrayList<FacebookUser>();
			//ArrayList<FacebookUser> friends = this.getFriends();
	    	for (FacebookUser newFriend: this.users) { // enhanced for loop starts
	    		copy.add(newFriend);
	    	} // enhanced for loop ends
	    	return copy;
			//return friends;
		} // getFriends() ends
		/**
		 * Creates a new array for getRecommedations()
		 * @param FacebookUser user
		 * @return ArrayList recFriends
		 */
		public ArrayList<FacebookUser> getRecommendations(FacebookUser user, ArrayList<FacebookUser> recommended) { // getRecommendations() starts
			// Unable to access friends
			ArrayList<FacebookUser> recFriends = user.getFriends(); // user's friends assigned to recFriends
			ArrayList<FacebookUser> recommended1 = null; // recommended is assigned null
			if(recFriends != null) {	
				for (FacebookUser newFriend: recFriends) { // enhanced for loop starts
					if(!newFriend.getFriends().isEmpty()) {	
						FacebookUser friendOfFriend = newFriend.getFriends().get(0);
						if(friendOfFriend.toString().equalsIgnoreCase(user.toString())) {
							return recFriends;
						}
					}
					recommended1= getRecommendations(newFriend,recommended); // friends are assigned to recommended
					
		    	} // enhanced for loop ends
			}
		//	if(recommended.isEmpty()) {
			if(recFriends != null) {	
				for (FacebookUser newFriend: recFriends) { // enhanced for loop starts
					if(recommended == null) {
						recommended = new ArrayList<FacebookUser>();
						recommended.add(newFriend); // friends are assigned to recommended					
					} else {
						recommended.add(newFriend); 
					}
				} // enhanced for loop ends
			//	Collections.sort(recFriends);
				FacebookUserFriendCountComparator facebookUserFriendCountComparator= new FacebookUserFriendCountComparator();
				Collections.sort(recommended,facebookUserFriendCountComparator);
			}
			return recommended;
		}
		
		/**
		 * generates an ArrayList that displays users using a sort method
		 */
		public ArrayList<FacebookUser> getUsers() { // ArrayList<FacebookUser> getUsers starts
			ArrayList<FacebookUser> copy = new ArrayList<FacebookUser>(); // Assigns users into new ArrayList
	    	for (FacebookUser newUser: this.users) { // enhanced for loop starts
	    		copy.add(newUser); // adds new user
	    	} // enhanced for loop ends
	    	Collections.sort(copy);
	    	return copy;
		} // ArrayList<FacebookUser> getUsers ends
		
		
		/**Generates an ArrayList that displays friends of an user using a sort method*/
		
		public ArrayList<FacebookUser> getUserFriends() { // ArrayList<FacebookUser> getUsers starts
			ArrayList<FacebookUser> Userfriend = new ArrayList<FacebookUser>(); // Assigns users into new ArrayList
	    	for (FacebookUser friendRec: this.friends) { // enhanced for loop starts
	    		Userfriend.add(friendRec); // adds new user
	    	} // enhanced for loop ends
	    	Collections.sort(Userfriend);
	    	return Userfriend;
		} // ArrayList<FacebookUser> getUsers ends
		

	/**
	 * Displays user.username of account Object
	 */
	public String toString(String username) { // toString() starts
		return username; // Displays user.username
	} // toString ends

	
	/**Contains like function method & GUI for user to access like button*/
} // Facebook.java class ends
