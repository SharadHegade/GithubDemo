package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("D:\\Sharad\\CopiedFileEx.txt",true))
		{
			fw.write(" \n Testcase 5 : Failed !!! ");
			System.out.println("File has been appended");
		}

		catch(IOException e)
		{
			System.out.println("Error : " +e.getMessage());
		}
	}

}
