import java.util.Scanner;
public class Subscribe
{
	public static void main(String[] cet)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("subscription App: ");
		
		System.out.print("Enter subscription in months?: ");
		int month=input.nextInt();
		
		planSub(month);
	}
       public static int planSub(int x)
		
		{ 
		 Scanner input =new Scanner(System.in);
          		 
		  int count=0;
		  int period=30*x;
		  int days_remaining=period;
		  
		  while(count!=period)
		  {  
			
			 System.out.print("press 1 to check day remain: ");
			 int daysLeft=input.nextInt();
		     
			 days_remaining--;
			 
			 count++;
			 
			 if(count<period)
			 {
				System.out.println("you subscription remain "+ days_remaining+" to expire"); 
			 }
		  }
		   return days_remaining;
		}
}