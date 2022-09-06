/*
class Pattern12345 
{
	public static void main(String[] args) 
	{
		int star =5;
		int space =0;
		int x=1;
		for (int i=1;i<=5 ;i++ )
		{
			int t =x;
			for (int a=1;a<=star ;a++ )
			{
				System.out.print(x);
				x++;
			}
			x = t+1;
			int y =1;
			for (int b =1;b<=space ;b++ )
			{
				System.out.print(y);
				y++;
			}
			System.out.println();
			star--;
			space++;
		}
		
	}
}
*/

/*
class Pattern12345 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			int a =i;
			int l =1;
			int space =0;
			for (int j=1;j<=5-i+1 ;j++ )
			{
				System.out.print(a);
				a++;
			}
			for (int k =0;k<=i-2 ;k++ )
			{
				if (i>1)
				{
					System.out.print(l);
					l++;
				}
			}
			System.out.println();
		}
		
	}
}
*/
class Pattern12345 
{
	public static void main(String[] args) 
	{
		int star =5;
		int space =0;
		
		for (int i =1;i<=5 ;i++ )
		{
			int y =i;
			for (int a=1;a<=star ;a++ )
			{
				System.out.print(y);
				y++;
			}
			int x =1;
			for (int b =1;b<=space ;b++ )
			{
				System.out.print(x);
				x++;
			}
			star--;
			space++;
			System.out.println();
		}
		
	}
}
