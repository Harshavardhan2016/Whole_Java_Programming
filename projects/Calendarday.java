/*import java.util.Scanner;
class Calendarday 
{
	public static void main(String[] args) 
	{
		System.out.println("----------------------");
		System.out.println("|0| -----> |Monday   |");
		System.out.println("----------------------");
		System.out.println("|1| -----> |Tuesday  |");
		System.out.println("----------------------");
		System.out.println("|2| -----> |Wednesday|");
		System.out.println("----------------------");
		System.out.println("|3| -----> |Thursday |");
		System.out.println("----------------------");
		System.out.println("|4| -----> |Friday   |");
		System.out.println("----------------------");
		System.out.println("|5| -----> |Saturday |");
		System.out.println("----------------------");
		System.out.println("|6| -----> |Sunday   |");
		System.out.println("----------------------");
		
		System.out.println("----------------------");
		System.out.println();
		System.out.println("----------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("Choose a day corresponding number from above days table: ");


		int day = s.nextInt();

		switch (day)
		{
		case 0:{
			System.out.println("So, you have selected Monday");
			System.out.println("Enter a number of days to find the coming day ");
			int nd = s.nextInt();
			int d = nd % 7;
			//int op = d % 7;
			System.out.println("The day is " +(d+0)%7);
		}
		break;
		case 1:{
			System.out.println("So, you have selected Tuesday");
			System.out.println("Enter a number of days to find the coming day ");
			int nd = s.nextInt();
			int d = nd % 7;
			//int op = d % 7;
			System.out.println("The day is " +(d+1)%7);
		}
		break;
		case 2:{
			System.out.println("So, you have selected Wednesday");
			System.out.println("Enter a number of days to find the coming day ");
			int nd = s.nextInt();
			int d = nd % 7;
			//int op = d % 7;
			System.out.println("The day is " +(d+2)%7);
		}
		break;
		case 3:{
			System.out.println("So, you have selected Thursday");
			System.out.println("Enter a number of days to find the coming day ");
			int nd = s.nextInt();
			int d = nd % 7;
			//int op = d % 7;
			System.out.println("The day is " +(d+3)%7);
		}
		break;
		case 4:{
			System.out.println("So, you have selected Friday");
			System.out.println("Enter a number of days to find the coming day ");
			int nd = s.nextInt();
			int d = nd % 7;
			//int op = d % 7;
			System.out.println("The day is " +(d+4)%7);
		}
		break;
		case 5:{
			System.out.println("So, you have selected Saturday");
			System.out.println("Enter a number of days to find the coming day ");
			int nd = s.nextInt();
			int d = nd % 7;
			//int op = d % 7;
			System.out.println("The day is " +(d+5)%7);
		}
		break;
		case 6:{
			System.out.println("So, you have selected Sunday");
			System.out.println("Enter a number of days to find the coming day ");
			int nd = s.nextInt();
			int d = nd % 7;
			//int op = d % 7;
			System.out.println("The day is " +(d+6)%7);
		}
		break;
		}
	}
}
*/

import java.util.Scanner;
class Calendarday 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter day of week ");
		String day = s.next();
		switch (day)
		{
		case "Sunday":{
			 System.out.println("Enter no.of days to find the day of week");
			 int num = s.nextInt();
			 switch (num%7)
			 {
			 case 0: System.out.println("The day is Sunday");
			 break;
			 case 1: System.out.println("The day is Monday");
			 break;
			 case 2: System.out.println("The day is Tuesday");
			 break;
			 case 3: System.out.println("The day is Wednesday");
			 break;
			 case 4: System.out.println("The day is Thursday");
			 break;
			 case 5: System.out.println("The day is Friday");
			 break;
			 case 6: System.out.println("The day is Saturday");
			 
			 }
			 }
		break;
		case "Monday":{
			 System.out.println("Enter no.of days to find the day of week");
			 int num = s.nextInt();
			 switch (num%7)
			 {
			 case 6: System.out.println("The day is Sunday");
			 break;
			 case 0: System.out.println("The day is Monday");
			 break;
			 case 1: System.out.println("The day is Tuesday");
			 break;
			 case 2: System.out.println("The day is Wednesday");
			 break;
			 case 3: System.out.println("The day is Thursday");
			 break;
			 case 4: System.out.println("The day is Friday");
			 break;
			 case 5: System.out.println("The day is Saturday");
			 
			 }	
		}
		break;
		case "Tuesday":{
			System.out.println("Enter no.of days to find the day of week");
			 int num = s.nextInt();
			 switch (num%7)
			 {
			 case 5: System.out.println("The day is Sunday");
			 break;
			 case 6: System.out.println("The day is Monday");
			 break;
			 case 0: System.out.println("The day is Tuesday");
			 break;
			 case 1: System.out.println("The day is Wednesday");
			 break;
			 case 2: System.out.println("The day is Thursday");
			 break;
			 case 3: System.out.println("The day is Friday");
			 break;
			 case 4: System.out.println("The day is Saturday");
			 
			 }
		}
		break;
		case "Wednesday":{
			System.out.println("Enter no.of days to find the day of week");
			 int num = s.nextInt();
			 switch (num%7)
			 {
			 case 4: System.out.println("The day is Sunday");
			 break;
			 case 5: System.out.println("The day is Monday");
			 break;
			 case 6: System.out.println("The day is Tuesday");
			 break;
			 case 0: System.out.println("The day is Wednesday");
			 break;
			 case 1: System.out.println("The day is Thursday");
			 break;
			 case 2: System.out.println("The day is Friday");
			 break;
			 case 3: System.out.println("The day is Saturday");
			 
			 }
		}
		break;
		case "Thursday":{
			System.out.println("Enter no.of days to find the day of week");
			 int num = s.nextInt();
			 switch (num%7)
			 {
			 case 3: System.out.println("The day is Sunday");
			 break;
			 case 4: System.out.println("The day is Monday");
			 break;
			 case 5: System.out.println("The day is Tuesday");
			 break;
			 case 6: System.out.println("The day is Wednesday");
			 break;
			 case 0: System.out.println("The day is Thursday");
			 break;
			 case 1: System.out.println("The day is Friday");
			 break;
			 case 2: System.out.println("The day is Saturday");
			 
			 }
		}
		break;
		case "Friday":{
		System.out.println("Enter no.of days to find the day of week");
			 int num = s.nextInt();
			 switch (num%7)
			 {
			 case 2: System.out.println("The day is Sunday");
			 break;
			 case 3: System.out.println("The day is Monday");
			 break;
			 case 4: System.out.println("The day is Tuesday");
			 break;
			 case 5: System.out.println("The day is Wednesday");
			 break;
			 case 6: System.out.println("The day is Thursday");
			 break;
			 case 0: System.out.println("The day is Friday");
			 break;
			 case 1: System.out.println("The day is Saturday");
			 
			 }
		}
		break;
		case "Saturday":{
			System.out.println("Enter no.of days to find the day of week");
			 int num = s.nextInt();
			 switch (num%7)
			 {
			 case 1: System.out.println("The day is Sunday");
			 break;
			 case 2: System.out.println("The day is Monday");
			 break;
			 case 3: System.out.println("The day is Tuesday");
			 break;
			 case 4: System.out.println("The day is Wednesday");
			 break;
			 case 5: System.out.println("The day is Thursday");
			 break;
			 case 6: System.out.println("The day is Friday");
			 break;
			 case 0: System.out.println("The day is Saturday");
			 
			 }
		}
		break;
		default: System.out.println("Enter valid input");
		
		}
	}
}
