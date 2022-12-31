import java.util.Scanner;
import java.util.Random;
public class Dice
{
	public static void main(String[] arg)
	{
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("Enter any character to roll:  ");
		String c = input.nextLine();
		int dice = 1+ran.nextInt(6);
		int dice1 =1+ ran.nextInt(6);
		double x;
		
		int sum = dice + dice1; 
			System.out.println("die1 = "+dice1 );
			System.out.println("die2 = "+dice );
			System.out.println("die1 + die2 = "+sum );
		
		while( sum != 8 )
		{
			
			
			
			System.out.println("The sum is not equal to 8!");
			
			System.out.print("Enter any character to roll again:  ");
		    c = input.nextLine();
			dice = 1+ran.nextInt(6);
		    dice1 =1+ ran.nextInt(6);
			sum = dice+dice1;
			
			System.out.println("dice1 = "+dice1 );
			System.out.println("dice2 = "+dice );
			System.out.println("dice1 + dice2 = "+sum );
			
		    
		}
		
		System.out.println("Excellent! dice1 + dice2 = "+sum );
		
		 
	}
}