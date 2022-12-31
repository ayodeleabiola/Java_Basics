import java.util.Scanner;
public class Sum
{
	public static void main(String[]rrr)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This app calculate Sum of two number");
		int a,b,sum=0,result=0;
		System.out.print("Enter the first value: ");
		a=input.nextInt();
		System.out.print("Enter the second value: ");
		b=input.nextInt();
		sum=a+b;
		comm=""
		if(sum>30)
		{
			result=sum+3;
			String comm="3 was addded"
		}
		else
		{
			result=sum*5;
			comm="5 was multiply with sum when less than"
		}
		System.out.println(comm+"Result="+result);
			
	}
}