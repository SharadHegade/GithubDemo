package Strings;

public class ExtractNumberfromSentence {

	public static void main(String[] args) {
		
		String str = " Today I have receved 120.99 million dollars";
		
		String numbersOnly = str.replaceAll("[^0-9.]","");	
		System.out.println("Keeping only Numbers" +numbersOnly);
		
		String onlyDigits = str.replaceAll("[^0-9]","");	
		System.out.println("Keeping only Numbers" +onlyDigits);
		
	

	}

}
