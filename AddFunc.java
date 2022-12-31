public class AddFunc
{
	public static void main(String[] ce)
	{
		int[] m = {{2,5},{9,3},{4,4}};
		int[] n = {{1,6},{4,2},{5,2}};
		
		int[] result = add(m,n);// throw x,y to int[]a AND b[] 
		
		for(int i=0;i<result.length;i++)//Looping through the function add() stored in result  
		{
			System.out.println(result[i]+"  ");
		}			
		
	}
	
	public static int[] add(int[] x, int[] y)
	{
		int[] addition = new int[x.length];
		
		for(int i=0;i<x.length;i++)
		{
			addition[i] = x[i]+y[i];
		}
		
		return addition;
	}
}