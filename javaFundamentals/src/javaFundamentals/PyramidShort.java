package javaFundamentals;

public class PyramidShort {
	public static void main(String args[])
	{
		int i,j,k=4;
		for(i=0; i<5; i++)
		{
			for(j=0; j<k; j++)
			{
				System.out.print(" ");
		}
			k=k-1;
			for(j=0; j<=i; j++)
			{
				 System.out.print("* ");
			}
			System.out.println();
		}
			
		System.out.println();
	}
}

