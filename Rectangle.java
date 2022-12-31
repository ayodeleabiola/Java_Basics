import java.util.Scanner;
public class Rectangle
{
	public static void main(String[] rr)
	{  


     	Scanner input=new Scanner(System.in);
	    double length,breadth,area;
		System.out.println("This program cal.Area of a rectangle");
		System.out.print("Enter the Length: ");
		length=input.nextDouble();
		System.out.print("Enter the breadth: ");
		breadth=input.nextDouble();
		area=length*breadth;
		System.out.print(area);
		
		

	
	}
}
