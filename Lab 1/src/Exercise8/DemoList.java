package Exercise8;
import java.util.Scanner;
public class DemoList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many person : ");
		int bilangan = sc.nextInt();// to key in into the variable for the amount of person
		
		PersonArray person = new PersonArray();
		Person[] person1 = new Person[bilangan];//to create an array for person object
		for(int i = 0;i<bilangan;i++) {
		person1[i] = new Person();
		System.out.print("\n" + (i+1) + ".The weight on earth (KG) : ");
		double weight = sc.nextDouble(); //to key in into the variable
		person1[i].setWeightOnEarth(weight);
		
		
		//to convert the weight on earth to Mars
		Converter weightConverter = new Converter(); // create object for weightConverter
		int weightInInt = ((int)(weightConverter.getWeightOnMars(person1[i].getWeightOnEarth()*100))+5);
		person1[i].setWeightOnMars((double)weightInInt/100);
		person.person.add(person1[i]);
		}
		
		//display the list after the converter process
		for(int i = 0;i<person.person.size();i++) {
			
		System.out.println("\n\n"+ (i+1) + ".The weight on Earth (kg): "+person.person.get(i).getWeightOnEarth());
		System.out.println("  The weight on Mars (kg)     : "+person.person.get(i).getWeightOnMars());
		}
		sc.close();

		
	}
}


