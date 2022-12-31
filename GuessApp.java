import java.util.Scanner;
import java.util.Random;
public class GuessApp
{
	public static void main(String[] rrr)
	
	{
		Scanner input=new Scanner(System.in);
		Random rand=new Random();
				
	     
	   System.out.print("Enter any character to Roll the dice: ");
		String roll=input.nextLine();
		
		int die1=1+rand.nextInt(6);
		int die2=1+rand.nextInt(6);
		int outcome=die1+die2;
        int count=1;
			
		
		
		System.out.println("die1 outcome= "+die1);
		System.out.println("die2 outcome= "+die2);
		System.out.println("die1+die2= "+outcome);
		
		while(outcome!=2 && count<=2)
		{
		  
		   System.out.print("try roll it twice again as the outcome is= "+ outcome);
		  int x=input.nextInt();
		  
		  die1=1+rand.nextInt(6);
		  die2=1+rand.nextInt(6);
		  outcome=die1+die2;
	     if(outcome==12)
		  {
			 System.out.println("you win" +outcome+ " " +count ); 
            
			  
		  }
		  else if(count%2==0 && count<=3)
		  {  
               System.out.println("the outcome generated is even number from 8 or above: "+outcome);
		 }
		  else System.out.println("you lose!The outcome is: "+outcome);
		  
		  
		  count++;
		  System.out.println(" ");
		}
		System.out.println("you win!: "+outcome+" "+count);	
			
	}
}