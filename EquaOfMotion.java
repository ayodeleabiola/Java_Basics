import java.util.Scanner;
public class EquaOfMotion
{
	public static void main(String[]rrrr)
	{
		Scanner input=new Scanner(System.in);
		double i,r, t;
		double power;
		System.out.println("This power cal.power of eletric current");
		
		System.out.print("Enter the current in amperes: ");
		i =input.nextDouble();
		
		System.out.print("Enter the resistance in ohms: ");
		r=input.nextDouble();
		
		System.out.print("Enter the time in seconds: ");
		t=input.nextDouble();
		
		power=i*i*r*t;
		
		System.out.println("power= "+power+"");
		
	}
}