package day4;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[]args) {
	
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer value");
        int number=input.nextInt();
       boolean n= intEven(number);
       System.out.println("Results ="+n);
        
       
	}
	 public static boolean  intEven(int n) {
		 
         if (n%2==0)
         {
        	 return true;
         }
         else 
         {
        	 return false;
         }

  }
	
}
