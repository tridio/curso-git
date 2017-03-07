package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestaRegex {

	public static void main(String[] args) {
		Pattern pat = Pattern.compile("(\\d\\d)(\\w)");

		Matcher matcher = pat.matcher("11a22b33c");

		while (matcher.find()) {
			System.out.println(matcher.group());;
			System.out.println("-- " + matcher.group(1));
			System.out.println("-- " + matcher.group(3));
		}
	}

}
