package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferReader {

	public static void main(String[] args) {
		
		try(BufferedReader br=new BufferedReader(new FileReader("D:\\Sharad\\FileEx.txt")))
		{
			String line;
			
			while((line=br.readLine())!=null)
			{
				System.out.println("File Reading : "+line);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error message : " +e.getMessage());
		}

	}

}
