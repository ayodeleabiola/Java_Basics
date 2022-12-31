import java.util.Scanner;
public class SetSquareFunc
{
	public static void main(String[] rat)
	{
		Scanner input=new Scanner(System.in);
		
		int set[]=new int[7];
				
		for(int i=0;i<set.length;i++)
		{	
		    System.out.print("Input set elements: ");
			set[i]=input.nextInt();
		    System.out.println(i+1+"."+" elements = "+set[i]);
		}
		
		System.out.println(" ");
		
      
	  for(int i=0;i<set.length;i++)		
	  { 
	    System.out.println(i+1+"."+ "elements ="+set[i]);
	  }
	  
		System.out.println(setFun(set));
	 
	}
	
	
	public static int setFun(int[] x)
	{   
		 int sum=0;
		 
		for(int i=0;i<x.length;i++)
		{
			sum = sum + x[i]*x[i];
		}
		return sum;
	}
}