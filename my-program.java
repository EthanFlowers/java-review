package my-program;

import java.util.Scanner;

class Main {
public static void main(string args[]){
	
	Scanner myScan = new Scanner(System.in);
	try{
		System.out.println("Do you want to be a dog or cat?");
		String choice = myScan.nextLine();
	}
	catch (Exception InputMismatchException) {
		System.out.println("Not a valid input try agian.");
		choice.nextLine();
	}
	myScan.close();

	Animal myAnimal;
	if (choice.equals("cat")) {
		myAnimal = new Cat();
	}
	else if(choice.equals("dog")) {
		myAnimal = new Dog();
	}
	else {
		System.out.println("You did not choose dog or cat!");
	}

	myAnimal.noise();
	myAnimal.eat();
}
}
