/*
class AtoZexceptvowels 
{
	public static void main(String[] args) 
	{
		for (char i = 'A';i<='Z' ; i++ )
		{
			if (i =='A' || i =='E' || i=='I' || i=='O' || i=='U')
			{
				continue;
			}
			System.out.println(i);
		}
		
	}
}

*/

class AtoZexceptvowels 
{
	public static void main(String[] args) 
	{
		for (char i = 'A';i<='Z' ; i++ )
		{
			if (i !='A' && i !='E' && i!='I' && i!='O' && i!='U')
			{
				System.out.println(i);
			}
			
		}
		
	}
}

/*
class AtoZexceptvowels 
{
	public static void main(String[] args) 
	{
		char i ='A';
		while (i<'Z')
		{
			i++;

			if (i =='A' || i =='E' || i=='I' || i=='O' || i=='U')
			{
				continue;
			}
			System.out.println(i);
		}
		
	}
}

*/

/*
class AtoZexceptvowels 
{
	public static void main(String[] args) 
	{
		char i ='A';
		while (i<='Z')
		{
			

			if (i =='A' || i =='E' || i=='I' || i=='O' || i=='U')
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	}
}
*/