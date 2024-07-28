package bonuses.english;

import java.util.List;
import java.util.function.IntPredicate;

import bonuses.teachingmaterial.Combining;
import engine.Locale;
import engine.Sensei;
import sensei.AboutInterfacesKoans;

public class AboutInterfaces {
    public static Combining getAnonymousCombining() {
        return new Combining() {
            public int combine(int a, int b) {
                return a - b;
            }
        };
    }

    public static Combining getLambdaCombining() {
        return (a, b) -> b - a;
    }

    public static IntPredicate getIsEven() {
        return (x) -> x%2==0;
    }
}
