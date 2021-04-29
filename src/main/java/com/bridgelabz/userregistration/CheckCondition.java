package com.bridgelabz.userregistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckCondition {
	
	public static boolean checkCondition(String userInput,String regex) {
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(userInput);
		boolean result = matcher.matches();
		return result;
	}
}
