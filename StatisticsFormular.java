
//package statistics.formular;
import java.util.*;

public class StatisticsFormular {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter input for x: ");
        double x=input.nextInt();
        double result=StdStats.plotBars(pdf(x));
		System.out.print("Result:"+result);
        
    }
    
    public static double pdf(double x){
        return Math.exp(-x*x / 2) / Math.sqrt(2 * Math.PI);
    }
    
}