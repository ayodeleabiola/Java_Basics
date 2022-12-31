import java.util.Scanner;

public class OddDemo
{
	public static void main(String[] sss)
	{
		//programto check odd number.
		Scanner input=new Scanner(System.in);
		int n=0,count=0;
		 int x=0;
		System.out.println("This App print odd Number: ");
		System.out.print("Enter N for integer value: ");
		n=input.nextInt();

			for(int i=0;i<=n;i++)
			{
			  if(i%2!=0)
			  {
				  count++;
				  System.out.print(i+" ");
			  }
			 
			}

		 System.out.println("\n");
		

		System.out.print("the odd numbers are: "+count);
	}
}

