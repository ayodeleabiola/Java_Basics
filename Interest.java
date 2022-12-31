import java.util.Scanner;
public class Interest
{
	public static void main(String[] set)
	{	Scanner input=new Scanner(System.in);
		
		double principal,rate,interest,time,inte;
		System.out.print("Enter the principal amount: ");
		principal=input.nextInt();
		
		System.out.print("Enter the time: ");
		time=input.nextInt();

		
		System.out.print("enter the rate in percent: ");
		rate=input.nextInt();
		
		rate=rate/100;
		
		for(int i=1;i<=time; i++)
		{
		   interest=principal*(1+rate);
		   principal=interest;
	
		 inte=principal+interest;
		   
		  
		  System.out.println("interest for the first year "+i+ " is "+interest+" "+principal);
		  System.out.println(inte+" ");
		}
	}	

}