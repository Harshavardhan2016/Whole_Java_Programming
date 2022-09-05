import java.util.Scanner;
class Iasage
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age to check Qualification: ");
		int age = s.nextInt();
		if ((age >=21) && (age <33))
		{
		System.out.println("Age "+age+" is Eligible");
		}
		else
		{
			System.out.println("Age "+age+" is Not elligible");
		}
		System.out.println("Hello World!");
	}
}
