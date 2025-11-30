import java.util.Comparator;

public class FacebookUserFriendCountComparator implements Comparator<FacebookUser> {

	@Override
	public int compare(FacebookUser o1, FacebookUser o2) {
		
		int ret = 0;
		if (o1.getFriends().size() > o2.getFriends().size()) {
			ret = -1 ;
		} else if (o1.getFriends().size() < o2.getFriends().size()) {
			ret =1;
		} 
		
		return ret;
	} // compareTo() ends
}
