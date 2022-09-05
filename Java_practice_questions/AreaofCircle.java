import java.util.Scanner;
class AreaofCircle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		float pi = 3.14f;
		System.out.println("Enter radius of circle in cm: ");
		int a = s.nextInt();
		System.out.println("Area of circle is: "+(pi*a*a) + " cm^2");
		System.out.println("Area of circle is: "+((float)3.14*(a*a))+" cm^2");
		System.out.println("Area of circle is: "+(3.14*a*a)+" cm^2");

		double area = 3.14*a*a;
		System.out.println("Area of circle is: "+area+" cm^2");

	}
}

