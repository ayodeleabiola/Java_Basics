import java.util.Scanner;
public class Binary
{
	 public static void main(String[] sss)
	 {
	   Scanner input=new Scanner(System.in);
	   double value[]=new double[5];
	   double sum=0;
	   System.out.print("input the binary length:");
       int n=input.nextInt();
	   System.out.print("The binary is of what base?:");
       int base=input.nextInt();
	   for(int i=0;i<n;i++) 
	   {
         System.out.print("input binary value:");
		 value[i]=input.nextInt();
		 sum=sum+Math.pow(value[i]*base,i);
	   }
	   
	  System.out.print("sum="+sum); 
	 }
 
}