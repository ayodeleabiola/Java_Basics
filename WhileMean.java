import java.util.Scanner;
public class WhileMean
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This App is design to calculate mean of numbers: ");
		double x=0,sum=0,count=1,xtotal=0;
		while(x>=0)
		{   
	        System.out.print("Enter data"+count+ " = ");
			 int value=input.nextInt();
			
			sum=sum+value;
			count++;
			xtotal++;
			
			System.out.print("Enter any negative value to stop inputting values: ");
		    x=input.nextInt();
		}
		
		double result=sum/xtotal;
		
		System.out.println("Mean = "+result);
		System.out.println(sum);
		System.out.println(xtotal);
		
	}
}
