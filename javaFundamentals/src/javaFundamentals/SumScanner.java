package javaFundamentals;

import java.util.Scanner;

public class SumScanner {

	public static void main(String[] args) 
	{
		int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        a = sc.nextInt();
        
        System.out.print("Enter b value: ");
        b= sc.nextInt();
        
        sum = a+ b;
        System.out.println("Sum of these numbers: "+sum);
   

		
	}

}
