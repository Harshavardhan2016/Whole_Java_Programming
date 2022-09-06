class Patternalphanum 
{
	public static void main(String[] args) 
	{
		int n=11;
		char x='A';
		for (int i =1;i<=5 ;i++ )
		{
			for (int j =5;j>=1 ;j-- )
			{
				if (j<=i)
				{
					System.out.print(" "+n+" ");
					n++;
				}
				else
				{
					System.out.print("  "+x+" ");
					x++;
				}
			}
			System.out.println();
		}
		
	}
}


/*
class Patternalphanum 
{
	public static void main(String[] args) 
	{
		int n=11;
		char x='A';
		for (int i =1;i<=5 ;i++ )
		{
			for (int j =1;j<=5 ;j++ )
			{
				if (i>=j)
				{
					System.out.print("  "+x+" ");
					x++;
				}
				else
				{
					System.out.print(" "+n+" ");
					n++;
				}
			}
			System.out.println();
		}
		
	}
}
*/
