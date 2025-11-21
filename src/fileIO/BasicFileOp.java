package fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BasicFileOp {

	public static void main(String[] args) {
		
		
		try {
		File newFile = new File("Testfile.txt");
		FileWriter writeFile = new FileWriter("Testfile.txt");
		
		writeFile.write("I am an MCA graduate");
		writeFile.close();
		
		System.out.println("Successfully wrote to the file.");
			
		//Scanner reader = new Scanner(newFile) {
			//While (reader.hasNextLine()) {
				//String data = reader.nextLine();
				//System.out.println(data);
		//	}
			
		//}
		
		if(newFile.createNewFile()) {
			System.out.println("File created: " + newFile.getName());
		} 
		
		else {
			System.out.println("File already exists.");
		}
		} 
		
		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
