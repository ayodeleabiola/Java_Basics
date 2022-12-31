import java.util.Scanner;
public class QuadRoot
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		double a,b,c,root1,root2;
		System.out.println("This App calulate Root for quadratic Equation" );
		
		System.out.print("Enter the 1st value: ");
		a=input.nextDouble();
		
		System.out.print("Enter the 2nd value: ");
		b=input.nextDouble();
		
		System.out.print("The 3rd value: ");
		c=input.nextDouble();
		
		double d=b*b-4*a*c;
		
		if(d<0)
		{
			System.out.print("The result are complex number");
		}
		else
		{
			root1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
			root2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
			
			
			System.out.println("root1= "+root1);
		    System.out.println("root2= "+root2);
        }
	}
}