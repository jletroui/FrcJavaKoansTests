package koans.french;

public class AboutConditions {
    public static String sign(int x) {
        return x >= 0 ? "positif" : "négatif";
    }

    public static String signOrZero(int x) {
        return x > 0 ? "positif" : x < 0 ? "négatif" : "zéro";
    }

    public static String gradeComment(int grade) {
        if (grade < 0 || grade > 100) {
            return "Tu triches!";
        }
        if (grade == 0) {
            return "Ouch!";
        }
        if (grade == 100) {
            return "Bravo, tu as tout bon!";
        }
        if (grade < 60) {
            return "Échec!";
        }
        return "Bravo, tu passes!";
    }
}
