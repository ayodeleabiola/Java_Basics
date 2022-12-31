import java.util.Scanner;
public class  WhileDemo
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		int x=2;
		
		while(x!=0)//anytime the input x=0 the look will break to print goodbye
		{
			System.out.print("Enter a number: ");
			x=input.nextInt();
		}
		System.out.print("Goodbye");
    }
}	