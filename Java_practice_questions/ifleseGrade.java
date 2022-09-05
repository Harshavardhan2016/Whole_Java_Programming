import java.util.Scanner;
class ifleseGrade 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your grade to see your results: ");
		char grade = s.next().charAt(0);
		if (grade == 'A')
		{
			System.out.println("First Rank");
		}
		else if (grade =='B')
		{
			System.out.println("Second Rank");
		}
		else if (grade=='C')
		{
			System.out.println("1st Class");
		}
		else if (grade =='D')
		{
			System.out.println("2nd Class");
		}
		else if (grade =='E')
		{
			System.out.println("Just Pass");
		}
		else if (grade=='F')
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Enter the Valid Input");
		}
		
	}
}
