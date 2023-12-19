package com.qa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadConfigFile 
{
	Properties prop;
	String path="C:\\Users\\HP\\eclipse-workspaceSept7Javasele\\October22DemoRecordFramework1\\archetype-fitgoodies-quickstart\\Config.properties";
	
	public ReadConfigFile()
	{
		prop=new Properties();
		try {
			FileInputStream fis= new FileInputStream(path);
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public String getURL()
	{
		String url= prop.getProperty("url");
		if (url!=null)
		{
			return url;
		}
		else
		{
			throw new RuntimeException("url not specified in config file");
		}
	}
	
	public String get_username()
	{
		String username= prop.getProperty("username"); //prop.getProperty("username"); this statement will read value of key "username" from config.properties file
		
		if (username!=null)
		{
			return username;
		}
		else
		{
			throw new RuntimeException("username not specified in config file");
		}
	}
	
	public String get_password()
	{
		String password= prop.getProperty("password");
		if (password!=null)
		{
			return password;
		}
		else
		{
			throw new RuntimeException("password not specified in config file");
		}
	}
	
	public String getBrowsername()
	{
		String browser= prop.getProperty("browser");
		if (browser!=null)
		{
			return browser;
		}
		else
		{
			throw new RuntimeException("browser name is not specified in config file");
		}
	}
	
	public String getProductToBuy()
	{
		String product= prop.getProperty("product");
		if (product!=null)
		{
			return product;
		}
		else
		{
			throw new RuntimeException("browser name is not specified in config file");
		}
	}
	
}
