package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		//Step 1 : Creating Input stream type object
		File absPath = new File("./TestData/configure.properties");
		FileInputStream fis = new FileInputStream(absPath);
		
		//Step 2 : Creating Object of the File Type
		Properties properties = new Properties();
		properties.load(fis);
		
		//Step 3 : Read Methods
		String name = properties.get("name").toString();
		System.out.println(name);
		System.out.println(properties.get("url").toString());
		
	}

}
