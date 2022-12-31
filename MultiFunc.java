import java.util.Scanner;

public class MultiFunc
{
	public static void main(String[] arro)
	{
		Scanner input=new Scanner(System.in);
		
		int x[]=new int[6];
		
		
		 for(int i=0;i<x.length;i++)
		   {
			 System.out.print("input X elements: ");
             x[i]=input.nextInt();
		   }
		   
		 //int [] result=setFunc(x);
		
		  
		   System.out.print(setFunc(x));
		 
	}
    
    public static int setFunc(int[] n)
	{    
		 int sum=0;
		 
		for(int i=0;i<n.length;i++)
		{
			sum = sum + n[i]*n[i];
		}
		return sum;
	}	   
}