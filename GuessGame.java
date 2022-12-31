import java.util.Scanner;
import java.util.Random;
public class GuessGame
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		Random ran =new Random();
		int targetnum=1+ran.nextInt(10);//1+ran.nextInt(10) means 1+9=10 

		System.out.print("Enter your number ");
		int guess=input.nextInt();
		int trials=1;
		while(guess!=targetnum && trials<=3)
		{
			if(guess<targetnum)
			{
				System.out.println("Too low.Try again: ");
			}
			else
				System.out.println("Too high.Try again: ");
		  System.out.print("Enter again: ");
		  guess =input.nextInt();
		  trials++;
		}
		if(trials<=0)System.out.println(" Great you won! "+trials);
		    else System.out.println("oops!you lose!the answer is "+targetnum);
		
		System.out.println("Excellent!you get it right: ");
		System.out.println("your trials is"+trials);
	}
}