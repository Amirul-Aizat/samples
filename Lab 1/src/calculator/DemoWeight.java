package calculator;
import java.util.Scanner;

public class DemoWeight {

	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	
	Person person1 = new Person();//object for person class
	
	System.out.print("\nEnter the weight on Earth (kg) : ");
	double weight = sc.nextDouble();
	person1.setWeightOnEarth(weight);
	
	sc.close();
	
	//to convert the weight on Earth to Mars
	Converter weightConverter = new Converter();
	int weightInInt = ((int)(weightConverter.getWeightOnMars(person1.getWeightOnEarth()*100))+5);//simple decimal point converter
	person1.setWeightOnMars((double)weightInInt/100);// set the value to human attribute
	
	//display the weight on earth and weight on mars
	System.out.println("\nThe weight on Earth (kg) : "+person1.getWeightOnEarth());
	System.out.println("\nThe weight on Mars  (kg) : "+person1.getWeightOnMars());

	}
}