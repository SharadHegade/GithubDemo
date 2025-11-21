package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferWriter {

	public static void main(String[] args) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Sharad\\Locators_fos.txt")))
		{
			bw.write("First Line");
			bw.newLine();
			bw.write("BCA BCA BCA BCA BCA");
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
