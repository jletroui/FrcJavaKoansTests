package org.frc;

import engine.Koan;
import engine.Locale;
import engine.TestSensei;
import sensei.AboutArraysKoans;
import sensei.AboutInterfacesKoans;
import sensei.Wisdom;

import java.util.List;

public class Main {
    private static final List<List<List<Koan>>> ALL_SUITE_LISTS = List.of(
        Wisdom.koans,
        // Bonuses
        List.of(
            AboutArraysKoans.koans,
            AboutInterfacesKoans.koans
        )
    );

    public static class KoanFailedException extends RuntimeException {
        public final TestSensei.TestResult result;
        public KoanFailedException(TestSensei.TestResult result) {
            super(String.format("%s failed in %s", result, result.locale()));
            this.result = result;
        }
    }

    public static void main(String[] args) {
        try {
            for (var locale : Locale.values()) {
                System.setProperty("locale", locale.name());
                executeSuiteListsIn(locale);
            }
        } catch(KoanFailedException kfe) {
            System.out.printf("%s failed in %s%n", kfe.result, kfe.result.locale());
            kfe.result.displayOutputToConsole();
            System.exit(1);
        }
        System.out.println("All koans passing for all locales.");
    }

    public static void executeSuiteListsIn(Locale locale) {
        for(var suiteList: ALL_SUITE_LISTS) {
            executeSuitesIn(locale, suiteList);
        }
    }

    public static void executeSuitesIn(Locale locale, List<List<Koan>> suites) {
        for(var suite: suites) {
            executeSuiteIn(locale, suite);
        }
    }

    public static void executeSuiteIn(Locale locale, List<Koan> suite) {
        for(var koan: suite) {
            executeKoanIn(locale, koan);
        }
    }

    public static void executeKoanIn(Locale locale, Koan koan) {
        var results = TestSensei.execute(koan, locale);
        for(var result: results) {
            if (!result.succeeded()) {
                throw new KoanFailedException(result);
            }
        }
    }
}
