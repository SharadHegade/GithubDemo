package PgrLogics;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float radius = 10.5f;
		float pi = 22/7f;
		int length = 22;
		int width = 45;
		
		float circleArea = pi*radius*radius;
		int rectArea = length*width;
		System.out.println("Area of Circle : " +circleArea);
		System.out.println("Area of Rectangle :" +rectArea);
		

	}

}
