package day4;

import java.util.Scanner;

public class Points {
	public static void main(String[]args) {
		
        Scanner input= new Scanner(System.in);
        System.out.println("Enter points");
        int points=input.nextInt();
       int no= qualityPoints(points);
        System.out.println("results = "+no);
       
	}
	 public static int qualityPoints(int points) {
		 int n=0;
         if (points>=90 && points<=100)
         {
        	 return n=4;
         }
         else if(points>=80 && points<=89)
         {
        	return n=3;
         }
         else if(points>=70 && points<=79)
         {
        	 return n=2;
         }
         else if(points>=60 && points<=69)
         {
        	 return n=1;
         }
         else {
        	 return n=0;
         }

  }

}
