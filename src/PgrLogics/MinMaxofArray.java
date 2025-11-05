package PgrLogics;

public class MinMaxofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {45,35,89,78,67};
		int maxValue = numbers[0];
		int minValue = numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i]< minValue)
				minValue = numbers[i];
			if(numbers[i]> maxValue)
				maxValue = numbers[i];
			
		}

		System.out.println("Min number is : " +minValue +  "Max number is :"+ maxValue );
	}

}
