class Pattern_DiamondABCD 
{
	public static void main(String[] args) 
	{
		int sp =3;
		int x =1;
		int sp1=-1;
		char y ='A';
		for (int i=1;i<=7 ;i++ )
		{
			for (int a=1;a<=sp ;a++ )
			{
				System.out.print("   ");
			}	
			for (int b =1;b<=x ;b++ )
			{
				System.out.print(" "+y+" ");
			}
			for (int c=1;c<=sp1 ;c++ )
			{
				System.out.print("   ");
			}
			if (i>=2 && i<=6)
			{
			for (int d=1;d<=x ;d++ )
			{
				System.out.print(" "+y+" ");
			}
			}
			if (i<4)
			{
				sp--;
				sp1+=2;
				y++;
			}
			else
			{
				sp++;
				sp1-=2;
				y--;
			}
			
			System.out.println();
		}
		
	}
}
