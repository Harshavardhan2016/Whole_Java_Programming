/*import java.util.Scanner;
class SimpleCalculator
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("****************Welcome to Simple calculator****************");
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division(quotient)");
		System.out.println("Enter 5 for division(reminder)");
		System.out.println("Enter 6 to check whether number is even or odd");
		System.out.println();
	    System.out.println("Enter Your choice from above...");

		int choice = s.nextInt();

		switch (choice)
		{
		case 1:
		{
			System.out.println("You have choosen Addition of two numbers");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Addition of " + n1 + " and " +n2+ " it is "+ (n1+n2));

		}
		break;
		case 2:
		{
			System.out.println("You have choosen Subtraction of two numbers");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Subtraction of " + n1 + " and " +n2+ " it is "+ (n1-n2));

		}
		break;
		case 3:
		{
			System.out.println("You have choosen Multiplication of two numbers");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Multiplication of " + n1 + " and " +n2+ " it is "+ (n1*n2));

		}
		break;
		case 4:
		{
			System.out.println("You have choosen Division of two numbers to get quotient");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Division of " + n1 + " and " +n2+ " it is "+ (n1/(double)n2));

		}
		break;
		case 5:
		{
			System.out.println("You have choosen Division of two numbers to get reminder");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Addition of " + n1 + " and " +n2+ " it is "+ (n1%n2));

		}
		break;
		case 6:
		{
			System.out.println("You have choosen to check whether number is odd or even");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			if (n1%2==0)
			{
				System.out.println("The given number "+ n1 +" is Even Number");
			}
			else
			{
				System.out.println("The given number "+ n1 +" is Odd Number");
			}

		}		
		}

	}
}
*/


/////

import java.util.Scanner;
class SimpleCalculator
{
	public static void main(String[] args) 
	{
		int xc =1;
		while (xc !=2)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("****************Welcome to Simple calculator****************");
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division(quotient)");
		System.out.println("Enter 5 for division(reminder)");
		System.out.println("Enter 6 to check whether number is even or odd");
		System.out.println();
	    System.out.println("Enter Your choice from above...");

		int choice = s.nextInt();

		switch (choice)
		{
		case 1:
		{
			System.out.println("You have choosen Addition of two numbers");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Addition of " + n1 + " and " +n2+ " it is "+ (n1+n2));

		}
		break;
		case 2:
		{
			System.out.println("You have choosen Subtraction of two numbers");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Subtraction of " + n1 + " and " +n2+ " it is "+ (n1-n2));

		}
		break;
		case 3:
		{
			System.out.println("You have choosen Multiplication of two numbers");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Multiplication of " + n1 + " and " +n2+ " it is "+ (n1*n2));

		}
		break;
		case 4:
		{
			System.out.println("You have choosen Division of two numbers to get quotient");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Division of " + n1 + " and " +n2+ " it is "+ (n1/(double)n2));

		}
		break;
		case 5:
		{
			System.out.println("You have choosen Division of two numbers to get reminder");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int n2 = s.nextInt();
			System.out.println("So your output after calculating, Addition of " + n1 + " and " +n2+ " it is "+ (n1%n2));

		}
		break;
		case 6:
		{
			System.out.println("You have choosen to check whether number is odd or even");
			System.out.println();
			System.out.println("Enter one number");
			int n1 = s.nextInt();
			switch (n1%2)
			{
			case 0: System.out.println("The given number "+ n1 +" is Even Number");
			break;
			case 1: System.out.println("The given number "+ n1 +" is Odd Number");
			}


		}
		break;

		}

		xc = s.nextInt();
	}

	}
}
