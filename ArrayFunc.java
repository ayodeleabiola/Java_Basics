public class ArrayFunc
{
	public static void main(String[] ce)
	{
		int[] x = {1,3,4,5,6,7,2,4,9};
		int[] y = {7,9,-3,5,8,4,3,7,9};
		
		int[] result = add(x,y);// throw x,y to int[]a AND b[] 
		
		for(int i=0;i<result.length;i++)//Looping through the function add() stored in result  
		{
			System.out.print(result[i]+"  ");
		}			
		
	}
	
	public static int[] add(int[] a, int[] b)
	{
		int[] c = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i]+b[i];
		}
		
		return c;
	}
	
	
}