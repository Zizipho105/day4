package day4;

import java.util.Scanner;

public class ParkingCharge {
	public static void main(String[]args) {
	   Scanner input= new Scanner(System.in);
      System.out.println("enter hours");
       double hours=input.nextDouble();
      double charge= calCharge(hours);
      
      System.out.println("Charge is $ "+ charge);
	}
	 public static double calCharge(double hrs ) {
		 double charge=0.0;
		if(hrs==24)
	       {
	        	return charge=10.00;
	        	
	       }else if (hrs>=1&& hrs<=3)
	       {
	    	   return charge=2.00;
	    	   
       	  }else if (hrs>3 && hrs< 24)
          {
          	return charge=2.00+((hrs-3)*0.50);
          	
          }
       	  else {
       		  return 0.0;
       	  }
		
		
	 }   
}
