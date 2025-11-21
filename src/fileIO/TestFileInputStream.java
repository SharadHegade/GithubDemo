package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("D:\\Sharad\\Locators.txt");
				FileOutputStream fos = new FileOutputStream("D:\\Sharad\\Locators_fos.txt"))
		{
			int i;
			while((i=fis.read())!=-1) 
			{
				
				System.out.println((char)i);
				fos.write(i);
			}
		}
	    catch(IOException e)
		{
	    	System.out.println("Error reading file: " + e.getMessage());
		}
  
	}

}
