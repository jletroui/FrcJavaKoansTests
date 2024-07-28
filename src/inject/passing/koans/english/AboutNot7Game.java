package koans.english;

import static engine.Helpers.random;
import static engine.Helpers.readLine;

public class AboutNot7Game {
    public static int die6() {
        return (int)Math.ceil(random()*6);
    }

    public static boolean askQuestion(String question) {
        System.out.println(question);
        return readLine().equals("y");
    }

    public static int throwDice() {
        var d1 = die6();
        var d2 = die6();
        System.out.printf("You threw %s and %s.%n", d1, d2);
        return d1+d2;
    }

    public static void gameRoundv1() {
        throwDice();
        while (askQuestion("Do you want to throw again [y/n]?")) {
            throwDice();
        }
    }

    public static void gameRoundv2() {
        var sum = 0;
        var again = true;
        while (again) {
            sum += throwDice();
            System.out.printf("Your result so far: %s.%n", sum);
            again = askQuestion("Do you want to throw again [y/n]?");
        }
    }

    public static int gameRoundv3() {
        var sum = 0;
        var again = true;
        while (again) {
            sum += throwDice();
            System.out.printf("Your result so far: %s.%n", sum);
            again = askQuestion("Do you want to throw again [y/n]?");
        }
        return sum;
    }

    public static int gameRoundv4() {
        var sum = 0;
        var again = true;
        while (again) {
            var thisRoundResult = throwDice();
            if (thisRoundResult == 7) {
                System.out.println("Oh no, Not 7! You lose!");
                System.out.println();
                return 0;
            }
            sum += thisRoundResult;
            System.out.printf("Your result so far: %s.%n", sum);
            again = askQuestion("Do you want to throw again [y/n]?");
        }
        return sum;
    }

    public static int gameRoundv5() {
        var sum = 0;
        var again = true;
        while (again) {
            var thisRoundResult = throwDice();
            if (thisRoundResult == 7) {
                System.out.println("Oh no, Not 7! You lose!");
                System.out.println();
                return 0;
            }
            sum += thisRoundResult;
            System.out.printf("Your result so far: %s.%n", sum);
            again = askQuestion("Do you want to throw again [y/n]?");
        }
        System.out.println();
        System.out.printf("Well done, your score is %s!%n", sum);
        System.out.println();
        return sum;
    }

    public static void not7Gamev1() {
        System.out.println("Player 1, it's your turn!");
        System.out.println();
        gameRoundv5();
        System.out.println("Player 2, it's your turn!");
        System.out.println();
        gameRoundv5();
    }

    public static void not7Gamev2() {
        System.out.println("Player 1, it's your turn!");
        System.out.println();
        var p1Score = gameRoundv5();
        System.out.println("Player 2, it's your turn!");
        System.out.println();
        var p2Score = gameRoundv5();

        if (p1Score == p2Score) {
            System.out.println("Tie!");
        } else if (p1Score > p2Score) {
            System.out.println("Congratulations, player 1 wins!!!");
        } else {
            System.out.println("Congratulations, player 2 wins!!!");
        }
    }
}
