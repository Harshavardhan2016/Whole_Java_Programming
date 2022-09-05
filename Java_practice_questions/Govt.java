/*import java.util.Scanner;
class Govt 
{
	public static void main(String[] args) 
	{
		System.out.println("1. Worked in Indian Army");
		System.out.println("2. Not From Army");
		System.out.println();
		System.out.println("Choose Between 1 and 2 ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		if (i == 1 || i==2)
		{
			if (i==1)
			{
				System.out.println("Enter Service period: ");
				int serve = s.nextInt();
				if (serve >=2)
				{
					System.out.println("selected for job");
				}
				else{
				System.out.println("You need to write exam");
				}
			}
			else{
				System.out.println("Enter 12th percentage: ");
			double twelve = s.nextDouble();
			if (twelve > 90)
			{
				System.out.println("Job offered");
			}
			else{
			System.out.println("You need to attend exam");
			}
			}
		}
		else{
		System.out.println("Try again");
		}
	}
} */


import java.util.Scanner;
class Govt 
{
	public static void main(String[] args) 
	{
		System.out.println("Worked in Indian Army or not ");
		System.out.println("Enter true if yes,  else enter false");
		System.out.println();
		System.out.println("true or false");
		Scanner s = new Scanner(System.in);
		boolean b = s.nextBoolean();
		if (b)
		{
				System.out.println("Enter Service period: ");
				int serve = s.nextInt();
				if (serve >=2)
				{
					System.out.println("selected for job");
				}
				else{
				System.out.println("You need to write exam");
				}
		}
		else{
				System.out.println("Enter 12th percentage: ");
			double twelve = s.nextDouble();
			if (twelve > 90)
			{
				System.out.println("Job offered");
			}
			else{
			System.out.println("You need to attend exam");
			}
			}
	}
}



