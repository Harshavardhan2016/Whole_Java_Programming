class PatterStar_Q2Q3 
{
	public static void main(String[] args) 
	{
		int space =4;
		int star=1;

		for (int i =1;i<=9 ;i++ )
		{
			for (int a=1; a<=space;a++ )
			{
				System.out.print(" "+space+" ");
			}
			for (int b = 1;b<=star ;b++ )
			{
				System.out.print(" "+star+" ");
			}
			if (i<=5)
			{
				star++;
				space--;
			}
				else{
				star--;
				space++;
				}
			System.out.println();
		}
		
	}
}
