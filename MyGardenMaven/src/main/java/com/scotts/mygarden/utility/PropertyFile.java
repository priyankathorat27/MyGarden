package com.scotts.mygarden.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {

	public static String proReader (String PropertyName){
        String str =null;
        try {
        	// Load the properties File
        	Properties pro= new Properties();
            File fl= new File ("C:\\Users\\DELL\\git\\MyGarden\\MyGardenMaven\\constant.properties");
            FileInputStream fis = new FileInputStream(fl);
            pro.load(fis);
            str = pro.getProperty(PropertyName);
            //return str;
        } catch (Exception e){
            System.out.println("Expection is:  "+ e.getMessage());        
        }
           return str;
        
    }
}
