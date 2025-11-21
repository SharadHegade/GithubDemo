package Strings;

public class UpperLowerSpecialCount {

	public static void main(String[] args) {
		
		String str="BMS Institute of Technology @2024!";
		
		int uppercaseCount=0;
		int lowercaseCount=0;
		int specialcharCount=0;
		
		for(char ch:str.toCharArray()) 
		{
			if(Character.isUpperCase(ch))
			{
				uppercaseCount++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowercaseCount++;
			}
			else if(!Character.isWhitespace(ch) && !Character.isDigit(ch))
			{
				specialcharCount++;
				
			}
			
		}
	      System.out.println("UpperCase : " +uppercaseCount);
	      System.out.println("LowerCase : " +lowercaseCount);
	      System.out.println("Special chars : " +specialcharCount);
	}

}
