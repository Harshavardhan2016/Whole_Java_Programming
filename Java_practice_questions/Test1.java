/*
class Test1 
{
	public static void main(String[] args) 
	{
		int x=1;
		int pr=1;
		while (pr<=100)
		{
			int count =0;
			for (int j=1;j<=x ;j++ )
			{
				if (x%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(x);
				pr++;
			}
		x++;
		}
		
	}
} 
*/

import java.util.*;
class Test1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int prod=1;
		while (n!=0)
		{
			int ld = n%10;
			prod = prod*ld;
			n=n/10;
		}
		n= prod;
		int rev =0;
		while (n!=0)
		{
			int ld = n%10;
			rev = rev*10+ld;
			n= n/10;
		}
		if (prod == rev)
		{
			System.out.println("Pal");
		}
		else
		{
			System.out.println("Not a Pal");
		}
	}
} 

/*
import java.util.*;
class Test1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int hcf=1;
		for (int i=1;i<=n1 ;i++ )
		{
			if (n1%i==0 && n2%i==0)
			{
				hcf=i;
			}
			
		}
		int Lcm = n1*n2/hcf;
		System.out.println(Lcm);
		
	}
} 
*/

/*
import java.util.*;
class Test1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int hcf=1;
		for (int i=1;i<=n1 ;i++ )
		{
			if (n1%i==0 && n2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
	}
}

*/
/*
import java.util.*;
class Test1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N = s.nextInt();
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(M*i);
		}
		System.out.println("-----------------0");
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(N*i);
		}

	//	System.out.println("Hello World!");
	}
}

*/