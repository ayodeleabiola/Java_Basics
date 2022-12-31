import java.util.Scanner;
import java.util.Random;

public class AssignmentRand
{
	public static void main(String [] axe)
	{
		 
		Scanner input = new Scanner(System.in);
		
		Random ran = new Random();
		int[] a  = new int[10];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = 3+ran.nextInt(98);//rand.nextInt(98) will generate 0-97 but with plus 3 will make it 100 i.e 3+97
		}
		
		for(int i=0; i<a.length; i++)
			
			{
				System.out.print( a[i]+"  ");
			}
		 
		int max = a[0] ;
		
		 for(int i=0; i<a.length; i++)
		 {
			 if(max<a[i]) max = a[i];
		 }
		System.out.println("\nmaximaum value = "+max);
		 
	}
}