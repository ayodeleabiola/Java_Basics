import java.util.Scanner;

public class ForFunction
{
	public static void main(String[] rrr)
	{
	  forFun();
	}
	
	 
      public static int forFun()
	  { int i=0;
		 Scanner input=new Scanner(System.in);
		 
		 System.out.print("Enter any integer  for conditional Loop ");
		 int n=input.nextInt();
	    
		for(i=1;i<=n;i++)
		 {
			 System.out.println(i+" "+i*i*i);
			 
		 }
		 return i;
	  }
	  
	
}