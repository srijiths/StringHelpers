package com.sree.textbytes.StringHelpers;

/**
 * Created by IntelliJ IDEA.
 * 
 * @user 		: Sreejith.S
 * 
 */

import java.util.regex.Pattern;

public class StringReplacement
{
	private Pattern pattern;
	private String replaceWith;
	
	private StringReplacement(Pattern pattern, String replaceWith) {
		this.pattern = pattern;
		this.replaceWith = replaceWith;
	}

	public static StringReplacement compile(String pattern, String replaceWith) {
		if (string.isNullOrEmpty(pattern)) throw new IllegalArgumentException("Patterns must not be null or empty!");
		Pattern p = Pattern.compile(pattern);
		return new StringReplacement(p, replaceWith);
	}

	public String replaceAll(String input) {
		if (string.isNullOrEmpty(input)) return string.empty;
		return pattern.matcher(input).replaceAll(replaceWith);
	}
}

