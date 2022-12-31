public class Pass
{
	public static void main(String[] ce)
	{
		int [] x = {1,3,4,5,6,7};
		
		int m = 6;
		System.out.println("before calling modify: m= "+m);
		
		System.out.println("before calling modify2: x= ");
		for(int i=0;i<x.length;i++) System.out.print(x[i]+"  ");
		
		modify2(x);
		
		
		System.out.println("\nafter calling modify: m= "+modify(m));
		
		System.out.println("\nafter calling modify2: x= ");
		for(int i=0;i<x.length;i++)
		{		System.out.print(x[i]+"  ");
		}
	
	}     
	
	
	public static int modify(int n)
	{
		n = n+3;
		return n;
	}
	
	public static void modify2(int[] x)
	{
		x[1]=0;
		x[2]=-7;
	}
}