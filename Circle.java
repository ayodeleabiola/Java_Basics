import java.util.Scanner;
public class Circle
{
	public static void main(String [] rrr)
	{
		Scanner input=new Scanner(System.in);
		int r;
		double area;
		System.out.println("Area of a circle formular");
		System.out.print("Input Radius= ");
		r=input.nextInt();
		area=3.142*(r*r);
		System.out.print("Area= "+area);
	}
}