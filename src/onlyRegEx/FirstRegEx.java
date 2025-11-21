package onlyRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstRegEx {

	public static void main(String[] args) {
		
		String str = "I am sharadhegade@bmsit.com MCA BMSIT Call 123-4568798 programming Matches http:// or https://";
		String strEmail="sharad.hegade2211@bmsit.com";
		
		//Find a word BMSIT
		Pattern pat= Pattern.compile("BMSIT");
		Matcher mat=pat.matcher(str);
		System.out.println(mat.find());
		
		//matching email
		String emailPattern = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		boolean mal =strEmail.matches(emailPattern);
		System.out.println(mal);
		
		//Extract only numbers
		Pattern num=Pattern.compile("\\d+");
		Matcher matNum = num.matcher(str);
		while(matNum.find())
		{
			System.out.println(matNum.group());
		}

	}

}
