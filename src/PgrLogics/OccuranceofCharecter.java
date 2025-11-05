package PgrLogics;

public class OccuranceofCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Sharad Hegade MCA BMSIT Bangalore"; 
		
		char c = 'a';
		char cap = 'A';
		int count=0; 
		int chCount = str.length();
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		for (char ch :charArray ) 
		{	
			if(ch==c || ch==cap)
			count++;
		}

		System.out.println("Total no of occurance of charecter A or a is " +count);
		System.out.println("Character count " + chCount);
	}

}
