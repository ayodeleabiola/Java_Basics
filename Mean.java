import java.util.Scanner;
public class Mean
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		double x,sum=0,result;
		int n=10;
		for(int i=1;i<=10;i++)
		{
		System.out.print("Enter the values of x"+i+" ");
		x=input.nextDouble();
		sum=sum+x;
		}
		result=sum/10;
		System.out.print("Mean ="+result);
		
	}
}