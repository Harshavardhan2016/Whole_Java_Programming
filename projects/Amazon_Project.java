import java.util.Scanner;
class Amazon_Project 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("WELCOME TO AMAZON");
		System.out.println("*******************");
		System.out.println("ENTER THE DETAILS FOR REGISTRATION \n");
		System.out.println("ENTER THE NAME");
		String name = scan.next();
		System.out.println();
        System.out.println("ENTER THE MOBILE NUMBER");
		long mobile = scan.nextLong();
		System.out.println();
        System.out.println("ENTER THE EMAIL-ID");
		String mail = scan.next();
		System.out.println();
		System.out.println("ENTER THE USER NAME");
		String uname = scan.next();
		System.out.println();
		System.out.println("ENTER THE PASSWORD");
		String psw = scan.next();
		System.out.println("*********************");
		System.out.println("ENTER 1 FOR REGISTER AND 2 TO CANCEL");
		System.out.println("*******************");
		int a = scan.nextInt();
		if (a==1)
		{
		  System.out.println("*******************");
		  System.out.println("THANK YOU FOR REGISTRATION (SUCCESSFUL)");
		  System.out.println();
		  System.out.println("ENTER 1 FOR LOGIN OR 2 FOR EXIT");
		  System.out.println();
		  int b = scan.nextInt();
		  if (b==1)
		  {
			  System.out.println("ENTER THE USER NAME: ");
			  String uname1 = scan.next();
			  System.out.println();
			  System.out.println("ENTER THE PASSWORD");
			  String psw1 = scan.next();
			  if (uname1.equals(uname) && psw1.equals(psw))
			  {
				  System.out.println("*******************");
				  System.out.println("LOGIN SUCCESFULL");
				  System.out.println("*******************");
				  System.out.println("ENTER 1 FOR SHOPPING");
				  System.out.println("ENTER 2 FOR ELECTRONICS");
				  System.out.println("ENTER 3 FOR GROCERIES");
				  int c = scan.nextInt();
				  switch (c)
				  {
				  case 1 :{
                           System.out.println("THANK YOU FOR CHOOSING SHOPPING");
						   System.out.println("*****************************");
						   System.out.println("ENTER 1 FOR MEN SECTION...");
						   System.out.println("ENTER 2 FOR WOMEN'S SECTION...");
						   System.out.println("ENTER 3 FOR KIDS SECTION...");
						   System.out.println("*****************************");
						   int d = scan.nextInt();
						   switch (d)
						   {
						   case 1 : System.out.println("...WELCOME TO MENS SECTION...");break;
						   case 2 : System.out.println("...WELCOME TO WOMENS SECTION...");break;
						   case 3 : System.out.println("...WELCOME TO KIDS SECTION...");break;
						   default : System.out.println("SORRY..! SECTION IS NOT AVAILABLE");
						   }
						   }
						   break;
				           case 2 : System.out.println("THANK YOU FOR CHOOSING ELECTRONICS...");break;
						   case 3 : System.out.println("THANK YOU FOR CHOOSING GROCERIES...");break;
						   default : System.out.println("SORRY..! CHOOSE THE SECTION WHICH ARE AVAILABLE...");
				  }
			  }
                  
				else   {
					     System.out.println("*******************");
						 System.out.println("INVALID USER NAME OR PASSWORD");
						 System.out.println("*********************");
			           }

		  }
			  else if (b==2)
			  {
				  System.out.println(uname+" Thank you VISIT AGAIN  :) " + (char)3);

			  }
			  else
			    {
				  System.out.println("SORRY...!INVALID INPUT");

			  }
			  }
			  else if (a==2)
			  {
				  System.out.println("VALUES ARE CANCELLED...");

			  }
			  else
				{
				  System.out.println("SORRY...! INVALID INPUT");

			    }
    }
}
