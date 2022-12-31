import java.util.Scanner;
public class Three_By_Four_Matrix
{
	public static void main(String[] red)
	{
	  Scanner input=new Scanner(System.in);
	 double[][] x=new double[3][4];//Array X initialization with 3 rows,4 column memory space.
	 double[][] y=new double[3][4];//Array y initialization with 3 rows,4 olumn memory space.
	
     System.out.println("This is 3 by 4 matrix Applicatin");
	   
	    for(int row=0;row<3;row++)
		{
			 for(int col=0;col<4;col++)
			 {
			  System.out.print("Enter X elements or value for "+"[row] "+(row+1)+" [column] "+(col+1)+" = " );
			   x[row][col]=input.nextDouble();
			 }
			System.out.println(" ");
		}
		
		System.out.println(" ");
       
	   for(int row=0;row<3;row++)
		{
			for(int col=0;col<4;col++)
			{
			 System.out.print("Enter Y elements or value for "+"[row] "+(row+1)+" [column] "+(col+1)+" = ");
             y[row][col]=input.nextDouble();			 
		}
		System.out.println(" ");	
		}			
       double result[][]=additionMatrix(x,y);
	  	  for(int row=0;row<3;row++)
	   {
		   for(int col=0;col<4;col++)
		   {
			 System.out.print(result[row][col]+" " );  
		   }
		   System.out.println(" ");
	   } 
	}
	
   public static double[][] additionMatrix(double[][]a,double[][]b)
   {
	   double[][]c=new double[3][4];
	   
	   for(int row=0;row<3;row++)
	   {
		   for(int col=0;col<4;col++)
		   {
			c[row][col]=a[row][col]+b[row][col];   
		   }
	   }
	  return c;
   }
}