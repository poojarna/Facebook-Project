import java.util.Objects;
import java.io.Serializable;
/**
 * 
 */

/**
 * @author Nirupama Poojari
 *
 */
public abstract class UserAccount implements Serializable {
	//private double balance;
	private String username;
	private String password;
	private boolean active;
	public abstract void getPasswordHelp();
	String passwordHint; // needed to get rid of null printing after value

	public UserAccount(String username, String password){ // constructor to initialize the 
		// username and password, make the account active
		this.username = username;
		this.password = password;
		this.active = true;
	}
	

    // public static void main(String[] args) {
		
		 
	//}

	
	//public boolean checkPassword(String password); // return true if the argument is the
	// same as this account's password, false otherwise
	//public void deactivateAccount(); // make this account inactive
	
	
	public boolean checkPassword(String password) {
		boolean ret = false;
		
	    if (this.password.compareTo(password) == 0) {
	    	ret = true;
	    } 
	    return ret;
	}

	public void deactivateAccount() {
	   
	   active = false;
	   
	  
  	}

	public String toString() {
		//System.out.print(username);
		return username;
	}


	@Override
	public int hashCode() {
		return Objects.hash(username);
	}


	@Override
	public boolean equals(Object obj) {
		boolean ret = false;
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		UserAccount other = (UserAccount) obj;
	//	return Objects.equals(username, other.username);
		String str1 = this.username;
		String str2 = other.username;
		int c = str1.compareTo(str2);
		if (this.username.compareTo(other.username) == 0) {
			ret = true;
		}
		
		return ret;
	}


	/**
	 * Determines if account is active
	 * @return active
	 */
	public boolean isActive() {
		return active;
	}

/*
	
	public String getPasswordHint() {
		return passwordHint;
	}


	
	public void setPasswordHint(String passwordHint) {
		this.passwordHint = passwordHint;
	}
	*/
}
