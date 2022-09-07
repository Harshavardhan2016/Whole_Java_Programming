import java.util.Scanner;
class Evenodd_switch 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer below:");
		int i = s.nextInt();

		switch(i%2)
		{
		case 0: System.out.println("Even");
		break;
		case 1: System.out.println("Odd");
		}
		
	}
}

