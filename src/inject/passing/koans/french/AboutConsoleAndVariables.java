package koans.french;

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
		System.out.println("Quel est ton nom?");
		var name = readLine();
		System.out.println("Ton nom est:");
		System.out.println(name);
	}

	public static void askAndDisplayNameOnASingleLineInConsole() {
		System.out.println("Quel est ton nom?");
		var name = readLine();
		System.out.println("Ton nom est: " + name);
	}

	public static void askNameAndAgeInConsole() {
		System.out.println("Quel est ton nom?");
		var name = readLine();
		System.out.println("Quel âge as tu?");
		var age = readLine();
		System.out.println("Ton nom est " + name + " et ton âge est " + age + " ans.");
	}

	public static void computeAgeIn5YearsConsole() {
		System.out.println("Quel âge as tu?");
		var age = readLine();
		System.out.println("Dans 5 ans, tu auras " + (Integer.parseInt(age) + 5) + " ans.");
	}
}
