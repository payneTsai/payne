package payne.util;

/**
 * auther:payne
 * DATE:2017/12/25
 */
public interface UrlMatcher{
		Object compile(String paramString);
		boolean pathMatchesUrl(Object paramObject, String paramString);
		String getUniversalMatchPattern();
		boolean requiresLowerCaseUrl();
}