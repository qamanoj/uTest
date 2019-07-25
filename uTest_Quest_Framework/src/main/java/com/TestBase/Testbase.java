package com.TestBase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Testbase {

	public static Properties property;

	public static void loadproperty()
	{
		try 
		{
			File f=new File(System.getProperty("user.dir")+"/src/main/java/com/qa/configlibrary/confg.properties");

			FileReader fr=new FileReader(f);

			property=new Properties();

			property.load(fr);	
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
	}
	public String config(String key)
	{
		loadproperty();
		String x=property.getProperty(key);
		return x;

	}


	public static void loadpropertyOR() 
	{
		try 
		{
			File fil=new File(System.getProperty("user.dir")+"/src/main/java/com/qa/configlibrary/OR.properties");

			FileReader fl=new FileReader(fil);

			property=new Properties();

			property.load(fl);
		}
		catch (Exception e)
		{

			e.printStackTrace();
		} 
	}
	public static  String configOR(String str) 
	{
		loadpropertyOR();
		String y=property.getProperty(str);
		return y;
	}
}
