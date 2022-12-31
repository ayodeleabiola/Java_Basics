import java.util.Scanner;
public class Switch1
{
	public static void main(String[] rrr)
	{
		Scanner input=new Scanner(System.in);
		int numer1,number2;
		System.out.print("\n"+"This is logic addition and Multiplication App");
		System.out.print("Enter number1: ");
		number1=input.nextInt();
		System.out.print("Enter number2: ");
		int sum=number1+number2;
		String comment=""
		
		Switch(sum)
		case sum<=30:
		result=sum+3;
		comment="3 was added based on the condition set";
		case sum>40:
		result=sum*5;
		comment="5 was multiplied based on the condition set";
		
		System.out.print("result= "+result);
	}
}