package mypackage;

import java.util.Scanner;
import java.util.InputMismatchException;


class myprogram {
	public static void main(String args[]){
	
		Scanner myScan = new Scanner(System.in);
		String choice;
		Animal myAnimal;
	
	while (true) {
		try{

			System.out.println("Do you want to be a dog or cat?");
			choice = myScan.nextLine();

			if (choice.equals("cat")) {
				 myAnimal = new Cat();
				 break;
			}
			else if(choice.equals("dog")) {
				 myAnimal = new Dog();
				 break;
			}
			else {
				throw new NotCatOrDog("Need to choose cat or dog");
			}

		}
		catch (InputMismatchException e) {
			System.out.println("Not a valid input try agian.");
			//myScan.nextLine();
			continue;
		}
		catch (NotCatOrDog e) {
			System.out.println("You did not choose dog or cat!");
			//myScan.nextLine();
			continue;
		}
	}

	myAnimal.noise();
	myAnimal.eat();
	myAnimal.walk();

	myScan.close();
	}
}
