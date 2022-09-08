import java.util.Scanner;
class ArlaTourists 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to ARLA Tourist Travels");
		System.out.println("Choose your car from below instructions: ");
		System.out.println("Choose 1 for mini car");
		System.out.println("Choose 2 for XUV");
		System.out.println("Choose 3 for Travellers");
		System.out.println("Choose 4 for bus");
		System.out.println("Choose 5 for train");
		System.out.println("Choose 6 for Plane");

		int n = s.nextInt();
		if (n==1)
		{
			System.out.println("You have choosen mini car");
			System.out.println("Enter number of persons: ");
			int persons = s.nextInt();
			if (persons >=1 && persons<=5)
			{
				System.out.println("Since your " + persons+ " in number" + " the amount you have to pay is " + (2000*persons));
				System.out.println("After discount ");
				if (persons == 1)
				{
					System.out.println("You have to pay 2000 rupees");
				}
				else if (persons==2)
				{
					System.out.println("of 10% You have to pay " + (2000*persons-(2000*persons*10/100)) +" rupees");
				}
				else if (persons==3)
				{
					System.out.println("of 20% You have to pay " + (2000*persons-(2000*persons*20/100)) +" rupees");
				}
				else if (persons==4)
				{
					System.out.println("of 30% You have to pay " + (2000*persons-(2000*persons*30/100)) +" rupees");
				}
				else if (persons==5)
				{
					System.out.println("of 40% You have to pay " + (2000*persons-(2000*persons*40/100)) +" rupees");
				}
				
			}
			else
			{
				System.out.println("You exceeded limit");
			}
		}
		else if (n==2)
		{
			System.out.println("You have choosen XUV");
			System.out.println("Enter number of persons: ");
			int persons = s.nextInt();
			if (persons >=1 && persons<=5)
			{
				System.out.println("Since your " + persons+ " in number" + " the amount you have to pay is " + (2200*persons));
				System.out.println("After discount ");
				if (persons == 1)
				{
					System.out.println("You have to pay 2200 rupees");
				}
				else if (persons==2)
				{
					System.out.println("of 10% You have to pay " + (2200*persons-(2200*persons*10/100)) +" rupees");
				}
				else if (persons==3)
				{
					System.out.println("of 20% You have to pay " + (2200*persons-(2200*persons*20/100)) +" rupees");
				}
				else if (persons==4)
				{
					System.out.println("of 30% You have to pay " + (2200*persons-(2200*persons*30/100)) +" rupees");
				}
				else if (persons==5)
				{
					System.out.println("of 40% You have to pay " + (2200*persons-(2200*persons*40/100)) +" rupees");
				}
				
			}
			else
			{
				System.out.println("You exceeded limit");
			}
		}
		else if (n==3)
		{
			System.out.println("You have choosen Travells");
			System.out.println("Enter number of persons: ");
			int persons = s.nextInt();
			if (persons >=1 && persons<=5)
			{
				System.out.println("Since your " + persons+ " in number" + " the amount you have to pay is " + (1500*persons));
				System.out.println("After discount ");
				if (persons == 1)
				{
					System.out.println("You have to pay 1500 rupees");
				}
				else if (persons==2)
				{
					System.out.println("of 10% You have to pay " + (1500*persons-(1500*persons*10/100)) +" rupees");
				}
				else if (persons==3)
				{
					System.out.println("of 20% You have to pay " + (1500*persons-(1500*persons*20/100)) +" rupees");
				}
				else if (persons==4)
				{
					System.out.println("of 30% You have to pay " + (1500*persons-(1500*persons*30/100)) +" rupees");
				}
				else if (persons==5)
				{
					System.out.println("of 40% You have to pay " + (1500*persons-(1500*persons*40/100)) +" rupees");
				}
				
			}
			else
			{
				System.out.println("You exceeded limit");
			}
		}
		else if (n==4)
		{
			System.out.println("You have choosen bus");
			System.out.println("Enter number of persons: ");
			int persons = s.nextInt();
			if (persons >=1 && persons<=5)
			{
				System.out.println("Since your " + persons+ " in number" + " the amount you have to pay is " + (1400*persons));
				System.out.println("After discount ");
				if (persons == 1)
				{
					System.out.println("You have to pay 1400 rupees");
				}
				else if (persons==2)
				{
					System.out.println("of 10% You have to pay " + (1400*persons-(1400*persons*10/100)) +" rupees");
				}
				else if (persons==3)
				{
					System.out.println("of 20% You have to pay " + (1400*persons-(1400*persons*20/100)) +" rupees");
				}
				else if (persons==4)
				{
					System.out.println("of 30% You have to pay " + (1400*persons-(1400*persons*30/100)) +" rupees");
				}
				else if (persons==5)
				{
					System.out.println("of 40% You have to pay " + (1400*persons-(1400*persons*40/100)) +" rupees");
				}
				
			}
			else
			{
				System.out.println("You exceeded limit");
			}
		}
		else if (n==5)
		{
			System.out.println("You have choosen train");
			System.out.println("Enter number of persons: ");
			int persons = s.nextInt();
			if (persons >=1 && persons<=5)
			{
				System.out.println("Since your " + persons+ " in number" + " the amount you have to pay is " + (1200*persons));
				System.out.println("After discount ");
				if (persons == 1)
				{
					System.out.println("You have to pay 1200 rupees");
				}
				else if (persons==2)
				{
					System.out.println("of 10% You have to pay " + (1200*persons-(1200*persons*10/100)) +" rupees");
				}
				else if (persons==3)
				{
					System.out.println("of 20% You have to pay " + (1200*persons-(1200*persons*20/100)) +" rupees");
				}
				else if (persons==4)
				{
					System.out.println("of 30% You have to pay " + (1200*persons-(1200*persons*30/100)) +" rupees");
				}
				else if (persons==5)
				{
					System.out.println("of 40% You have to pay " + (1200*persons-(1200*persons*40/100)) +" rupees");
				}
				
			}
			else
			{
				System.out.println("You exceeded limit");
			}
		}
		else if (n==6)
		{
			System.out.println("You have choosen plane");
			System.out.println("Enter number of persons: ");
			int persons = s.nextInt();
			if (persons >=1 && persons<=5)
			{
				System.out.println("Since your " + persons+ " in number" + " the amount you have to pay is " + (8000*persons));
				System.out.println("After discount ");
				if (persons == 1)
				{
					System.out.println("You have to pay 8000 rupees");
				}
				else if (persons==2)
				{
					System.out.println("of 10% You have to pay " + (8000*persons-(8000*persons*10/100)) +" rupees");
				}
				else if (persons==3)
				{
					System.out.println("of 20% You have to pay " + (8000*persons-(8000*persons*20/100)) +" rupees");
				}
				else if (persons==4)
				{
					System.out.println("of 30% You have to pay " + (8000*persons-(8000*persons*30/100)) +" rupees");
				}
				else if (persons==5)
				{
					System.out.println("of 40% You have to pay " + (8000*persons-(8000*persons*40/100)) +" rupees");
				}
				
			}
			else
			{
				System.out.println("You exceeded limit");
			}
		}
		else
		{
		 System.out.println("Choose valid input as shown above");
		}

	}
}
