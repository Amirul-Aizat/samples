package calculator;
import java.util.Scanner;

public class calculatorChanger {
    
	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
	
		double actWeight, weightInMars;
		
		System.out.print("Enter the actual weight on Earth (kg) : ");
		actWeight=x.nextDouble();
		
		weightInMars=(actWeight/9.81)*3.711;
		
		System.out.println("\nThe weight on Earth (kg) : " + actWeight);
		System.out.println("The weight on Mars (kg) : " + weightInMars);	
	}	
}
