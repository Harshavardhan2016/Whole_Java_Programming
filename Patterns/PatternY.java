class PatternY 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=9 ;i++ )
		{
			for (int j =1;j<=9 ;j++ )
			{
				if (i<6)
				{
				if (i==j || i+j==10)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");			
				}
				}
				else
				{
					if (j==5)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print("   ");
					}
				}
			}
			System.out.println();
		}
		
	}
}
