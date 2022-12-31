import java.util.Scanner;
public class ComInterest
{
	public static void main(String[] set)
	{	Scanner input=new Scanner(System.in);
		
		double principal,rate,cInterest,result;
		System.out.print("Enter the principal amount: ");
		principal=input.nextInt();
		
		System.out.print("enter the rate in percent: ");
		rate=input.nextInt();
		rate=rate/100;
		
		interest(principal,rate);
        	
	}
     public static void interest(double principal,double rate){
		 double cInterest=0,result=0;
		for(int i=1;i<=10; i++)
		{    
		   cInterest=principal*(Math.pow(1+rate,1));
		   principal=cInterest;
		   result=cInterest; 
		   
		   System.out.println("interest for the first year "+i+ " is "+ result);
		} 
	
	}	

}