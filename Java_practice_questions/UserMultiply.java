import java.util.Scanner;
class UserMultiply 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = scan.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = scan.nextInt();
		System.out.println("Enter 3rd number: ");
		int n3 = scan.nextInt();

		System.out.println("Multiplication of "+ n1 +", "+ n2 +", "+ n3+ "is: " + (n1*n2*n3));
		System.out.println("Sum of "+ n1 +", "+ n2 +", "+ n3+ "is: " + (n1+n2+n3));
	}
}
