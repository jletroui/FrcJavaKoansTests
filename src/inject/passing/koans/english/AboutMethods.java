package koans.english;

import static engine.Helpers.readLine;

public class AboutMethods {
    public static void ask(int period) {
        System.out.println("What is your age?");
		var age = readLine();
		System.out.println("In " + period + " years from now, you will be " + (Integer.parseInt(age) + period) + ".");
    }

    public static void computeAgeIn5And10And20YearsConsole() {
        ask(5);
        ask(10);
        ask(20);
    }

    public static void computeAgeIn5And10And20YearsConsoleWithMethod() {
        ask(5);
        ask(10);
        ask(20);
    }

    public static int square(int number) {
        return number * number;
    }    

    public static int opposite(int number) {
        return -number;
    }

    public static int legs(int chickenCount, int pigCount, int cowCount) {
        return chickenCount*2 + pigCount*4 + cowCount*4;
    }
}
