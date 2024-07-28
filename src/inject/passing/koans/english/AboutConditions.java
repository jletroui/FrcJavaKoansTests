package koans.english;

public class AboutConditions {
    public static String sign(int x) {
        return x >= 0 ? "positive" : "negative";
    }

    public static String signOrZero(int x) {
        return x > 0 ? "positive" : x < 0 ? "negative" : "zero";
    }

    public static String gradeComment(int grade) {
        if (grade < 0 || grade > 100) {
            return "You cheat!";
        }
        if (grade == 0) {
            return "Oops!";
        }
        if (grade == 100) {
            return "Congratulations! You got everything right!";
        }
        if (grade < 60) {
            return "You failed!";
        }
        return "Congratulations! You pass!";
    }
}
