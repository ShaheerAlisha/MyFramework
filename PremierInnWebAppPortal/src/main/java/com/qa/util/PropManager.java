package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropManager {

	private static Properties prop;

	//Constructor to invoke Property file
	public PropManager() {
		try {
			prop = new Properties(); //Creation of Properties object reference
			FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\properties\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Get values from Property file
	public static String getProp(String key) {
		return prop.getProperty(key);

	}
}
