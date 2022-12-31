import java.util.Scanner;
public class PerfectNum
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		int number,sum=0;
		
		System.out.println("This program cal.sum of factor of a number");
		
		System.out.print("Enter any integer: ");
		number=input.nextInt();
		for(int i=1;i<number;i++)
		{
			if(number%i==0) sum=sum+i;
		}
		if(sum==number) System.out.println("The number is a perfect number");
		
			
			else System.out.println("The number is not a perfect!");
	}
}