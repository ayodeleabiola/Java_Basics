import java.util.Scanner;
public class SimpleInt
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		double rate,time,principle;
		double sInterest,cInterest,amount;
		System.out.println("This App is design to calculate the Simple interest: ");
		
		System.out.print("Enter 1 to perform simple interest or 2 for compound interest : ");
		int x=input.nextInt();
		
		
		
		System.out.print("Enter the principle in digits: ");
		principle=input.nextInt();
		
		System.out.print("Enter the rate in percentage : ");
		rate=input.nextInt();
		
		System.out.print("Enter the time: ");
		time=input.nextInt();
		
		rate =rate/100;
        do
		{		 if(x==1)
				{
					 sInterest=(principle*rate*time)/100;
					 amount=principle+sInterest;
					System.out.println("the interest value on the principle with time in(year) is: " +sInterest+ " and "+amount+" amount yielded");
				}
				else if(x==2)
				{
				 cInterest=principle*Math.pow(1+rate,time);
				 System.out.println("Compound Interest value is "+cInterest);
				}
				
				else System.out.println("Not Matched ");
	
		}
	      while(x==1 && x==2);
	     System.out.print("You selected the wrong option; so GoodBbye!");
	}
		 	
}