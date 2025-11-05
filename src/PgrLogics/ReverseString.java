package PgrLogics;

public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "Sharad Hegade MCA";
		String outputString="";
		
		//Using StringBuilder Class to reverse a String
		
		StringBuilder sb=new StringBuilder(inputString);
		StringBuilder revString = sb.reverse();
		
		System.out.println("Reverse a String using String Builder class :" +revString);
		
		//Using for loop to Reverse a given string
		
		for(int i=inputString.length()-1; i>=0; i--)
		{
			outputString = outputString+inputString.charAt(i);
		}

		System.out.println("Given string: " +inputString +  " Length of the String is :"+inputString.length());
		System.out.println("Reverse order of given string :" +outputString);
	}

}
