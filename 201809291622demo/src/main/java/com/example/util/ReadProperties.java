package com.example.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ReadProperties {

	
	   public static String getProperties(String key) {
	        Properties pros = new Properties();
	        String value = "";
	        try {
	            pros.load(new InputStreamReader(Object.class.getResourceAsStream("/.properties"), "UTF-8"));
	            value = pros.get(key).toString();
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        return value;
	    }
}
