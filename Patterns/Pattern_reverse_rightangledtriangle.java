/*
*
**
* *
*  *
*****


class Pattern_reverse_rightangledtriangle 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=5 ;i++ )
		{
			for (int j =1;j<=5 ;j++ )
			{
				if (i==5||j==1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

*/

/*

*****
 *  *
  * *
   **
    *

class Pattern_reverse_rightangledtriangle 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=5 ;i++ )
		{
			for (int j =1;j<=5 ;j++ )
			{
				if (i==1||j==5||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

*/

//----------------------------------------------------------------------

/*
    *
   **
  * *
 *  *
*****

class Pattern_reverse_rightangledtriangle 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=5 ;i++ )
		{
			for (int j =1;j<=5 ;j++ )
			{
				if (i==5||j==5||i+j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

*/

/*

*****
*  *
* *
**
*

class Pattern_reverse_rightangledtriangle 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=5 ;i++ )
		{
			for (int j =1;j<=5 ;j++ )
			{
				if (i==1||j==1||i+j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

*/

class Pattern_reverse_rightangledtriangle 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=7 ;i++ )
		{
			for (int j =1;j<=7 ;j++ )
			{
				if (i==1||j==1||i==7||j==7)
				{
					System.out.print(" * ");
				}
				else if (i==3)
				{
					System.out.print(" "+(char)3 +" ");
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

