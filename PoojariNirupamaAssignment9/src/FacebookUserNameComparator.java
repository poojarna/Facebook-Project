import java.util.Comparator;

public class FacebookUserNameComparator implements Comparator<FacebookUser> {

	@Override
	public int compare(FacebookUser o1, FacebookUser o2) {
		return o1.toString().compareToIgnoreCase(o2.toString());
	}

}
