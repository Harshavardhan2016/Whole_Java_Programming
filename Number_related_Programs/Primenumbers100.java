class Primenumbers100 
{
	public static void main(String[] args) 
	{
		int x=2;
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
				System.out.println(prime+" : "+x);
				prime++;
			}
			x++;
		}
		System.out.println(prime-1);
	}
}



/*
class Primenumbers100 
{
	public static void main(String[] args) 
	{
		int x=0;
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
				System.out.println(prime+" : "+x);
				prime++;
			}
			x++;
		}
		System.out.println(prime);
	}
}

*/

/*
class Primenumbers100 
{
	public static void main(String[] args) 
	{
		int x=0;
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
				if (prime==88)
				{
					System.out.println(prime+" : "+x);
				}
				
				prime++;
			}
			x++;
		}
		System.out.println(prime);
	}
}
*/