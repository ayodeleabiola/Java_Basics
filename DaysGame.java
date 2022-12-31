import java.util.Scanner;
import java.util.Random;

public class DaysGame
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		Random rand= new Random();
		
	    String day=" ";
		String charac;
		 int x=1;
         String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		 
		 System.out.print("Enter any character:  ");
		   day = input.nextLine();
		   int day_random=rand.nextInt(7);
		System.out.println((day_random+1)+": "+days[day_random]);

         while(day_random!=0)
		{			 
 		   System.out.print("Enter any character:  ");
		   day = input.nextLine();
		   day_random=rand.nextInt(7);
		   System.out.println((day_random+1)+": "+days[day_random]);
		   
		}
		System.out.println((day_random+1)+": "+days[day_random]+" is the best day");
	}
}