import java.util.Scanner;
import java.util.Random;
public class DiceCor
{
	public static void main(String[] arg)
	{   int sum;
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("Enter any character to roll:  ");
		String c = input.nextLine();
		int dice = 1+ran.nextInt(6);
		int dice1 =1+ ran.nextInt(6);
			
		 sum = dice + dice1; 
			System.out.println("die1 = "+dice1);
			System.out.println("die2 = "+dice);
			//System.out.println("die1 + die2 = "+sum );
			boolean isWin = false;
			
			switch(sum)
			{
				case 7:
				{
					int trial = 0;
					while(sum<10 && trial<=2)
					{
						System.out.print("Enter any character to roll:  ");
						c = input.nextLine();
						dice = 1+ran.nextInt(6);
						dice1 =1+ ran.nextInt(6);
						System.out.println("die1 = "+dice1 );
						System.out.println("die2 = "+dice );
						System.out.println("die1 + die2 = "+sum );
						sum = dice+dice1;
						trial++;
					}
					if(trial>2) isWin = false;
					else isWin = true;
					break;
				}
				
				case 12:
				{
					isWin=true;
					break;
				}
				
							
				default:
				{
					int trial = 0;
					while( trial<=3)
					{
						System.out.print("Enter any character to roll:  ");
						c = input.nextLine();
						dice = 1+ran.nextInt(6);
						dice1 =1+ ran.nextInt(6);
						sum = dice+dice1;
						System.out.println("die1 = "+dice1 );
						System.out.println("die2 = "+dice );
						System.out.println("die1 + die2 = "+sum );
						if(sum==8 || sum==10 || sum==12) break;
						trial++;
					}
					if(trial>3) isWin=false;
					else isWin=true;
					break;
				}
			}
			
			
		
		if(isWin==true)
		{
			System.out.println("Excellent, you win" );
		}
		else
		{
			System.out.println("Poor, you loss" );
		}
		
		
		 
	}
}