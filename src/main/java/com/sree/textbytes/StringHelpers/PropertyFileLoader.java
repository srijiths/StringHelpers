package com.sree.textbytes.StringHelpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 
 * @author 		: Sreejith.S
 * 
 * A Property file loader class.
 *
 */

public class PropertyFileLoader 
{
	private static final Logger logger = Logger.getLogger(PropertyFileLoader.class.getName());

	/** holds the properties */ 
	public Properties properties = new Properties(); 
	
	/** Name of the property file */
	private String propertyFileName = null;

	
	/**
	 * initialize the properties with the given property file name.
	 * @param fileName
	 */
	
	public void inilializeProperty(String fileName)
	{
		File propertyFile = new File(fileName);
		if(propertyFile.exists()) {
			logger.debug("Property file exists, "+propertyFile.getName());
			try {
				InputStream configStream = new FileInputStream(propertyFile);
				properties.load(configStream);
				setPropertyFileName(propertyFile.getName());
				
			}catch (FileNotFoundException e){
				logger.error("Proeprty File Not found  "+e.toString());
				
			} catch (IOException e) {
				logger.error("IO Exception  "+e.toString());
			}
			
			logger.debug("Property file loaded with "+propertyFile.getName());
			
		}
		else {
			logger.error("Property file does not exists , exiting "+propertyFile.getAbsolutePath());
			properties = null;
			return;
		}
	}
	
	/** get the property file name */
	public String getPropertyFileName() {
		return propertyFileName;
	}
	
	/** Set the property file name 
	 * @return */
	public void setPropertyFileName(String fileName) {
		propertyFileName = fileName;
	}

}
