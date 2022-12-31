import java.util.Scanner;
public class MatrixFunction
{
	public static void main(String[]rrr)
	{
			 Scanner input=new Scanner(System.in);

			 int x[][]=new int[2][3];
			 int y[][]=new int[2][3];
			 int sum[][]=new int[2][3];
			 for(int row=0;row<2;row++)
			 {
				 for(int col=0;col<3;col++)
				 {
					 System.out.print(" Enter Elements of X"+"= ");
					 x[row][col]=input.nextInt();
					
				}
                 System.out.println(" ");//it's input print in the next row				
			 }
               System.out.println(" ");
			   
               for(int row=0;row<2;row++)
			 {
					 for(int col=0;col<3;col++)
					 {
						 System.out.print("Enter the set of Y: ");
						 y[row][col]=input.nextInt(); 
					 }	
			     System.out.println(" ");//it's input print in the next row	
			}

              
                for(int row=0;row<2;row++)
			   {
					 for(int col=0;col<3;col++)
					 {
						sum[row][col]=x[row][col]+y[row][col];
                       
					   						
					 }	
					
			   }
			 
			 for(int row=0;row<2;row++)
			 {
				 for(int col=0;col<3;col++)
				 {
				  System.out.println( sum[row][col]+" ");
				}	
			//System.out.println(" ");
			}
         	
       			
	}
}