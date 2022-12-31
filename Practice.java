public class Practice
{
	public static void main(String[] red)
	{
		int cube[][]=new int[3][3];
		int buffer[][]=null;
		
	  for(int i=0;i<2;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			 buffer[i][j]=cube[i][j];
	           //System.out.println("["+i+","+j+","+k+"]");
			   System.out.println(" "+buffer[i][j]);
		  }
	     System.out.println(" ");
	   }
    }
}