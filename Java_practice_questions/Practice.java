
class Practice
{
	public static void main(String [] args)
	{
		double a =10.2;
		double b =20.3;
		int c = a/b;
		System.out.println(c);
	}

}


/*
import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int j =0;j<n ;j++ )
		{
		
		for (int i =0;i<n*2-1 ;i++ )
		{
			if ( j==i || i+j == n*2-2 || i==0 || i==n*2-2)
			{
				System.out.print(" * ");
			}
				else
			{
				System.out.print("   ");
				}
		}
		System.out.println();
		}
	}
}
*/
/*  // prime
import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int j =3;j<=n ;j++ )
		{
		
		for (int i =2;i<=j ;i++ )
		{
			if (j%i==0)
			{
				break;
			}
			else
			{
			System.out.println(j);
			break;
			}

		}
		}
	}
}
*/
/*  // prime number
import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i =1;i<=n ;i++ )
		{
			int count =0;
			for (int j=1;j<=i ;j++ )
			{
				if (i%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(i);
			}
		}
	}
}
*/
/* // palindrome
import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int dup = n;
		int rev =0;
		while (n!=0)
		{
			int ld = n%10;
			rev = rev*10 +ld;
			n= n/10;
		}
		if (dup == rev)
		{
			System.out.println("Pal");
		}
	}
}
*/

/* // perfect number
import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int op = 0;
		for (int i =1;i <n ;i++ )
		{
			int sum =0; 
			if (n%i==0)
			{
				sum = sum+i;
			}
			op = sum+op;
			
		}
		System.out.println(op);
	}
}
*/

/* //spy
import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int prod =1;
		
		while (n!=0)
		{
			int ld = n%10;
			sum = sum+ld;
			prod = prod*ld;
			n= n/10;

		}
		if (sum == prod)
		{
			System.out.println("Spy");
		}
	}
}
*/

/* // strong
import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int temp =n;
		
		while (n!=0)
		{
			int fact =1;
			int ld = n%10;
			for (int i =1;i<=ld ;i++ )
			{
				fact = fact*i;
			}
			sum = sum+fact;

			n = n/10;
		}
		if (sum == temp)
		{
			System.out.println("Strong"); //1,2,145
		}
	}
}
*/

/*
// sum of prime digits
import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		while (n!=0)
		{
			int ld = n%10;
			int count =0;
			for (int i=1;i<=ld ;i++ )
			{
				if (ld %i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				sum = sum+ld;
			}
			n= n/10;
		}
		System.out.println(sum);

	}
}

*/

