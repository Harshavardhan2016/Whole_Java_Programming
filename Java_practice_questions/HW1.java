import java.util.Scanner;
class HW1 
{
	public static void main(String[] args) 
	{
		// Average of 4 numbers


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		int a = scan.nextInt();
		System.out.println("Enter number 2:");
		int b = scan.nextInt();
		System.out.println("Enter number 3:");
		int c = scan.nextInt();
		System.out.println("Enter number 4:");
		int d = scan.nextInt();
		System.out.println("Average of 4 numbers "+ a+", " + b+", "  +c+", " +d +"is: "+((a+b+c+d)/4.0));   //  or (float)4


		// Sum of 5 Numbers

		

		System.out.println("Enter number 1:");
		int a = scan.nextInt();
		System.out.println("Enter number 2:");
		int b = scan.nextInt();
		System.out.println("Enter number 3:");
		int c = scan.nextInt();
		System.out.println("Enter number 4:");
		int d = scan.nextInt();
		System.out.println("Enter number 5:");
		int e = scan.nextInt();
		System.out.println("Average of 4 numbers --> "+ a+", " + b+", "  +c+", " +d +", "+e+", "+"is: "+((a+b+c+d+e)));



	}
}
