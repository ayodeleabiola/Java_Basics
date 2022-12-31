import java.util.Scanner;

public class DigitDemo
{
	public static void main(String[] rrr)
	{   Scanner input=new Scanner(System.in);
	    
		
		System.out.print("Enter any digit number: ");
		String number=input.next();
		
		int count=0;
		for(int i=1;i<=number.length();i++)
		{
			//if(i<=number.length())
			count++;
		}
		System.out.print(count+" ");
	}
}