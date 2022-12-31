import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] rrrr)
	{   
	    Scanner input=new Scanner(System.in);
		int f1=0,f2=1;
		System.out.println("This App is design to generate Fibonacci number sequence: ");
		System.out.print("How many fibonacci of a number to generate: ");
		int n=input.nextInt();
		int count=0,j=0,x=1;
		System.out.print(f1+ " " +f2+ " ");
		while(x!=0)
		{
			for(int i=1;i<=n-2;i++)
			{
				
				
				
			   
			   int swap=f1;
				
				f1=f2;
				
				f2=f1+swap;

				if(f2%2==0)count++;
				System.out.print(f2+"  ");
				j =j+2;
				
		    }
			    System.out.println("fibonacci of  " +n+" number is " +j+ " with "+count+" Even number");
				System.out.print("Enter any integer value.Except Zero to continue: ");
				x=input.nextInt();
		}
		
		   
		
	}
}