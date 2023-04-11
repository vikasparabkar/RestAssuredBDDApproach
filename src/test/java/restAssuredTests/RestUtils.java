package restAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String title() {
		String string=RandomStringUtils.randomAlphabetic(3);
		return ("john"+string);
	}
	
	public static String body() {
		String string=RandomStringUtils.randomAlphabetic(3);
		return ("cena"+string);
	}
	public static String userId() {
		String string=RandomStringUtils.randomAlphanumeric(1);
		return ("100"+string);
	}
}
