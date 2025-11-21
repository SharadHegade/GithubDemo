package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesCharsWords {

	public static void main(String[] args) {
		
		int txtChar=0;
		int words=0;
		int lines=0;
		
		try(BufferedReader br=new BufferedReader(new FileReader("D:\\Sharad\\CopiedFileEx.txt")))
		{
			String line;
			while((line=br.readLine())!=null)
			{
				lines++;
				txtChar = txtChar+line.length();
				words= words+line.split("\\s").length;
			}
			
			System.out.println("Lines : " +lines);
			System.out.println("Character : " +txtChar);
			System.out.println("Words : " +words);
		}

		catch(IOException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}

}
