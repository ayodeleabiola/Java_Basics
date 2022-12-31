import java.util.Scanner;
public class Equal
{
	public static void main(String[] rrr)
	{
		gh
	  
	  Scanner input=new Scanner(System.in);
	   
	   double a,b,c,root1,root2;1
	   System.out.println("this App is programmed to cal.quadratic Equation");
	   System.out.print("Enter a= ");
	   a=input.nextDouble();
	   
	   System.out.print("Enter b= ");
	   b=input.nextDouble();

	   System.out.print("Enter c= ");
	   c=input.nextDouble();

		root1=(-b+ Math.sqrt(b*b-4*a*c))/2*a;
		root2=(-b- Math.sqrt(b*b-4*a*c))/2*a;
		
		System.out.println("ans is: "+root1);
		System.out.print("ans is: "+root2);
	   
	
	}
}
