public class Rect
{
	private double length, breadth;
	
	public Rect()
	{
	    //length=2;
		//breadth=2;
		System.out.println("Area1 = ");
	}
	
	public Rect(double a, double b)
	{
		length = a;
		breadth = b;
	}
	
	public double area()
	{
		return length*breadth;
	}
	
	public double sumFunc(double l,double b)
	{
	  return (l+b);
	}
	
	public void setDimension(double l, double b)
	{
		length = l;
		breadth = b;
	}
	
	public double getLength()
	{
		return length;
	}
}