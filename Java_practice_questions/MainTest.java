/*
class MainTest 
{
	public static void main(String[] args) 
	{
		int x=1;
		int prime =1;
		while (prime<=100)
		{
			int count =0;
			for (int i=1;i<=x ;i++ )
			{
				if (x%i==0)
				{
					count++;
				}
			}
			if (count ==2)
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

class MainTest 
{
	public static void main(String[] args) 
	{
		int x=1;
		int pal =1;
		while (pal<=100)
		{
			int rev =0;
			int t =x;
			while (x!=0)
			{
				int ld= x%10;
				rev = rev*10+ld;
				x=x/10;
			}
			x =t;
			if (rev == x)
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

class MainTest 
{
	public static void main(String[] args) 
	{
		int space =0;
		int star =5;
		for (int i =1;i<=5 ;i++ )
		{
			for (int c=1;c<=star ;c++ )
			{
				System.out.print(" * ");
			}
			for (int a=1;a<=space ;a++ )
			{
				System.out.print("   ");
			}

			for (int b=1;b<=star ;b++ )
			{
				System.out.print(" * ");
			}
			star -=1;
			space +=2;
			System.out.println();

		}
	}
}
*/

/*
class MainTest 
{
	public static void main(String[] args) 
	{
		int space =3;
		int star =1;
		for (int i =1;i<=7 ;i++ )
		{
			for (int a=1;a<=space ;a++ )
			{
				System.out.print("   ");
			}

			for (int b=1;b<=star ;b++ )
			{
				System.out.print(" * ");
			}
			if (i>=4)
			{
				space++;
				star -=2;
			}
			else 
			{
				space--;
				star +=2;
			}
			System.out.println();

		}
	}
}
*/
