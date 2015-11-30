package example1;

import org.apache.commons.validator.routines.InetAddressValidator;
import org.apache.commons.validator.routines.UrlValidator;

public class URLValidator {

	public static UrlValidator urlValidator;

	public static boolean Validate( final String url ) {
		if (urlValidator == null) {
			final String[] schemes = { "http", "https" }; // DEFAULT schemes = "http", "https", "ftp"
			
			urlValidator = new UrlValidator( schemes, UrlValidator.ALLOW_ALL_SCHEMES );
		}

		if (urlValidator.isValid( url )) {
			return true;
		}

		return false;
	}

	public static boolean isValidIP4( final String address ) {

		if (InetAddressValidator.getInstance().isValidInet4Address( address )) {
			return true;
		}

		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(Validate("http://www.google.anonymous/"));
	}
}
