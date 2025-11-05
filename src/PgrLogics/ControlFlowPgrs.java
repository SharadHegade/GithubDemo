package PgrLogics;

public class ControlFlowPgrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControlFlowPgrs.findGrade();
		ControlFlowPgrs.oddEven();
		
		ControlFlowPgrs tab = new ControlFlowPgrs();
		System.out.println(ControlFlowPgrs.table(5));
		System.out.println(ControlFlowPgrs.table(10));
		
	}
	
	public static void oddEven() {
	int num = 12;
	
	if(num % 2 == 0)
		
	{
		System.out.println("Even number");
	}
	
	else
	{
		System.out.println("Odd number");
	}
	}
	
	public static int table(int num1) {
		
		for(int i=0; i<=10; i++) {
			
			System.out.println(num1*i);
			
		}
			
		return num1;
		
	}
	
	public static void findGrade() {
		
		int marks = 80;
		
		if(marks >= 80)
			System.out.println("Distinction !!! ");
		else if(marks >= 60 && marks < 80 )
			System.out.println(" First Class ");
		else if(marks >= 50 && marks < 60)
			System.out.println(" Second class ");
		else if(marks >=35 && marks < 50)
			System.out.println(" Third class. Just Pass ");
		else 
			System.out.println("Fail");
			
	}
}
