package koans.english;

public class AboutLoops {
    public static void helloNTimes(int n) {
        for(int i=0; i<n; i++) {
            System.out.println("Hello");
        }
    }

    public static void displayNumbers(int n) {
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }
    }

    public static void displayReverseNumbers(int n) {
        for(int i=n; i>0; i--) {
            System.out.println(i);
        }
    }

    public static void sevens(int n) {
        int x = 7;
        while (x <= n) {
            System.out.println(x);
            x += 7;
        }
    }

    public static void sevensOrEights(int n) {
        int x = 1;
        while (x <= n) {
            if ((x%7 == 0) ||(x%8 == 0)) {
                System.out.println(x);
            }
            x++;
        }
    }

    public static int exponent(int x, int exp) {
        int res = 1;
        for(int i=0; i<exp; i++) {
            res*=x;
        }
        return res;
    }

    public static int exponent2(int x, int exp) {
        int res = 1;
        for(int i=0; i<exp; i++) {
            res*=x;
        }
        return res;
    }

    public static int factorial(int n) {
        int res = 1;
        for(int i=2; i<=n; i++) {
            res*=i;
        }
        return res;
    }
}
