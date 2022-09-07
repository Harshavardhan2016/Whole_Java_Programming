/*
import java.util.Scanner;
class Perfect_number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to know it is perfect or not");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		for (int i=1;i<n ;i++ )
		{
			if (n%i==0)
			{
				sum =sum+i
			}
		}
		if (sum==n)
		{
			System.out.println("Perfect number");
		}
		else
		{
		 System.out.println("Not a perfect number ");
		}

	}
}
*/

import java.util.Scanner;
class Perfect_number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to know it is perfect or not");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		for (int i =1;i<=n ;i++ )
		{
			int ct =0;
			for (int j=1;j<i ;j++ )
			{
				if (i%j==0)
				{
					ct = ct+j;
				}
			}
			count =ct;
			
		}
		if (n==count)
			{
				System.out.println(n + " is perfect number");

			}
			else
			{
			 System.out.println(n + " is not perfect number");
			}

	}
}




