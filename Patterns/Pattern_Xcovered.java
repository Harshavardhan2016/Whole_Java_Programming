class Pattern_Xcovered 
{
	public static void main(String[] args) 
	{
		int star=7;
		int space =0;
		for (int i=1;i<=7 ;i++ )
		{
			
			for (int b =1;b<=space ;b++ )
			{
				System.out.print("   ");
			}
			for (int a =1;a<=star ;a++ )
			{
				System.out.print(" * ");
			}
			if (i>=4)
			{
				space--;
				star= star+2;
			}
			else
			{
				space++;
				star= star-2;
			}
		System.out.println();
		}
		
	}
}
