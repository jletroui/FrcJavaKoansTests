package koans.english;

import utils.MathUtils;
import utils.math.OtherMathUtils;

public class AboutClasses {
    public static void displayCube(int x) {
        System.out.println(MathUtils.cube(x));
    }

    public static void displayMax(int x, int y) {
        System.out.println(OtherMathUtils.max(x, y));
    }

    public static void displayMin(int x, int y) {
        System.out.println(AboutMoreMethods.min(x, y));
    }
}
