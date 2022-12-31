import java.util.Scanner;
public class Factorial
{
	public static void main(String[]rrr)
	{
		Scanner input=new Scanner(System.in);
		int n,count=1,fact=1;
		System.out.print("Enter any integer: ");
		n=input.nextInt();
		
		while(count<=n)
		{
		    fact=fact*count;
			count++;
			System.out.print(fact+" ");
		}
		
	}
}