import java.util.Random;

public class MaxiFunction
{ 
   
	public static int maxFun(int[] x)
	{
		
		int max = x[0];
		for(int i=0;i<x.length;i++)
		{
			if(max<x[i]) max = x[i];
		}
		
		
		return max;
	}
	public static void main(String[] rrr)
	{
		Random rand=new Random();
        int roll[]=new int[10];
		
		for(int i=0;i<roll.length;i++)
		{
			roll[i]=3+rand.nextInt(98);
		}
				
		for(int i=0;i<roll.length;i++){ System.out.print(roll[i]+" ");}
		
		System.out.println("\n"+maxFun(roll));
	}
}
