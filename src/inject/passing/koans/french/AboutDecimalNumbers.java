package koans.french;

public class AboutDecimalNumbers {
    public static double toCm(double x) {
        return x * 2.54;
    }

    public static double toInches(double x) {
        return x / 2.54;
    }

    public static double rectangleArea(double side1, double side2) {
        return side1*side2;
    }

    public static double wheelCircumference(double wheelRadius) {
        return wheelRadius * 2 * 3.14;
    }

    public static double wheelRotations(double motorRotations, double gearRatio) {
        return motorRotations*gearRatio;
    }

    public static double toDistance(double wheelRadius, double motorRotations, double gearRatio) {
        return wheelCircumference(wheelRadius)*wheelRotations(motorRotations, gearRatio);
    }
}
