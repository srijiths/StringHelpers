package com.sree.textbytes.StringHelpers;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * 
 * @author   Sree
 *
 * Read a txt file line by line and add to a list
 */
public class ReadFile
{
	private static final Logger logger = Logger.getLogger(ReadFile.class.getName());
	public static List<String> read(File fileName) {
		List<String> lines = new ArrayList<String>();
		FileInputStream fileInputStream = null;
		logger.debug("File created with name "+fileName.getName());
		try {
			fileInputStream = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			logger.error("Input file not found "+e.toString());
		}
		
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
		String line;
		try {
			logger.debug("Reading line by line from file "+fileName.getAbsolutePath());
			while((line = bufferedReader.readLine()) != null)
			{
				lines.add(line);
			}
		} catch (IOException e) {
			logger.error("IO Exception "+e.toString());
		}
		
		logger.debug("File read completely");
		return lines;
	}

}
