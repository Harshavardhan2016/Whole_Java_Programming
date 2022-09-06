class Pattern_reversetriangle 
{
	public static void main(String[] args) 
	{
		int star=7;
		int space=0;
		for (int i=1;i<=4 ;i++ )
		{
			
			for (int b =1.;b<=space ;b++ )
			{
				System.out.print("   ");
			}
			for (int a=1;a<=star ;a++ )
			{
				System.out.print(" * ");
			}
			
			System.out.println();
			star=star-2;
			space++;
		}
		
	}
}


