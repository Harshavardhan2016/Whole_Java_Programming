class Pattern8
{
	public static void main(String[] args) 
	{
		int n='A'-1;
		for (int i =1; i<=5;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				n=(n+1);
				System.out.print(" "+(char)n+" ");
			}
			System.out.println();
		}
		
	}
}


/*
class Pattern8
{
	public static void main(String[] args) 
	{
		int n='A';
		for (int i =1; i<=5;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				System.out.print(" "+(char)n+" ");
				n++;
			}
			System.out.println();
		}
		
	}
}
*/