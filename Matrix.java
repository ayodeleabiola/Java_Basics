import java.util.Scanner;
public class Matrix
{
	public static void main(String[] df)
	{
				
		// create the two matrices a and b
		double[][] a = new double[2][3];
		double[][] b = new double[2][3];
		
		// create a matrix c to store the result
		double[][] c = new double[2][3];
		
		//input the values of a
		System.out.println("Input the first matrix");
		inputValues(a);
		
		// input the values of b
		System.out.println("Input the second matrix");
		inputValues(b);
		
		// find the sum of a and b
		c = add(a,b);
		
		// display the result
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			
			System.out.println(" ");
		}
		
	}
	
	public static void inputValues(double[][] x)
	{
		Scanner input = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("element["+(i+1)+"]["+(j+1)+"]:  ");
				x[i][j] = input.nextDouble();
			}
			System.out.println(" ");
		}
		
	}
	
	public static double[][] add(double[][] x, double[][] y)
	{
		Scanner input = new Scanner(System.in);
		double[][] z = new double[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
			}
			
		}
		
		return z;
		
	}
}