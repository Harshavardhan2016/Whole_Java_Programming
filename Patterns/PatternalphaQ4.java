class PatternalphaQ4 
{
	public static void main(String[] args) 
	{
		char x ='A';
		for (int i =1;i<=5 ;i++ )
		{
			for (int j =5;j>=1 ;j-- )
			{
				if (j>=i)
				{
					System.out.print(" "+x+" ");
					x++;
				}
				else{
				System.out.print("   ");
				}
			}
			System.out.println();
		}
		
	}
}
