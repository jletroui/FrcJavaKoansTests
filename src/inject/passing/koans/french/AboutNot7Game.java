package koans.french;

import static engine.Helpers.random;
import static engine.Helpers.readLine;

public class AboutNot7Game {
    public static int die6() {
        return (int)Math.ceil(random()*6);
    }

    public static boolean askQuestion(String question) {
        System.out.println(question);
        return readLine().equals("o");
    }

    public static int throwDice() {
        var d1 = die6();
        var d2 = die6();
        System.out.printf("Vous avez lancé un %s et un %s.%n", d1, d2);
        return d1+d2;
    }

    public static void gameRoundv1() {
        throwDice();
        while (askQuestion("Voulez-vous continuer à lancer [o/n]?")) {
            throwDice();
        }
    }

    public static void gameRoundv2() {
        var sum = 0;
        var again = true;
        while (again) {
            sum += throwDice();
            System.out.printf("Votre résultat jusqu'à maintenant: %s.%n", sum);
            again = askQuestion("Voulez-vous continuer à lancer [o/n]?");
        }
    }

    public static int gameRoundv3() {
        var sum = 0;
        var again = true;
        while (again) {
            sum += throwDice();
            System.out.printf("Votre résultat jusqu'à maintenant: %s.%n", sum);
            again = askQuestion("Voulez-vous continuer à lancer [o/n]?");
        }
        return sum;
    }

    public static int gameRoundv4() {
        var sum = 0;
        var again = true;
        while (again) {
            var thisRoundResult = throwDice();
            if (thisRoundResult == 7) {
                System.out.println("Oh non, Pas 7! Vous avez perdu!");
                System.out.println();
                return 0;
            }
            sum += thisRoundResult;
            System.out.printf("Votre résultat jusqu'à maintenant: %s.%n", sum);
            again = askQuestion("Voulez-vous continuer à lancer [o/n]?");
        }
        return sum;
    }

    public static int gameRoundv5() {
        var sum = 0;
        var again = true;
        while (again) {
            var thisRoundResult = throwDice();
            if (thisRoundResult == 7) {
                System.out.println("Oh non, Pas 7! Vous avez perdu!");
                System.out.println();
                return 0;
            }
            sum += thisRoundResult;
            System.out.printf("Votre résultat jusqu'à maintenant: %s.%n", sum);
            again = askQuestion("Voulez-vous continuer à lancer [o/n]?");
        }
        System.out.println();
        System.out.printf("Bravo, votre score est %s!%n", sum);
        System.out.println();
        return sum;
    }

    public static void not7Gamev1() {
        System.out.println("Joueur 1, c'est votre tour!");
        System.out.println();
        gameRoundv5();
        System.out.println("Joueur 2, c'est votre tour!");
        System.out.println();
        gameRoundv5();
    }

    public static void not7Gamev2() {
        System.out.println("Joueur 1, c'est votre tour!");
        System.out.println();
        var p1Score = gameRoundv5();
        System.out.println("Joueur 2, c'est votre tour!");
        System.out.println();
        var p2Score = gameRoundv5();

        if (p1Score == p2Score) {
            System.out.println("Égalité!");
        } else if (p1Score > p2Score) {
            System.out.println("Bravo, le joueur 1 gagne!!!");
        } else {
            System.out.println("Bravo, le joueur 2 gagne!!!");
        }
    }
}
