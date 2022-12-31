public class OverLoading
{
	public static void main(String[] red)
	{  
	     double x=2,y=3,z=4;
		 double m=3,l=4,n=3;
		int a=1,b=2;
	    
		System.out.println(arr(x,y,z));
		System.out.println(arr(l,m,n));
		System.out.println(arr(a,b));

		
	
	}

       public static double arr(double a,double b,double c)
		{
		 return (a*b*c);
		}

     public static int arr(int x,int y)
		{
		 return (x*y);
		}
		public static float arr(int x,int y,int z)
		{
		 return (x*y*z);
		}       			
}