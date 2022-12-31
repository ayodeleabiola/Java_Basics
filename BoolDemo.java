import java.util.Scanner;
public class BoolDemo
{
	public static void main(String[] df)
	{ 
	    int x=0;
		Scanner input = new Scanner(System.in);
		
		
		int y=2;
		while(y!=0)
		{   
	      
	        boolean isEven;
			System.out.print("Enter an integer value graeter than 0: ");
		    x = input.nextInt();
			isEven = (x%2==0);
			if(isEven==true)
			{
				System.out.println(x+ " is even");
			}			
			else 
			{
				System.out.println(x+" is an odd number");
			}
		}
		System.out.print("is Zero");
		
	}
}