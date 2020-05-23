package com.actiTime.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataConfiguration
{
	Properties readProperties;

	public ReadDataConfiguration()
	{
		File sourceProperties= new File("./Configuration/DataConfiguration.properties");
		try
		{
			FileInputStream fis=new FileInputStream(sourceProperties);
			readProperties=new Properties();
			readProperties.load(fis);
		}
		catch (Exception e)
		{
			System.out.println("Exception is:" +e.getMessage());
		}
	}
	public String getUrl()
	{
		String url=readProperties.getProperty("Url");
		return url;
	}
	public String getUsername()
	{
		String usernm=readProperties.getProperty("Username");
		return usernm;
	}
	public String getPassword()
	{
		String pass=readProperties.getProperty("Password");
		return pass;
	}
	public String getChromePath()
	{
		String chromepath=readProperties.getProperty("Chromepath");
		return chromepath;
	}
}

