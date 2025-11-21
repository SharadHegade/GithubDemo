package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileUsingFileInputStream {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("D:\\Sharad\\FileEx.txt");
			FileOutputStream fos=new FileOutputStream("D:\\Sharad\\CopiedFileEx.txt"))
		{
			byte[] buffer = new byte[1024];
			int byteRead;
			while((byteRead=fis.read(buffer))!=-1)
			{
				fos.write(buffer,0,byteRead);
			}
		
		
		   System.out.println("File copied Successfully !!! ");
		}
		catch(IOException e)
		{
			System.out.println("Error :" +e.getMessage());
		}
	}
}
