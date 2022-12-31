public class DateTime
{
	public static void main(String[] ssd)
	{	int minute=0;
		int seconds=60,day=24;
		while(day!=1)
		{
		  for(int s=0;s<=60;s++)
		  {
			seconds--;
		  }
		  day--;
		 minute++;
		 
		}
		System.out.print(minute+"  "+seconds);
    }
}