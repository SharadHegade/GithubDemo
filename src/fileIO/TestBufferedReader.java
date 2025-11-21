package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\Sharad\\Locators_fos.txt")))	
		{
			String line;
			
			{
				while((line=br.readLine())!=null)
				{
					System.out.println(line);
				}
				
			}
				
		}

		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
