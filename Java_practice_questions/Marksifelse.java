import java.util.Scanner;
class Marksifelse 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks from 0 till 100 : ");
		double marks = s.nextDouble();
		if (marks>=90 && marks <=100)
		{
			System.out.println("First Rank");
		}
		else if(marks>=80 && marks <=89)
		{
			System.out.println("Second Rank");
		}
		else if(marks>=70 && marks <=79)
		{
			System.out.println("1st Class");	
		}
		else if(marks>=50 && marks <=69)
		{
			System.out.println("2nd Class");
		}
		else if(marks>=35 && marks <=49)
		{
			System.out.println("Just Pass");
		}
		else if(marks>=0 && marks <=34)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Choose wisely...");
		}
	}
}

