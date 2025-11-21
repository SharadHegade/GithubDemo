package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteText {

	public static void main(String[] args) throws IOException {
		
		try(FileWriter writer = new FileWriter("D:\\Sharad\\FileEx.txt"))
		{
			writer.write("Automation report :\n");	
			writer.write("First Test Case : PASSED \n");
			writer.write("Second Test case : PASSED\n");
			writer.write("Thrid Test case : PASSED\n");
			System.out.println("Data has been written successfully");
				
		}
		catch(IOException e)
		{
			System.out.println("Error writing to the file : -" +e.getMessage());
		}

	}

}
