package com.sree.textbytes.StringHelpers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 		: Sreejith.S
 *
 */
public class WordStats 
{
	public static final WordStats EMPTY = new WordStats();
	/**
	 * total number of stopwords or good words that we can calculate
	 */
	private int stopWordCount = 0;

	/**
	 * total number of words on a node
	 */
	private int wordCount = 0;

	/**
	 * holds an actual list of the stop words we found
	 */
	private List<String> stopWords = new ArrayList<String>();

	public List<String> getStopWords() {
		return stopWords;
	}

	public void setStopWords(List<String> stopWords) {
		this.stopWords = stopWords;
	}

	public int getStopWordCount() {
		return stopWordCount;
	}

	public void setStopWordCount(int stopWordCount) {
		this.stopWordCount = stopWordCount;
	}

	public int getWordCount() {
			return wordCount;
		
	}

	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}

}