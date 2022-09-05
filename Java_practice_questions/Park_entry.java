import java.util.Scanner;
class Park_entry 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Choose gender according to below instructions");
		System.out.println("Male           :   M");
		System.out.println("Female         :   F");
		System.out.println("Children       :   C");
		System.out.println("TransGender    :   T");
		System.out.println("SeniorCitizen  :   S");
		System.out.println();
		System.out.println("Enter your Gender: ");
		char gender = s.next().charAt(0);
		if (gender == 'M' || gender == 'm')
		{
			System.out.println("You have to pay 100 rupees \n");
		}
		else if (gender =='F' || gender == 'f')
		{
			System.out.println("You have to pay 80 rupees \n");
		}
		else if (gender=='C' || gender == 'c')
		{
			System.out.println("You have to pay 5 rupees \n");
		}
		else if (gender =='T' || gender == 't')
		{
			System.out.println("You have to pay 20 rupees \n");
		}
		else if (gender =='S' || gender == 's')
		{
			System.out.println("Free for you \n");
		}
		else
		{
			System.out.println("Enter the Valid Input \n");
		}
		
	}
} 


// for string 



// gender.equals("M") || gender.equals("m")   rather use .equals than == 