import java.util.Scanner;
import java.util.Random;

public class LuckGame
{
	public static void main(String[] ced)
	{
		Scanner input=new Scanner(System.in);
		int count=0;
		Random rand=new Random();
		System.out.println("This is Dice Game App");
		int dice=1+rand.nextInt(10);
		
		System.out.println(dice+" ");
		do
		{   
		   int maxi=0,min=0; 
		    dice=1+rand.nextInt(10);
			System.out.print("Enter any interger value to start: ");
			String chara=input.nextLine();
			System.out.println(dice+" ");
			
			if(dice==10)
			{
				maxi=dice;
				System.out.println(maxi+" is"+"Maxi");
			}
			else if(dice==1)
			{
			  min=dice;
			  System.out.println(min+"is "+"Min");
			}
			else
			{
			 System.out.println("you lose");
			}
			
			System.out.print(enter any inter other greater than three to Continue: ");
			count=input.nextInt();
			count++;
			
		}
		while(dice!=8 && count<=3);
	}
}