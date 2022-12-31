import java.util.Scanner;
import java.util.Random;
public class DiceGame
{
	public static void main(String[] rrr)
	{
		Scanner input= new Scanner(System.in);
		int dice1,dice2,roll=0,counter=1;
		
		do
		{
			 Random ran=new Random(); 
		     dice1=1+ran.nextInt(6);
		     dice2=1+ran.nextInt(6);
		     roll=dice1+dice2;
		
		    if( roll>8)
            {				
				
			  System.out.println("oops you loss !Too high");
			 roll=dice1+dice2;
			}
	        else
			{
			 System.out.println("Too low!");
			 
			 Sy
			}
           
		   System.out.print("Enter any integer value to continue: ");	
			int rollcont=input.nextInt();	
			roll=dice1+dice2;
			counter++;  
		}
		while(roll!=8);
	      System.out.println("Excellent you win! "+roll);
	}
}