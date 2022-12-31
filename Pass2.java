public class Pass2
{
	public static void main(String[] ress)
	{
		int []set={1,2,3,4,5};
		passFunc(set);
		
		for(int i=0;i<set.length;i++)
		{
	      System.out.println(set[i]+" ");
		}
		System.out.println(minFunc("The sum of maximum and maximum value is "+minFunc(set)+" ");
	}
	public static void passFunc(int []x)
	{
		x[3]=9;
		x[2]=3;
	}
	public static int minFunc(int []y)//the return type is integer.
	{   
		 int minValue=y[0];//min=y[0] is equal y array index 0
		  for(int i=0;i<y.length;i++)(
		  {
			  if(y[i]<minValue)
			  {
				minValue=y[i];
			  }
		  }
		  
		  int maxiValue=y[0];//min=y[0] is equal y array index 0
		  for(int i=0;i>y.length;i++)
		  {
			  if(y[i]>maxiValue)
			  {
				maxiValue=y[i];
			  }
		  }
		  int sum=maxiValue+minValue;
		  return sum;
	}
}