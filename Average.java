import java.util.Scanner;
public class Average
{
	public static void main(String[]rrrr)
	{   
	    
		Scanner input=new Scanner(System.in);
		double a=0,b=0,c=0;
        System.out.println("Mean Calculator");
		System.out.print("Enter a: ");
		a=input.nextInt();
		System.out.print("Enter b: ");
		b=input.nextInt();
		System.out.print("Enter c: ");
		c=input.nextInt();
		
		double average=(a+b+c)/3;
		System.out.print(average);
		
	}
}