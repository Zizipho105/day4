package day4;

import java.util.Scanner;

public class Circle {
	public static void main(String[]args) {
		int radius=0;
        Scanner input= new Scanner(System.in);
        System.out.println("input radius");
        radius=input.nextInt();
        circleArea(radius);
        System.out.println("Circle area = "+ circleArea(radius));
	}
	 public static double  circleArea(int radius) {
		 
		double pie=3.14159;
	    double Area=3.14159*(radius*radius );
	    return Area;

  }

}
