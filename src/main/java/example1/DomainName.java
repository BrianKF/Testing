package example1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

public class DomainName {
	private static final Logger logger = Logger.getLogger(DomainName.class.getName());

	public static void main(String[] args) {
		// Media Site Domain Data Cleanup
		String domain = "";
		String Media_domain = "", Media_page = "", Media_name = "yahoo.com/redir=www.abcd.com/def"; 
		String Media_bundle = "http://www.yahoo.com/", Media_storeurl = "http://www.yahoo.com";
		if (Media_domain != null && !Media_domain.isEmpty()) {
			domain = getDomainName(Media_domain, true);
			logger.log(Level.INFO, "DOMAIN: " + domain);
		}

		if (domain.isEmpty() && Media_page != null && !Media_page.isEmpty()) {
			domain = getDomainName(Media_page, false);
			logger.log(Level.INFO, "PAGE: " + domain);
		}

		if (domain.isEmpty() && Media_name != null && !Media_name.isEmpty()) {
			domain = getDomainName(Media_name, false);
			logger.log(Level.INFO, "NAME: " + domain);
		}
		
		Media_domain = domain;

		logger.log(Level.INFO, "All that matters is: " + Media_domain);

		// Media App Bundle Data Cleanup
		String bundle = "";

		if (Media_bundle != null && !Media_bundle.isEmpty()) {
			bundle = getMediaBundle(Media_bundle);
		}

		if (bundle.isEmpty() && Media_storeurl != null && !Media_storeurl.isEmpty()) {
			bundle = getMediaBundle(Media_storeurl);
		}

		Media_bundle = bundle;

	}

	@SuppressWarnings("finally")
	private static String getDomainName( final String incomingUrl, final boolean isDomain ) {
		String domainName = "";
		final String url = incomingUrl.replaceAll( "[^-_;/?:!*'()@&=$,.a-zA-Z0-9]", "" );
		try {
			if (URLValidator.Validate( url )) {
				URI uri;

				uri = new URI( url );
				final String domain = uri.getHost();
				domainName = StringUtils.startsWithIgnoreCase( domain, "www." ) ? domain.substring( 4 ) : domain;

			} else if (StringUtils.startsWithIgnoreCase( url, "www." ) && StringUtils.containsIgnoreCase( url, "/" )) {
				domainName = url.substring( url.indexOf( "www." ) + 4, url.indexOf( "/" ) );
			} else if (StringUtils.startsWithIgnoreCase( url, "www." ) && !StringUtils.containsIgnoreCase( url, "/" )) {
				domainName = url.substring( url.indexOf( "www." ) + 4, url.length() );
			} else if (!url.matches( "^(http|https|ftp)://.*$" )) {
				// Added to extract the domain information before the first "/" if the url is not valid
				if (url.indexOf( "/" ) != -1) {
					domainName = url.substring( 0, url.indexOf( "/" ) );
				}
			}

			if (StringUtils.isBlank( domainName ) && isDomain) {
				domainName = incomingUrl;
			}

		} catch ( final URISyntaxException e ) {
			logger.log( Level.SEVERE, "Exception in Domain Name - " + e.getMessage(), e );
		} finally {
			return domainName;
		}
	}

	private static String getMediaBundle(final String incomingMediaBundle) {
		String bundle = "";
		final String mediaBundle = incomingMediaBundle.replaceAll("[^-_;/?:!*'()@&=$,.a-zA-Z0-9]", "");
		if (URLValidator.Validate(mediaBundle)) {
			URI uri;
			try {
				uri = new URI(mediaBundle);
				final String path = uri.getPath();
				final String query = uri.getQuery();

				// Apple - sample format :
				// https://itunes.apple.com/us/app/facebook/id284882215?mt=8
				if (path != null && !path.isEmpty()) {
					final String pathDelim = "/";
					final StringTokenizer pathToken = new StringTokenizer(path, pathDelim);

					while (pathToken.hasMoreElements()) {
						final String value = (String) pathToken.nextElement();
						if (value.contains("id")) {
							bundle = value.substring(value.indexOf("id") + 2, value.length());
						}
					}
				}

				// Google - sample format :
				// https://play.google.com/store/apps/details?id=com.facebook.katana
				if (query != null && !query.isEmpty()) {
					final String queryDelim = "&";
					final StringTokenizer queryToken = new StringTokenizer(query, queryDelim);

					while (queryToken.hasMoreElements()) {
						final String value = (String) queryToken.nextElement();
						if (value.contains("id=")) {
							bundle = value.substring(value.indexOf("id=") + 3, value.length());
						}
					}
				}

			} catch (final Exception e) {
				logger.log(Level.SEVERE, "Exception in Media Bundle - " + e.getMessage(), e);
			}

		} else {
			// Invalid URL - so set it as it comes in the request
			bundle = incomingMediaBundle;
		}

		return bundle;
	}

}
