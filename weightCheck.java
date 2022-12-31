import java.util.Scanner;
public class weightCheck
{
	public static void main(String [] tttt)
	{
		Scanner input=new Scanner(System.in);
		double mass,height,bmi;
		String obese=" ";
		System.out.println("This App Calculate Body Mass Index.That is weight");
		System.out.print("Enter the body mass in kg: ");
		mass=input.nextInt();
		System.out.print("Enter the body height in m^2: ");
		height=input.nextInt();
		bmi=mass/(height*height);
		obese=" ";
		
		if(bmi<18.5)obese="you are under weight";
			else if(bmi>=18.5 && bmi<=24.9)obese="your weight falls in normal range which is good for your health";
			     else if(bmi>=25 && bmi<=30)obese="you are becoming obese";
				     else obese="you are obese";
		System.out.print("BMI is ="+bmi+"kgm^2 "+obese);			 
	}
}