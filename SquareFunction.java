public class SquareFunction
{
	public static void main(String[] rrr)
	{
		int [] list={1,2,3,4,5,6};
	
        //int []result =square(list);
		for(int i=0;i<list.length;i++)
		{
	      //System.out.print(result[i]+" ");
		  System.out.print(square(list[i]));
		}
		
	}
	
	public static int square(int [] x)//This function returns integer Array E.g[] square 
	{		int sum=0; 
	       int [] multiple = new int[x.length];
		   for(int i=0;i<x.length;i++)
			{
			multiple[i]= x[i]*x[i];
			}		
          return multiple;
	}
}