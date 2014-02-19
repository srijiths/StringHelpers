package com.sree.textbytes.StringHelpers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author sreejith.s
 *
 */

public class PatternMatcher 
{
	/**
	 * Matches the text by applying regex and for each group matched a String will be entered in the ArrayList.
	 * 
	 * @param regex , regex to match
	 * @param text , the String to match against.
	 * @param group , the group number to return in case of a match.
	 * @return
     */

	public static List<String> getMatches(String regex,String text,int group) {
		List<String> matchList = new ArrayList<String>();
		Pattern pattern = Pattern.compile(regex,Pattern.DOTALL | Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			matchList.add(matcher.group(group));
		}
		return matchList;
	}
	
	/**
	 * Matches the text by applying regex and if a match found then return that match.
	 * 
	 * @param regex , regex to match
	 * @param text , the String to match against.
	 * @param group , the group number to return in case of a match.
	 * @return
     */

	public static String getMatch(String regex,String text,int group) {
		String matchedString = null;
		Pattern pattern = Pattern.compile(regex,Pattern.DOTALL | Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()) {
			matchedString = matcher.group(group);
		}
		return matchedString;
		
	}
}
