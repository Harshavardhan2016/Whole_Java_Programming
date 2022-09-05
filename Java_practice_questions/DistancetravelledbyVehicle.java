import java.util.Scanner;
class DistancetravelledbyVehicle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter speed of vehicle in km/hr: ");
		double speed = s.nextDouble();
		System.out.println("Enter duration of travelling in hours: ");
		double time = s.nextDouble();
		System.out.println("Distance travelled by vehicle with Speed "+speed+"km/hr "+"and time "+time+"hr is: "+(speed*time) + "km");
	}
}