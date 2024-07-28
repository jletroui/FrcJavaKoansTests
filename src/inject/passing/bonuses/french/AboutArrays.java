package bonuses.french;

import java.util.List;

import engine.Locale;
import engine.Sensei;
import sensei.AboutArraysKoans;

public class AboutArrays {
    public static void displayNumbers(int n) {
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }
    }

    public static int first(int[] array) {
        return array[0];
    }

    public static int last(int[] array) {
        return array[array.length-1];
    }

    public static int findFirst(int[] array, int toFind) {
        for(int i=0; i<array.length; i++) {
            if (array[i]==toFind) {
                return i;
            }
        }
        return -1;
    }

    public static int findLast(int[] array, int toFind) {
        for(int i=array.length - 1; i>=0; i--) {
            if (array[i]==toFind) {
                return i;
            }
        }
        return -1;
    }

    public static int min(int[] array) {
        var res = Integer.MAX_VALUE;
        for(var elt : array) {
            if (elt < res) {
                res = elt;
            }
        }
        return res;
    }

    public static int min2(int[] array) {
        return min(array);
    }

    public static int sum(int[] array) {
        var res = 0;
        for(var elt : array) {
            res += elt;
        }
        return res;
    }

    public static double avg(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        double sum = 0;
        for(var elt : array) {
            sum += elt;
        }
        return sum / array.length;
    }

    public static int[] fill(int size, int value) {
        var res = new int[size];
        for(int i=0; i<size; i++) {
            res[i] = value;
        }
        return res;
    }

    public static int[] serie(int size) {
        var res = new int[size];
        for(int i=0; i<size; i++) {
            res[i] = i+1;
        }
        return res;
    }

    public static void switchFirst2(int[] array) {
        if (array.length != 2) {
            return;
        }
        var first = array[0];
        array[0] = array[1];
        array[1] = first;
    }

    public static int[] reverse(int[] array) {
        var res = new int[array.length];
        for(int i=1; i<=array.length; i++) {
            res[i - 1] = array[array.length - i];
        }
        return res;
    }
}
