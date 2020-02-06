package day4;

import java.util.Scanner;
public class Class1 {
			
    public static void main(String[]args)
        {
            int num1,num2,product=0;
            Scanner input= new Scanner(System.in);
            System.out.println("input fist interger");
            num1=input.nextInt();
            System.out.println("input second interger");
            num2=input.nextInt();
            calProduct( num1, num2);
            System.out.println("Product = "+ calProduct( num1, num2));
            //input.close();
        }
    public static int  calProduct(int num1,int num2) {
           int  product=num1*num2;
           return product;

    }


}
