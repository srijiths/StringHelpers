package com.sree.textbytes.StringHelpers;

/**
 * Created by IntelliJ IDEA.
 * 
 * @user 		: Sreejith.S
 *
 * 
 */

import java.util.regex.Pattern;

public class StringSplitter 
{
	private Pattern pattern;
	public StringSplitter(String pattern) {
		this.pattern = Pattern.compile(pattern);
	}

	public String[] split(String input) {
		if (string.isNullOrEmpty(input)) return string.emptyArray;
		return pattern.split(input);
	}
}

