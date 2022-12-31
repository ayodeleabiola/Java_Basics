import java.util.Scanner;
public class DaysDemo
{
	public static void main(String[] rrr)
	{		Scanner input=new Scanner(System.in);
			int day_in_week;
			String day=" ";
			System.out.println("This App prints days in week: ");
			System.out.print("Enter day in interger corresponding value: ");
			day_in_week=input.nextInt();
			
			
			 
			switch(day_in_week)
			{
				case 1:
				{
				day="Monday";	
				}
				case 2:
				{
				day="Tuesday";
				break;
				}
				case 3:
				{
				day="Wednesday";
				break;
				}
				case 4:
				{
				day="Thursday";
				break;
				}
				case 5:
				{
				day="Friday";
				break;
				}
				case 6:
				{
				 day="Saturday";
				 break;
				}
				case 7:
				{
				day="Sunday";
				break;
				}
				default:
				{
				day="Error";
				break;
				}
			}      
	 System.out.print("todays is "+day);
	}		
}