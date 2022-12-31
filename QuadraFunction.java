import java.util.Scanner;
public class QuadraFunction
{
	public static void main(String[] rrr)
	{ 
		
		 
			 Scanner input=new Scanner(System.in);
	        double a=0,b=0,c=0;
	
		    System.out.println("This App calulate Root for quadratic Equation" );
		
			System.out.print("Enter the 1st value: ");
			a=input.nextDouble();
			
			System.out.print("Enter the 2nd value: ");
			b=input.nextDouble();
			
			System.out.print("The 3rd value: ");
			c=input.nextDouble();
	
            quadratic(a,b,c);
		
	}
	public static void quadratic(double x,double y,double z)
	{      	   double root1=0;
			   double root2=0;
			 
			  double d=y*y-4*x*z;
			
			if(d<0)
			{
				System.out.print("The result are complex number = "+d);
			}
			else
			{
				
				 root1=(-y+Math.sqrt(y*y-4*x*z))/2*x;
				 root2=(-y-Math.sqrt(y*y-4*x*z))/2*x;
				
				System.out.print("root1= "+root1+" ,"+"root2="+root2);
		    }
               	
	}

}