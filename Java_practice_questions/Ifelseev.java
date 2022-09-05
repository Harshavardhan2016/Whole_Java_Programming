import java.util.Scanner;
class Ifelseev
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check Even or odd: ");
		int n = s.nextInt();

		if(n %2 ==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
		System.out.println("Number is odd");
		}
		
	}
}

0