import java.util.Scanner;
class Simple_Calculator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("WELCOME TO SIMPLE CALCULATER");
		System.out.println("============================");
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for substraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division(Quotint)");
		System.out.println("Enter 5 for division(remainder)");
	    System.out.println("Enter 6 For Factors of given number )");
		System.out.println("Enter 7 For Factorial of given number)");
		System.out.println("Enter 8 for to check number even or odd)");
		System.out.println("Enter 9 for to Check sum of the digits)");
		System.out.println("Enter 10 for to Check product of the digits)");
        System.out.println("Enter 11 for to find Prime Number or Not)");
		System.out.println("Enter 12 for to find First 100 prime numbers )");
		System.out.println("Enter 13 for to find Nth prime number)");
		System.out.println("Enter 14 for to find Exponensial value  )");
		System.out.println("Enter 15 For to Check Palindrome or not)");
		System.out.println("Enter 16 For to find Strong number or  not)");
		System.out.println("Enter 17 For to find Armstrong number or not)");
		System.out.println("Enter 18 For to find First 100 Armstrong numbers)");
		System.out.println("Enter 19 for to check Spy number or not)");
		System.out.println("Enter 20 For to Find 1 to 100 Spy numbers)");
		System.out.println("Enter 21 For to Find Perfect number or not)");
		System.out.println("Enter 22 For to find Fiboncci series in given terms)");
		System.out.println("Enter 23 For to Find Avarage of given N numbers)");
		System.out.println("===============================");
		System.out.println("ENTER YOUR CHOICE");
		int z = scan.nextInt();
		switch (z)
		{
		case 1: {
 	              System.out.println("ENTER THE FIRST NUMBER");
                  int n1=scan.nextInt();
                  System.out.println("ENTER THE FIRST NUMBER");
				  int n2=scan.nextInt();
			      System.out.println("Sum of "+n1+" and "+n2+"is :"+(n1+n2));
		        }
		break;
		case 2: {
 	              System.out.println("ENTER THE FIRST NUMBER");
                  int n1=scan.nextInt();
                  System.out.println("ENTER THE FIRST NUMBER");
				  int n2=scan.nextInt();
			      System.out.println("Sum of "+n1+" and "+n2+"is :"+(n1-n2));
		        }
		break;
        case 3: {
 	              System.out.println("ENTER THE FIRST NUMBER");
                  int n1=scan.nextInt();
                  System.out.println("ENTER THE FIRST NUMBER");
				  int n2=scan.nextInt();
			      System.out.println("Sum of "+n1+" and "+n2+"is :"+(n1*n2));
		        }
		break;
        case 4: {
 	              System.out.println("ENTER THE FIRST NUMBER");
                  int n1=scan.nextInt();
                  System.out.println("ENTER THE FIRST NUMBER");
				  int n2=scan.nextInt();
			      System.out.println("Sum of "+n1+" and "+n2+"is :"+(n1/n2));
		        }
		break;
        case 5: {
 	              System.out.println("ENTER THE FIRST NUMBER");
                  int n1=scan.nextInt();
                  System.out.println("ENTER THE FIRST NUMBER");
				  int n2=scan.nextInt();
			      System.out.println("Sum of "+n1+" and "+n2+"is :"+(n1%n2));
		        }
		break;
        case 6: {
			      System.out.println("ENTER THE NUMBER");
				  int num = scan.nextInt();
				  for (int i=1;i<=num ;i++ )
					{
					 if (num%i==0)
					 {
						System.out.println(i);
					 }
				    }
		        }
		break;
        case 7: {
			      System.out.println("ENTER THE NUMBER");
				  int num = scan.nextInt();
				  int factorial=1;
				  for (int i=1;i<=num ;i++ )
					{
					 factorial=factorial*i;
				    }
					 System.out.println("Factorial of "+num+"is :"+factorial);
		        }
		break;
        case 8: {
			      System.out.println("enter number");
		          int num = scan.nextInt();
				  if (num%2==0)
			       {
				      System.out.println("enter number "+num+" is even");
			       }
			     else
			       {
				      System.out.println("enter number "+num+" is odd");
			       }
		        }
		break;
        case 9: {
			      System.out.println("ENTER THE NUMBER");
				  int num = scan.nextInt();
				  int sum=0;
				  int ld=0;
				  while (num!=0)
				  {
					  ld=num%10;
					  sum=sum+ld;
					  num=num/10;
				  }
				  System.out.println("SUM OF THE GIVEN NUMBER DIGIT IS :"+sum);
		        }
		break;
		case 10: {
			      System.out.println("ENTER THE NUMBER");
				  int num = scan.nextInt();
				  int product=1;
				  int ld=0;
				  while (num!=0)
				  {
					  ld=num%10;
					  product=product*ld;
					  num=num/10;
				  }
				  System.out.println("PRODUCT OF THE GIVEN NUMBER DIGIT IS :"+product);
		        }
		break;
		case 11: {
			      System.out.println("ENTER THE NUMBER");
				  int num = scan.nextInt();
				  int count=0;
				  for (int i=1;i<=num ;i++ )
				  {
					  if (num%i==0)
					  {
						  count++;
					  }
				  }
					if (count==2)
					{
						System.out.println(num+ ":ENTER NUMBER IS PRIME");
					}
					else
					{
                        System.out.println(num+ ": ENTER NUMBER IS NOT PRIME");
					}
				  
		        }
		break;
		case 12: {
			      System.out.println("ENTER THE NUMBER");
		          int num = scan.nextInt();
		          System.out.println("=================");

		           int x=2;
		           int prime=1;
		           while (prime<=num)
		           {
			         int count=0;
			         for (int i=1;i<=x ;i++ )
			         {
				      if (x%i==0)
				      {
				 	   count++;
			          }
			        }
			      if (count==2)
			      {
				
			       System.out.println(x);
			       prime++;
			      }
			      x++;

		        }
		        }
		
         break;
		case 13: {
			          System.out.print("Enter the number: ");
                      int num = scan.nextInt(); 
	                  int prime=1;
	                  int x=2;
	                  while (prime<=num)
	                  {
		                int count=0;
		                for (int i=1;i<=x;i++ )
		                {
			             if (x%i==0)
			            {
			            	count++;
			            }
		              }
	                 if (count==2)
		             {
			          if (prime==num)
			           {
                         System.out.println(x);	
					   }
			           prime++;
                     }
		            x++;
                   }
		        }
	    break;
		case 14: {
			       System.out.println("ENTER THE BASE VALUE");
				   int base = scan.nextInt();
				   System.out.println("ENTER THE POWER VALUE");
				   int power = scan.nextInt();
				   int exp = 1;
				   for (int i=1;i<=power ;i++ )
				   {
					   exp=exp*base;
				   }
                    System.out.println(exp);
		        }
		break;
		case 15: {
			       System.out.println("ENTER THE NUMBER");
				   int num= scan.nextInt();
				   int temp=num;
				   int reverse=0;
				   int ld=0;
				   while (num!=0)
				   {
					   ld=num%10;
					   reverse=reverse*10+ld;
					   num=num/10;
				   }
                    System.out.println(reverse);
					if (temp==reverse)
					{
						System.out.println("given number is palindrome");
					}
					else
			        {
						System.out.println("given number is not a palindrome");
					}
		         }
		break;
		case 16: {
			      System.out.println("ENTER THE NUMBER");
				  int num = scan.nextInt();
				  int temp=num;
				  int sum=0;
				  int ld=0;
				  while (num!=0)
				  {
					  ld=num%10;
					  int factorial=1;
					  for (int i=1;i<=ld ;i++ )
					  {
						  factorial=factorial*i;
						  
					  }
					  sum=sum+factorial;
					  num=num/10;
				  }
				  if (temp==sum)
				  {
					  System.out.println(" GIVEN NUMBER IS STRONG NUMBER");
				  }
				  else
			       {
                      System.out.println(" GIVEN NUMBER IS not a STRONG NUMBER");
				   }
		         }
		break;
		case 17: {
			      System.out.println("ENTER THE NUMBER");
				  int num = scan.nextInt();
				  int temp=num;
				  int sum=0;
				  int ld=0;
				  while (num!=0)
				  {
					  ld=num%10;
					  int factorial=1;
					  for (int i=1;i<=ld ;i++ )
					  {
						  factorial=factorial*i;
						  sum=sum+factorial;
					  }
					  num=num/10;
				  }
				  if (temp==sum)
				  {
					  System.out.println(" GIVEN NUMBER IS ARMSTRONG NUMBER");
				  }
				  else
			       {
                      System.out.println(" GIVEN NUMBER IS NOT A ARMSTRONG NUMBER");
				   }
		         }
		break;
		case 18: {
			      System.out.println("ENTER THE NUMBER");
		          int num = scan.nextInt();
		          int x=1;
		          int arm=1;
		          while (arm<=num)
		           {
			        int t = x;
			        int count =0;
			        while (x!=0)
			        {
			        	count++;
				        x=x/10;
			        }
			        x=t;
			        int sum=0;
			        while (x!=0)
			       {
				
				    int ld = x%10;
				    int exp=1;
			      for (int i=1;i<=count ;i++ )
			     {
				    exp=exp*ld;
			       }
			       sum = sum+exp;
			       x=x/10;
			     }
			       x=t;
			    if (x== sum)
			     {
				    System.out.println(x);
				    arm++;
			     }
			    x++;
			
		        }
		       }
	    break;
		case 19: {
			     System.out.println("ENTER THE NUMBER");
		         int num = scan.nextInt();
 		         int sum=0;
		         int temp=num;
		         int product=0;
		         int ld=1;
		         while (num!=0)
		         {
			       ld=num%10;
			        sum=sum+ld;
			       product=product*ld;
			       num=num/10;
		         }
		          if (sum==product)
		          {
			       System.out.println("spy number");
		           }
		        else
		          {
		          System.out.println("not a spy number");
		           }
		       }
		break;
		case 20: {
			      System.out.println("ENTR THE NUMBER");
		          int num = scan.nextInt();
		          int x=1;
		           int spy=1;
		          while (spy<=num)
		           {
			        int temp=x;
			        int sum=0;
			        int product=1;
			        while (x!=0)
			         {
				      int ld=x%10;
				      sum=sum+ld;
				       product=product*ld;
				       x=x/10;
			          }
			         x=temp;
			        if (sum==product)
			        {
				      System.out.println(x);
				     spy++;
			        }
			       x++;
		           }
		        }
		break;
		case 21: {
			      System.out.println("ENTER THE NUMBER");
		          int num=scan.nextInt();
		          int temp=num;
		          int sum=0;
		         for (int i=1;i<num ;i++ )
		         {
			      if (num%i==0)
			      {
				   sum=sum+i;
			      }
		         }
		         if (sum==num)
	
	             {
		          System.out.println(temp+"perfect number");
	             }
	            else
	            {
		         System.out.println(temp+"not a perfect number");

	            }
		        }
		break;
		case 22:{
			      System.out.println("ENTER THE NUMBER");
		          int num = scan.nextInt();
		          int a=0;
		          int b=1;
		          int c=0;
		          for (int i=1;i<=num ;i++ )
		           {
			        System.out.println(c);
			        a=b;
			        b=c;
			        c=a+b;
   
		           }
		        }
		
		break;
		case 23:{
			     System.out.println("ENTER THE Value");
		         int x = scan.nextInt();
		         int sum=0;
		         for (int i=1;i<=x ;i++ )
		          {
			        System.out.println("enter the number :"+i);
			        int num = scan.nextInt();
			        sum = sum+num;
		          }
		          System.out.println(sum/x);

		        }
		
		}
		
		    
	}   
}