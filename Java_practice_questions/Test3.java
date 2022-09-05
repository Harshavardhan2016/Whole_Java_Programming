class Test3 
{
	public static void main(String[] args) 
	{
		char c = 'A';
		int x =1;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j =5;j>=1 ;j-- )
			{
				if (j>=i)
				{
					System.out.print("  "+x+" ");
					x++;
				}
				else
				{
					System.out.print("  "+c+" ");
					c++;
				}
			}
			System.out.println();
			System.out.println();
		}
		
	}
}
