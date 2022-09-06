class PatternK 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=11 ;i++ )
		{
			for (int j =1;j<=6 ;j++ )
			{
				if (j==1 || i+j==7 || i-j==5)
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




/*
class PatternK 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=11 ;i++ )
		{
			for (int j =1;j<=6 ;j++ )
			{
				if (i<=6)
				{
				if (j==1 || i+j==7)
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
					if (j==1 || i-j==5)
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
*/