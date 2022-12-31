import java.util.Random;
public class ArrayPrac
{
	public static void main(String[] rrr)
	{
		Random rand=new Random();
		
		int storage[]=new int[10];
		
		for(int i=0;i<storage.length;i++)
		{
		    storage[i]=3+rand.nextInt(100);
			System.out.print(storage[i]+" ");
		}
	}
}