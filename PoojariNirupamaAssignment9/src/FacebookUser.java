import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

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
 * This class models FacebookUser
 * 
 */
public class FacebookUser extends UserAccount implements Cloneable, Comparable<FacebookUser> , Serializable { // Class Facebook starts here
	HashMap<String, Integer> counts = new HashMap<>();
    TreeSet<String> likes = new TreeSet<String>();
	private ArrayList<FacebookUser> friends;
	
	
	/**
	 * Method assigns username and password as constructors.
	 * @param username
	 * @param password
	 */
//	public FacebookUser() {
    public FacebookUser(String username, String password) { // FacebookUser starts
		super(username, password);
		friends = new ArrayList<FacebookUser>();
	} // FacebookUser ends

	
	/**
	 * Assigns hint to passwordHint
	 * @param hint
	 */
	public void setPasswordHint(String hint) { // setPasswordHint() starts
		 super.passwordHint  = hint;
	} // setPasswordHint() ends
	
	
	/**
	 * @param newFriend
	 */
    public void friend(FacebookUser newFriend) { // friend() starts
    	boolean duplicate = false;
    	for (FacebookUser friend: this.friends) {
    	      if(friend.toString().equalsIgnoreCase(newFriend.toString())) {
    	         duplicate = true;
    	      }
    	}
    	if (!duplicate) {
    		
			boolean isAdded = friends.add(newFriend); // False if cannot be added
			if (isAdded == false) { // if starts
				System.out.println("FacebookUser is already in the friends list");
			} // if ends
    	} else  { // if starts
			System.out.println("FacebookUser is already in the friends list");
		} // if ends
	} // friend() ends
    /**
	 * @param formerFriend
	 */
	public void defriend(FacebookUser formerFriend) { // defriend(FacebookUser formerFriend) starts
		boolean isRemoved = friends.remove(formerFriend); // False if cannot be removed
		if (isRemoved == false) { // if starts
			System.out.println("FacebookUser is not in the friends list");
		} // if ends
	} // defriend(FacebookUser formerFriend) ends
	
	/**
	 * Prints username
	 * */
	/**
	 * @return the username
	 */
	public String getUsername(String username) {
		return username;
	}
    public String toString(String username) { // toString() starts
    	return username;
    } // toStrin() ends
 

	/**
	 * Creates a new array for getFriends()
	 * @return the friends
	 */
	public ArrayList<FacebookUser> getFriends() { // getFriends() starts
		ArrayList<FacebookUser> copy = new ArrayList<FacebookUser>();
		//ArrayList<FacebookUser> friends = this.getFriends();
    	for (FacebookUser newFriend: this.friends) { // enhanced for loop ends
    		copy.add(newFriend);
    	} //enhanced for loop ends
    	return copy;
		//return friends;
	} // getFriends() ends

	@Override
	/**
	 * GetPasswordHelp overrids to assign password.Hint
	 */
	public void getPasswordHelp() { // getPasswordHelp() starts
		// TODO Auto-generated method stub
	
		System.out.println(this.passwordHint);
		
	} // getPasswordHelp() starts
	@Override
	/**
	 * Method compares usernames of two different users
	 * @param o of type FacebookUser
	 */
	public int compareTo(FacebookUser o) { // compareTo() starts
		
		return super.toString().compareToIgnoreCase(o.toString());
		
	} // compareTo() ends


	/**
	 * @return the counts
	 */
	public HashMap<String, Integer> getCounts() {
		return counts;
	}


	/**
	 * @return the likes
	 */
	public TreeSet<String> getLikes() {
		return likes;
	}




    
}
 