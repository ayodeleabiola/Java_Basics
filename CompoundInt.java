import java.util.Scanner;
public class CompoundInt
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		double rate,time,principle;
		System.out.println("This App is design to calculate the Simple interest: ");
		
		System.out.print("Enter the principle in digits: ");
		principle=input.nextInt();
		
		System.out.print("Enter the rate in percentage : ");
		rate=input.nextInt();
		
		System.out.print("Enter the time: ");
		time=input.nextInt();
         rate =rate/100;
		double cInterest=principle*Math.pow(1+rate,time);
		System.out.println("Compound Interest value is "+cInterest);
	}

	
}