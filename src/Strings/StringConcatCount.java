package Strings;

public class StringConcatCount {

	public static void main(String[] args) {
		
		//Concatenating Strings
		String str1="Hi Hello";
		String str2="How are you doing today";
		
		String ConcatStr=str1+" "+str2;
		System.out.println("Concatinated Strings : " +ConcatStr);
		
		
		//Occurrence of characters
		String str3="BMS Institute of Technology MCA Bangalore 2006";
		char targetChr ='t';
		int count=0;
		
		for(int i=0; i<str3.length();i++) 
		{
			if(str3.charAt(i) == targetChr) 
			{
				count++;
			}

		}
		System.out.println("Occurance of "+targetChr+" character : " +count);
		
		//No of characters in a Sentence
		
		int charCount = str3.length();
		System.out.println("No of character : " +charCount);
	}

}
