package my-program;

public interface Animal {
	
	public void walk() {
		System.out.println("I'm walking with four legs");
	}
	public abstract void noise();
	public abstract void eat();

}

public class Cat implements Animal {

	public void noise() {
		System.out.println("I'm a cat meowww");
	}

	public void eat() {
		System.out.println("I'm a cat I eat fish");
	}
}

public class Dog implements Animal {
	
	public void noise() {
		System.out.println("I'm a dog rufff");
	}

	public void eat() {
		System.out.println("I'm a dog I like to eat bones");
	}
}
