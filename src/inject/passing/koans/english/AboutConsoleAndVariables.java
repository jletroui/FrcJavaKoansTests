package koans.english;

import static engine.Helpers.readLine;

public class AboutConsoleAndVariables {
	public static void sayHelloInConsole() {
		System.out.println("Hello!");
	}

	public static void computeTwoAndTwo() {
		System.out.println(4);
	}

	public static void createAndDisplayAVariable() {
		System.out.println(4);
	}

	public static void createAndDisplayAStringVariable() {
		System.out.println("Hello!");
	}

	public static void askAndDisplayNameInConsole() {
		System.out.println("What is your name?");
		var name = readLine();
		System.out.println("Your name is:");
		System.out.println(name);
	}

	public static void askAndDisplayNameOnASingleLineInConsole() {
		System.out.println("What is your name?");
		var name = readLine();
		System.out.println("Your name is: " + name);
	}

	public static void askNameAndAgeInConsole() {
		System.out.println("What is your name?");
		var name = readLine();
		System.out.println("What is your age?");
		var age = readLine();
		System.out.println("Your name is " + name + " and your age is " + age + ".");
	}

	public static void computeAgeIn5YearsConsole() {
		System.out.println("What is your age?");
		var age = readLine();
		System.out.println("In 5 years from now, you will be " + (Integer.parseInt(age) + 5) + ".");
	}
}
