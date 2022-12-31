import java.util.Scanner;
public class DigitCor
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		int number,quo,remainder, digits=0;
		System.out.print("Enter any digits integer: ");
		number=input.nextInt();
		int sum=0;
		do
		{
		 quo=number/10;
		 remainder=number%10;
		 number=quo;
		 digits++;
		 

		 sum=sum+remainder;
		 
		}
		while(quo!=0);
		System.out.print("The number of digits is "+digits+" with total sum = "+sum );
	}
}