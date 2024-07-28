package koans.english;

public class AboutMoreMethods {
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }

    public static int min(int x, int y) {
        return x < y ? x : y;
    }

    public static int remainder(int x, int y) {
        return x % y;
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static boolean isMultiple(int x, int y) {
        return x % y == 0;
    }

    public static void fizzBuzz(int x) {
        if (isMultiple(x, 3) && isMultiple(x, 5)) {
            System.out.println("FizzBuzz");
        } else if (isMultiple(x, 3)) {
            System.out.println("Fizz");
        } else if (isMultiple(x, 5)) {
            System.out.println("Buzz");
        } else {
            System.out.println(x);
        }
    }
}
