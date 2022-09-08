import java.util.*;
class AreaCalculator 
{
	public static void main(String[] args) 
	{
		int n =1;
		while (n!=9)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("****  Welcome To Area Calculator ****");
		System.out.println();
		System.out.println("Enter 2 to find area of 2d shapes");
		System.out.println("Enter 3 to find area of 3d shapes");
		int dimensions = s.nextInt();

		switch (dimensions)
		{
		case 2:{
		
		System.out.println("You have choosen 2d shapes to find areas of respective polygon");
		System.out.println();

		System.out.println("Enter 1 to find area of square");
		System.out.println("Enter 2 to find area of reactangle");
		System.out.println("Enter 3 to find area of triangle");
		System.out.println("Enter 4 to find area of circle");
		System.out.println("Enter 5 to find area of parallelogram");
		System.out.println("Enter 6 to find area of Trapezium");
		System.out.println("Enter 7 to find area of Rhombus");
		System.out.println("Enter 8 to find area of Ellipse");

		// cube, cuboid, cylinder, cone, sphere --> volume

		int choice = s.nextInt();
		switch (choice)
		{
		case 1:
			{
			System.out.println("You have choosen to find area of square");
			System.out.println("Enter the side of square in meters");
			double side = s.nextDouble();
			System.out.println("Area of square having side "+side+ "m is " + (side*side));
		}
		break;
		case 2:
			{
			System.out.println("You have choosen to find area of rectangle");
			System.out.println("Enter the length of rectangle in meters");
			double length = s.nextDouble();
			System.out.println("Enter the breadth of rectangle in meters");
			double breadth = s.nextDouble();
			System.out.println("Area of rectangle having length "+length+ "m and breadth "+ breadth+ "m is " + (length*breadth));
		}
		break;
		case 3:
			{
			System.out.println("You have choosen to find area of Triangle");
			System.out.println("Enter the base of triangle in meters");
			double length = s.nextDouble();
			System.out.println("Enter the height of traingle in meters");
			double breadth = s.nextDouble();
			System.out.println("Area of rectangle having base "+length+ "m and height "+ breadth+ "m is " + 0.5*(length*breadth));
		}
		break;
		case 4:
			{
			System.out.println("You have choosen to find area of Circle");
			System.out.println("Enter the radius of circle");
			double length = s.nextDouble();
			System.out.println("Area of circle having radius "+length+ " is " + 3.14*(length*length));
		}
		break;
		case 5:
			{
			System.out.println("You have choosen to find area of Paralelogram");
			System.out.println("choose 1 to get area of paralellogram using base and height (b*h)");
			System.out.println("choose 2 to get area of paralellogram using trignometry (ab sin(x))");
			System.out.println("choose 3 to get area of paralellogram using diagonals 1/2(d1.d2)sin(y)");
			int way = s.nextInt();
			switch (way)
			{
		case 1:{
			System.out.println("Enter the base of the parallelogram: ");
			int base=s.nextInt();
			System.out.println("Enter the height of the parallelogram: ");
			int height=s.nextInt();
			int area=base*height;
        
        // display the area of a parallelogram
			System.out.println("Area of the parallelogram = " + area);
		}
		break;
		case 2:{
			System.out.println("Enter the sides of the parallelogram: ");
			double a1=s.nextDouble();
			System.out.println("Enter the sides of the parallelogram: ");
			double b1=s.nextDouble();
			System.out.println("Enter the angle between the sides of the parallelogram: ");
			double a = s.nextDouble();
        // converting values to radians
			double b = Math.toRadians(a);
			double area=a1*b1*(Math.sin(b));
        // display the area of parallelogram
			System.out.println("Area of the parallelogram = " + area);
		}
		break;
		case 3:
				{
			System.out.println("Enter the first diagonal of the parallelogram: ");
			double d1=s.nextDouble();
			System.out.println("Enter the second diagonal of the parallelogram: ");
			double d2=s.nextDouble();
			System.out.println("Enter the angle between the diagonals of the parallelogram: ");
			double a = s.nextDouble();
        // converting values to radians
			double b = Math.toRadians(a);
			double area=(d1*d2*(Math.sin(b)))/2;
        // display the area of parallelogram
			System.out.println("Area of the parallelogram = " + area);
		}
		break;
			
			}
		}
		break;

		case 6: 
		{
			System.out.println("You have choosen to find area of trapezium");
			System.out.println("Enter the one of parallel side of trapezium");
			double length = s.nextDouble();
			System.out.println("Enter the another parallel side of trapezium");
			double breadth = s.nextDouble();
			System.out.println("Enter the height of trapezium");
			double height = s.nextDouble();
			System.out.println("Area of trapezium having one side "+length+ " and another parallel side "+ breadth+" with height "+height +" is " + (length+breadth)/2.0*height);
		}
		break;
		case 7:
			{
			System.out.println("You have choosen to find area of rhombus");
			System.out.println("choose 1 to get area of rhombus using base and height (b*h)");
			System.out.println("choose 2 to get area of rhombus using trignometry (b**2 sin(/_B))");
			System.out.println("choose 3 to get area of rhombus using diagonals 1/2(d1.d2)");
			int way = s.nextInt();
			switch (way)
			{
		case 1:{
			System.out.println("Enter the base of the rhombus: ");
			double base=s.nextDouble();
			System.out.println("Enter the height of the rhombus: ");
			double height=s.nextDouble();
			double area=base*height;
        
        // display the area of a parallelogram
			System.out.println("Area of the rhombus = " + area);
		}
		break;
		case 2:{
			System.out.println("Enter the sides of the rhombus: ");
			double a1=s.nextDouble();
			System.out.println("Enter the angle between the any sides of the rhombus: ");
			double a = s.nextDouble();
        // converting values to radians
			double b = Math.toRadians(a);
			double area=a1*a1*(Math.sin(a));
        // display the area of parallelogram
			System.out.println("Area of the rhombus = " + area);
		}
		break;
		case 3:
				{
			System.out.println("Enter the first diagonal of the rhombus: ");
			double d1=s.nextDouble();
			System.out.println("Enter the second diagonal of the rhombus: ");
			double d2=s.nextDouble();
			double area=(d1*d2)/2;
        // display the area of parallelogram
			System.out.println("Area of the rhombus = " + area);
		}
		break;
			
			}
			
		}
		break;

		case 8:{
			System.out.println("You have choosen to find area of ellipse");
			System.out.println("Enter the half minor axis of ellipse");
			double length = s.nextDouble();
			System.out.println("Enter the half major axis of ellipse");
			double breadth = s.nextDouble();
			System.out.println("Area of ellipse having minor axis "+length+ " and major axis "+ breadth+ " is " + (3.14*length*breadth));
		}
		break;

		default: System.out.println("Choose wisely");

		}
		break;
		}
		case 3:{
		System.out.println("You have choosen 3d shapes to find areas of respective polygon");
		System.out.println();

		System.out.println("Enter 1 to find volume of cube");
		System.out.println("Enter 2 to find volume of cuboid");
		System.out.println("Enter 3 to find volume of sphere");
		System.out.println("Enter 4 to find valume of cylinder");
		System.out.println("Enter 5 to find volume of cone");

		int shp = s.nextInt();

		switch (shp)
		{
		case 1:{
			System.out.println("You have choosen to find volume of cube");
			System.out.println("Enter the side of cube");
			double side = s.nextDouble();
			System.out.println("Volume of Cube having side "+side+ " is " + (side*side*side));
			
		}
		break;
		case 2:{
			System.out.println("You have choosen to find volume of cuboid");
			System.out.println("Enter the length of cuboid");
			double length = s.nextDouble();
			System.out.println("Enter the breadth of cuboid");
			double breadth = s.nextDouble();
			System.out.println("Enter the height of cuboid");
			double height = s.nextDouble();
			System.out.println("Volume of rectangle having length "+length+ " and breadth "+ breadth+ " and height "+height+" is " + (length*breadth*height));
		
		}
		break;
		case 3:{
			System.out.println("You have choosen to find Volume of Sphere");
			System.out.println("Enter the radius of sphere");
			double length = s.nextDouble();
			System.out.println("Volume of sphere having radius "+length+ " is " + 4/3.0*3.14*(length*length*length));		
		}
		break;
		case 4:
		{
			System.out.println("You have choosen to find Volume of Cylinder");
			System.out.println("Enter the radius of cylinder");
			double length = s.nextDouble();
			System.out.println("Enter the height of cylinder");
			double height = s.nextDouble();
			System.out.println("Volume of cylinder having radius "+length+ " and height "+height+" is " + 3.14*length*length*height);
		}
		break;
		case 5:
		{
			System.out.println("You have choosen to find Volume of Cone");
			System.out.println("Enter the radius of cone");
			double length = s.nextDouble();
			System.out.println("Enter the height of cone");
			double height = s.nextDouble();
			System.out.println("Volume of cone having radius "+length+ " and height "+height+" is " + 3.14*length*length*height/3.0);
		}
		}
		
		}
		default: System.out.println("\n Enter valid input" +"\n");
		}
		System.out.println("Press any key to continue and \"9\" to exit ");
		n = s.nextInt();
		}
	}
}

