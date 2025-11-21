package Strings;

public class ReverseCheckPalindrome {


	public static void main(String[] args) {
		
		String str = "racecar";
		String str1 ="Java Programming";
		String reverse = "";
		
		for(int i=str.length()-1; i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse using for loop  : " +reverse);
	

        StringBuilder sb = new StringBuilder(str1);
        sb.reverse().toString();
        
        System.out.println("Reverse using StringBuilder :" + sb);
        
        if(str.equals(reverse))
        {
        	System.out.println("Palondrome");
        }
        else
        {
        	System.out.println("Not Palondrome");
        } 
        
	}
	  
}
