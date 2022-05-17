package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public  ReadConfig() {
		File source=new File("./configuration/config.properties");
		try {
			FileInputStream file=new FileInputStream(source);
			pro=new Properties();
			pro.load(file);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String baseUrl() {
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String userName() {
		String user=pro.getProperty("username");
		return user;
	}
	public String passWord() {
		String pass=pro.getProperty("password");
		return pass;
	}
	public String chromePath() {
		String chpath=pro.getProperty("chromepath");
		return chpath;
	}
	public String edgepath() {
		String edgepath=pro.getProperty("edgepath");
		return edgepath;
	}

}
