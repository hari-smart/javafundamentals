package javaFundamentals;

import java.util.Scanner;

public class EO {

	public static void main(String[] args)
	{
		int num;
	    System.out.println("Enter an Integer number:");
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");


	}

}
