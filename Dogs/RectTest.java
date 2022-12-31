public class RectTest
{
	public static void main(String[] aaaa)
	{
		Rect r = new Rect();
		Rect r2 = new Rect(4,5);
		r.setDimension(8,10);//r.setDimension is used to access the setDimension function for passing parameters.
		
		
		System.out.println("Area2 = "+r2.area());
		
		System.out.println("Area1 = "+r.area());
		System.out.print(r.area());
		
	}
} 