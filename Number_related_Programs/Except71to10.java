/*class Except71to10
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=10; i++ )
		{
			if (i!=7)
			{
				System.out.println(i);
			}
			
		}
		
	}
}
*/

/*
class Except71to10
{
	public static void main(String[] args) 
	{
		int i = 1;
		while (i<=10)
		{
			if (i!=7)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}
}
*/

/*
class Except71to10
{
	public static void main(String[] args) 
	{
		int i = 1;
		do
		{
			if (i!=7)
			{
				System.out.println(i);
			}
			i++;
		}
		while (i<=10);
		
	}
}
*/


// while with continue 

/*
class Except71to10
{
	public static void main(String[] args) 
	{
		int i = 0;
		while (i<=9)
		{
			i++;
			if (i==7)
			{
			continue;
			}
			System.out.println(i);
		}
		
	}
}

*/

class Except71to10
{
	public static void main(String[] args) 
	{
		int i = 1;
		while (i<=10)
		{
			if (i==7)
			{
				i++;
				continue;
				
			}
			System.out.println(i);
			i++;
		}
		
	}
}

