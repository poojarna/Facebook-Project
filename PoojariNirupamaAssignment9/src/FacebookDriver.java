import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Class: CIS 2217 Java Programming Development II <br />
 * Instructor: Reece Newman <br />
 * Description: (Give a brief description for Exercise 1) <br />
 * Due: 10/23/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Nirupama Poojari <br />

 */

/**
 * Implements Facebook.java methods for user to add friend, remove, list or recommend friends
 * */

public class FacebookDriver  { // Class FacebookDriver starts

	
	// EXPLANATION
	// HashMap is used at user level for accepting like and at global level for consolidation. 
	// TreeSet is used to implement sort on the user likes 
	static HashMap<String, Integer> counts = null;
	// String is "like description"
	// Integer is count for the likes
	static TreeSet<String> likes = null;
	// sorted likes
//	static ArrayList<Integer> countsList = new ArrayList<>();
	/**
	 * Should display the user menu
	 * @param args
	 */
	public static void main(String[] args)  { // Main method starts
		// Instance account1, is declared null
		Facebook account1 = null;
		String likedThing = "";
		// To de-serialize (reading from file) an object, we need to use an ObjectInputStream
		
		// Try-catch method was from Jar Binary IO review given in Week 3 folder
			try { // Try starts
				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream("serialized")); // creates input for "serialized" file
				
				// readObject returns a plain Object -- we have to cast it to the
				// correct type, in this case MySerializableClass
				account1 = (Facebook) ois.readObject();
		//		System.out.println("Deserialization for " + account1 + " check process happening.");
				ois.close();
				System.out.println("Facebook object account1 is deserialized from the file \"serialized\"");
			} catch (FileNotFoundException e) { // FileNotFoundException starts
				System.err.println("Could not open the file \"serialized\"");
			} catch (IOException e) { // IOException starts
				System.err.println("Could not de-serialize the object");
				System.out.println(e.getMessage()); // Pints the message
			} catch (ClassNotFoundException e) { // ClassNotFoundException starts
				System.err.println("Could not cast the de-serialized object");
			} // all catch exceptions end
		
		
    	if( account1 == null) { // if starts
			account1 = new Facebook(); // Creates account 1 Facebook Object
			FacebookUser facebookUser = new FacebookUser("niru", "niru"); // another FacebookUser
			facebookUser.setPasswordHint("Favorite food"); // hint set
			account1.adduser(facebookUser); // adds the user
			FacebookUser facebookUser2 = new FacebookUser("Gary", "passwd"); // another FacebookUser
			account1.adduser(facebookUser2); // adds the user
			facebookUser.friend(facebookUser2); // friends the second user
    	} // if ends
		
	    Scanner in = new Scanner (System.in); // new Scanner in
	    String username = ""; // user
	    int choice = 0;
	    do { // do-while starts
	    	
	    	// Menu prompt
		    System.out.println("Menu");
		    System.out.println("1. Enter what you like");
		    System.out.println("2. List what you like in alphabetical order");
		    System.out.println("3. List Users alphabetically");
		    System.out.println("4. List users by number of friends ");
		    System.out.println("5. Add a User ");
		    System.out.println("6. Delete a User ");
		    System.out.println("7. Get a Password Hint ");
		    System.out.println("8. List Friends ");
		    System.out.println("9. Friend Someone ");
		    System.out.println("10. De-Friend Someone");
		    System.out.println("11. Recommend New Friends ");
		    System.out.println("12. Quit ");
		    
		    // User enters choice
		    System.out.println("Enter choice: ");
		    choice = in.nextInt();
		    // Nested if statement are used to implement userPrompt and passwordPrompt
		    // that cover user input without repetition  
		    if (choice == 1) { // if starts
		    	likeButton(account1);
		    	/*
		    	FacebookUser userMatch = userPrompt(account1); // account1 is assigned to userMatch
		    	if(userMatch!=null) { // if starts
		    		if(passwordPrompt(userMatch)){ // if starts
		    			// User input for liked thing is declared  
				    	//String likedThing;
				        System.out.println("Enter what you like: ");
				        likedThing = in.next(); // user input
				         
							if (!userMatch.likes.contains(likedThing)) { // if starts
							//Integer count = counts.get(word);		
								//	TreeSet Likes contains liked objects and the HashMap counts
								//  stores the number of liked objects that the users like
								userMatch.likes.add(likedThing);
								userMatch.counts.put(likedThing, 1);
								//Likes will add linkedThin and count will store count
								// This statement checks that the user likes likedThing
								System.out.println(userMatch.toString() + " likes " + likedThing);
							} 
							//else { // else starts
							//	Integer count = userMatch.counts.get(likedThing);
								//counts.put(likedThing, count+1);
							//} // if else ends
					     } // if ends
						
						// EXPLANATION ends
		    	} // userMatch ends
	    	*/
		    } else if (choice == 2) { // if starts
		    	likeDisplay(account1);
		    	// Choice 2 is the continuation of option 1
		    	/*
		        counts = new HashMap<>();
		    	likes = new TreeSet<String>();
		    	ArrayList<FacebookUser> users = account1.getUsers();
		    	for (int i = 0; i< users.size(); i++) { // for loop starts
		    		FacebookUser user = users.get(i);
			    	
			    	// Iterator iT is used to display liked input and count. 
			    	Iterator<String> iT = user.likes.iterator();
			    	while(iT.hasNext()) { // while starts
			    		// As the word is added, then that counts will get the number of words entered
			    		String word = iT.next();
			    		if(!likes.contains(word)) {
				    		counts.put(word, user.counts.get(word));
				    		likes.add(word);
			    		} else {
			    			Integer count = counts.get(word);
							counts.put(word, count+1);
			    		}
						//System.out.println(word + " " + user.counts.get(word));
					} // while ends
		    	}
		    	System.out.println(" Like\tCount");
		    	//print consolidated
		    	Iterator<String> iT = likes.iterator();
		    	while(iT.hasNext()) { // while starts
		    		String word = iT.next();
		    		System.out.println(word + " " + counts.get(word));
		    	}
		    	*/
		    }  else if (choice == 3){ // else-if starts
		    	ArrayList<FacebookUser> users = account1.getUsers();
		    	FacebookUserNameComparator facebookUserNameComparator = new FacebookUserNameComparator();
		    	Collections.sort(users,facebookUserNameComparator);
		    	for (int i = 0; i< users.size(); i++) { // for loop starts
		    		FacebookUser user = users.get(i);
		    		System.out.println(user.toString());
		    	} // for ends 
		    } else if (choice == 4) { // else if starts
		    	FacebookUserFriendCountComparator facebookUserFriendCountComparator= new FacebookUserFriendCountComparator();
		    	ArrayList<FacebookUser> users = account1.getUsers();
		    	Collections.sort(users,facebookUserFriendCountComparator);
		    	for (int i = 0; i< users.size(); i++) { // for loop starts
		    		FacebookUser user = users.get(i);
		    		System.out.println(user.toString());
		    	} 
		     
		    } else if (choice == 5) { // else if starts
		    	System.out.println("Enter your username: ");
			       username = in.next(); // username input
			    	
			    	ArrayList<FacebookUser>  account1Users = account1.getUsers(); // Assigns ArrayList to account
			    	boolean duplicate = false;
			    	for (FacebookUser newUser: account1Users) { // enhanced-for loop starts
			    		if (newUser.toString().equalsIgnoreCase(username)) { // if starts
			    			duplicate = true; // boolean to check for duplicates
			    			break;
			    		} // if ends
			    	} // for ends
			    	if (!duplicate) { // If starts
			    		System.out.println("Enter your password: ");
				    	String password = in.next(); // password input
				    	FacebookUser facebookUser3 = new FacebookUser(username, password); // Assigns, does not create object
				    	System.out.println("Password hint choice");
				    	String hint = in.next(); // hint input
				    	facebookUser3.setPasswordHint(hint);			    	
						account1.adduser(facebookUser3); // Account1 adds instance facebook user 
			    	
			        } // If ends
			    	else { // else starts
			    		System.out.println("User exists with entered username.");
			    	} // if-else ends
		    } else if (choice == 6) { // else if starts
		    	System.out.println("Enter a username: ");
		    	username = in.next();
		    	ArrayList<FacebookUser> userList = account1.getUsers();
		    	System.out.println("Enter your password: ");
		    	String password = in.next();
		    	
		    	boolean passwordMatch = false; // boolean passwordMatch
		    	for (FacebookUser newUser: userList) { // enhanced for loop starts
		    		if (newUser.toString().equalsIgnoreCase(username)) { // if starts
		    			if (newUser.checkPassword(password)) { // if starts
		    				passwordMatch = true;
		    				break;
			    		} // if ends
		    		} // if ends
		    	} // enhanced for loop ends    	
		    	FacebookUser facebookUser4 = new FacebookUser(username, password);
		        account1.removeUser(facebookUser4); // removes user
		    } else if (choice == 7) { // else if starts
		    	// User input and prompt for this.username
		    	System.out.println("What's your username: ");
		        username = in.next(); // username input
		        
		        // ArrayList<FacebookUser> user account is used to search for username
		        ArrayList<FacebookUser> userList = account1.getUsers();
		    	
		    	// Finding the user from the list
		    	boolean userMatch = false; // userMatch is false 
		    	FacebookUser matchedUser = null; // matched user is not yet determined
		    	for (FacebookUser newUser: userList) { // Enhanced for loop starts
		    		if (newUser.toString().equalsIgnoreCase(username)) { // if starts  			
		    			userMatch = true; // userMatch is true
		    			matchedUser = newUser; // so, the matchedUser is assigned to newUser
		    			break;
			    		
		    		} // if ends
		    	} // Enhanced for loop ends
		    	
		    	if (userMatch) { // if starts
		    		matchedUser.getPasswordHelp();
		    	} else { // else starts
		    		System.out.println("No user exists with entered username.");
		    	} // if-else ends
		    } else if (choice == 8) { // else if starts
		    	FacebookUser userMatch = userPrompt(account1);
		    	if(userMatch != null) {
			    	ArrayList<FacebookUser> users = userMatch.getFriends();
			    	//System.out.println(users);
			    	for (int i = 0; i< users.size(); i++) { // for loop starts
			    		FacebookUser user = users.get(i);
			    		System.out.println(user.toString()); // Users are printed 
			    	} // for loop ends
		    	}
		    	//System.out.println("Print users");
		    } else if (choice == 9) { // else if starts
		    	System.out.println("Let's add some friends. ");
		    	FacebookUser userMatch = userPrompt(account1); // account1 is assigned to userMatch
		    	if(userMatch!=null) {
		    		if(passwordPrompt(userMatch)){
				    	String friendName;
				        System.out.println("Enter a friend's username: ");
				        friendName = in.next();
				        FacebookUser friend = isValidUsername(account1,friendName);
				        	if(friend!=null) {	 
		        				userMatch.friend(friend); // userMatch will add the friends
				        	}
		    		}
		    	}
	    } else if (choice == 10) { // else if starts
	    	System.out.println("Let's remove some friends. ");
	    	FacebookUser userMatch = userPrompt(account1); // account1 is assigned to userMatch
	    	if(userMatch!=null) {
	    		if(passwordPrompt(userMatch)){
	    		
			    	String friendName;
			        System.out.println("Enter a friend's username: ");
			        friendName = in.next();
			        FacebookUser friend = isValidUsername(account1,friendName);
			        	if(friend!=null) {		    		 
	        				userMatch.defriend(friend); // userMatch will add the friend
			        	}
	    		}
	    	}
    	
	    } else if (choice == 11) { // else if starts
		    	FacebookUser user = userPrompt(account1);
		    	ArrayList<FacebookUser> recommended1 = new ArrayList<FacebookUser>();
		    	ArrayList<FacebookUser> recomndedFriends = account1.getRecommendations(user,recommended1);
		    	ArrayList<FacebookUser> recFriends = user.getFriends(); // user's friends assigned to recFriends
								
		    	if (recFriends != null) { // if starts if recommended is not null
		    		for (FacebookUser recFriend: recFriends) { // enhanced for loop starts
		    			while (recomndedFriends.contains(recFriend)) { // condition to check for duplicate
		    				recomndedFriends.remove(recFriend); // adds recommended friend
		    			} // recFriends adds friend
		    		} // for loop ends
		    	} 
		    	
		    	Utilities.removeDuplicates(recomndedFriends); // Method removeDuplicates removes duplicated values
		    	if(recomndedFriends!= null) { // Will work if the arrayList is null	
		    	 	for (FacebookUser newFriend: recomndedFriends) { // enhanced for loop starts
			    		System.out.println(newFriend);
			    	} // enhanced for loop ends
			    } else { // else starts
			    	System.out.println("No recommendations");
			    } // else ends
			    	
		    } else if (choice == 12) { // else if starts
		    	break; // break
		    } // all else if statements end
	    } while (choice != 12); // do-while ends
	    
	    // To Serialize (writing to file)  
		try { // try starts
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("serialized"));
			oos.writeObject(account1); // Serialization written to account1
			System.out.println("Facebook object account1 is serialized at the file \"serialized\"");
			oos.close(); //oos closes
		} catch (FileNotFoundException e) { // FileNotFoundException starts
			System.err.println("Could not create the file \"serialized\"");
		} catch (IOException e) { //IOException starts
			System.err.println("Could not serialize the object");
			System.err.println(e.getMessage());
		}  // catches for Exceptions end
	} // main method ends

	/**
	 * Will display user prompt 
	 * @param account
	 * Returns a FacebookUser Object
	 * */
	public static boolean passwordPrompt(FacebookUser newUser) { // userPrompt() starts 	
		// User input and prompt for this.username
		boolean ret = false;
		Scanner in = new Scanner(System.in);
			System.out.println("What's your password: ");
			String password = in.next();
			if (newUser.checkPassword(password)) { // if the user checks password
				 			
				ret = true; // User match is true
			} else { // else starts	
				System.out.println("Invalid password."); // error message
			} // if-else ends
	
		return ret; // returns ret
	} // userPrompt() ends
	/**
	 * Will display user prompt 
	 * @param account
	 * Returns a FacebookUser Object
	 * */
	public static FacebookUser userPrompt(Facebook account1) { // userPrompt() starts 	
		// User input and prompt for this.username
		FacebookUser ret = null;
		Scanner in = new Scanner(System.in);
		System.out.println("What's your username: ");
	    String username = in.next();
	    ArrayList<FacebookUser> userList = account1.getUsers();
		
		// Finding the user from the list
		boolean userMatch = false; // userMatch is false 
		FacebookUser matchedUser = null; // matched user is not yet determined
		for (FacebookUser newUser: userList) { // Enhanced for loop starts
			if (newUser.toString().equalsIgnoreCase(username)) { // if starts  			 			
				userMatch = true; // User match is true
				matchedUser = newUser; // then newUser is assigned to matchedUser
				ret = matchedUser; // matchedUser is assigned to ret
				break; // loop breaks
			} // if ends	
			
		} // Enhanced for loop ends
		if (!userMatch) { // if starts
			System.out.println("No user exists with entered username."); // error message
		} // if-else ends
		
		return ret; // returns ret
	} // userPrompt() ends
	
	/**
	 * Determines if the user is valid or not
	 * @param Facebook account1, FacebookUser user
	 * Returns matchedUser
	 * */
	public static FacebookUser isValidUsername(Facebook account1, String username) { // isValid starts
		ArrayList<FacebookUser> userList = account1.getUsers(); // account1 get users assigns users to userList
		
		boolean userMatch = false; // userMatch is false and availability status
		FacebookUser matchedUser = null; // matched user is not yet determined
			for (FacebookUser newUser: userList) { // Enhanced for loop starts
				if (newUser.toString().equalsIgnoreCase(username)) { // if starts  			  			
						userMatch = true; // userMatch is true
						matchedUser = newUser; // newUser is assigned to matchedUser
						break; // ends the loop
				} // if ends
			} // Enhanced for loop ends
			
			if(!userMatch) { // the user is doesn't pass status check
				 System.out.println("Invalid user. No user exists");
			} // if ends
		return matchedUser;
    } // isValidUser ends here
	
	/**
	 * Determines if the user is valid or not
	 * @param Facebook account1, FacebookUser user
	 * Returns matchedUser
	 * */
	public static boolean isValidPasswd(String password, FacebookUser user) { // isValid starts
		boolean ret = false;
		if(user.checkPassword(password)) { // if starts
			ret = true;
				
			} else { // else starts
				 System.out.println("Invalid password");
			} // if else ends	
		return ret;
    } // isValidUser ends here
	
    /**Like button is here*/
	public static FacebookUser likeButton(Facebook account1) {
		// User input and prompt for this.username
		        FacebookUser userMatch = userPrompt(account1);
				FacebookUser ret = null;
				Scanner in = new Scanner(System.in);
				System.out.println("What's your username: ");
			    String username = in.next();
			    ArrayList<FacebookUser> userList = account1.getUsers();
			    String likedThing;
			    
		        System.out.println("Enter what you like: ");
		        likedThing = in.next(); // user input
		        //boolean userMatch = false; // userMatch is false 
		        // button needs to be called here
				FacebookUser matchedUser = null; // matched user is not yet determined
				if (!userMatch.likes.contains(likedThing)) { // if starts
					//Integer count = counts.get(word);		
						//	TreeSet Likes contains liked objects and the HashMap counts
						//  stores the number of liked objects that the users like
						userMatch.likes.add(likedThing);
						userMatch.counts.put(likedThing, 1);
						//Likes will add linkedThin and count will store count
						// This statement checks that the user likes likedThing
						System.out.println(userMatch.toString() + " likes " + likedThing);
					} 
		        // enhanced for loop to insert what user likes
		       
			 // Like button method is here instead
				return ret; // returns ret
				
	}
	
	/**Sorts the user's alphabetically & Displays*/
	public static FacebookUser likeDisplay(Facebook account1) {
		// User input and prompt for this.username
		        FacebookUser userMatch = userPrompt(account1);
				FacebookUser ret = null;
				counts = new HashMap<>();
		    	likes = new TreeSet<String>();
		    	ArrayList<FacebookUser> users = account1.getUsers();
		    	for (int i = 0; i< users.size(); i++) { // for loop starts
		    		FacebookUser user = users.get(i);
			    	
			    	// Iterator iT is used to display liked input and count. 
			    	Iterator<String> iT = user.likes.iterator();
			    	while(iT.hasNext()) { // while starts
			    		// As the word is added, then that counts will get the number of words entered
			    		String word = iT.next();
			    		if(!likes.contains(word)) {
				    		counts.put(word, user.counts.get(word));
				    		likes.add(word);
			    		} else {
			    			Integer count = counts.get(word);
							counts.put(word, count+1);
			    		}
						//System.out.println(word + " " + user.counts.get(word));
					} // while ends
		    	}
		    	System.out.println(" Like\tCount");
		    	//print consolidated
		    	Iterator<String> iT = likes.iterator();
		    	while(iT.hasNext()) { // while starts
		    		String word = iT.next();
		    		System.out.println(word + " " + counts.get(word));
		    	}
		       
			 // Like button method is here instead
				return ret; // returns ret
				
	} 
} // FacebookDriver ends here
