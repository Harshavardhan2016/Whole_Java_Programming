import java.util.*;
class Test2 
{
	public static void main(String[] args) 
	{
		int x =1;
		int prime =1;
		while (prime<=200)
		{
			int count=0;
			for (int i=1;i<=x;i++)
			{
				if (x%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(x);
				prime++;
			}
		x++;
		}
	}
}

/*
import java.util.*;
class Test2 
{
	public static void main(String[] args) 
	{
		int x =1;
		int prime =1;
		while (prime<=200)
		{
			int count=0;
			for (int i=1;i<=x;i++)
			{
				if (x%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(x);
				prime++;
			}
		x++;
		}
	}
}
*/

/*
import java.util.*;
class Test2 
{
	public static void main(String[] args) 
	{
		int x =1;
		int pal =1;
		while (pal<=50)
		{
			int temp =x; int rev=0;
			while (x!=0)
			{
				int ld = x%10;
				rev = (rev*10) +ld;
				x=x/10;
			}
			x = temp;
			if (x==rev)
			{
				System.out.println(x);
				pal++;
			}
		x++;
		}
	}
}
*/


/*
import java.util.*;
class Test2 
{
	public static void main(String[] args) 
	{
		int x =1;
		int perf =1;
		while (perf<=4)
		{
			int sum =0;
			for (int i =1;i<x ;i++ )
			{
				if (x%i==0)
				{
					sum = sum+i;
				}
			}
			if (sum ==x)
			{
				System.out.println(x);
				perf++;
			}
		x++;
		}
	}
}
*/

/*
import java.util.*;
class Test2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt(); int t =n;
		int count =0;
		while (n!=0)
		{
			count++;
			n = n/10;
		}
		n=t;
		int sum =0;
		while (n!=0)
		{
			int ld = n%10; int exp=1;
			for (int i =1;i<=count;i++  )
			{
				exp= exp*ld;
			}
			sum = sum+exp; n = n/10;
		}
		if (t == sum)
		{
			System.out.println("Arm");
		}
		else
		{
			System.out.println("Not arm");
		}
	}
}
*/