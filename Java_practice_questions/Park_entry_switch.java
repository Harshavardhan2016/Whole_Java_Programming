/*import java.util.Scanner;
class Park_entry_switch 
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
		System.out.println("------------------------------------------");
		System.out.println("Enter your Gender: ");
		
		char gender = s.next().charAt(0);
		switch(gender)
		{
		case 'M' :case 'm' : System.out.println("You have to pay 100 rupees \n");
		break;

		case 'F' : case 'f' :System.out.println("You have to pay 80 rupees \n");
		break;

		case 'C' : case 'c' :System.out.println("You have to pay 5 rupees \n");
		break;

		case 'T' : case 't':System.out.println("You have to pay 20 rupees \n");
		break;

		case 'S' : case 's':System.out.println("You have to pay 0 rupees \n");
		break;
		
		default: System.out.println("Enter valid Input");
		}
		
	}
} 
*/


// for string 
// gender.equals("M") || gender.equals("m")   rather use .equals than == 


import java.util.Scanner;
class Park_entry_switch 
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
		System.out.println("------------------------------------------");
		System.out.println("Enter your Gender: ");
		
		String gender = s.next();
		switch(gender)
		{
		case "Male" :case "m" : System.out.println("You have to pay 100 rupees \n");
		break;

		case "Female" : case "f" :System.out.println("You have to pay 80 rupees \n");
		break;

		case "Child" : case "c" :System.out.println("You have to pay 5 rupees \n");
		break;

		case "Trans" : case "t":System.out.println("You have to pay 20 rupees \n");
		break;

		case "Senior" : case "s":System.out.println("You have to pay 0 rupees \n");
		break;
		
		default: System.out.println("Enter valid Input");
		}
		
	}
} 
