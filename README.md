# Testing companion project for [FRC Java Koans](https://github.com/jletroui/FrcJavaKoans)

Testing the FRC Java Koans is a bit challenging for a few reasons:

- by design, it has no build tool, nor any dependency
- testing the koans themselves means replacing the classes in `koans/`
- we do not want to show some solutions to students!

Therefore, despite engine unit and integration tests being included in the main project, testing the koans require a new project, this one.

## Approach

For now, we only test passing solutions. We import the engine and koans from the main project, replace solution classes, and make sure all the koans are passing for all locales.

## How to run

Prerequisite: you need git and a JDK 17+. For example, on Windows, using [Chocolatey](https://chocolatey.org/install):

    choco install -y corretto21jdk git

Then, in a terminal:

    git clone https://github.com/jletroui/FrcJavaKoans
    git clone https://github.com/jletroui/FrcJavaKoansTests
    cd FrcJavaKoansTests
    .\gradlew.bat :run

Which hopefully should show you something close to:

```
> Task :run
All koans passing for all locales.

BUILD SUCCESSFUL in 1m 1s
4 actionable tasks: 2 executed, 2 up-to-date
```

## TODO

Test also non-passing solutions, to assert that the right messages are shown.

## License

![CC BY-SA](https://i.creativecommons.org/l/by-sa/4.0/88x31.png) This work is licensed under a [Creative Commons Attribution-ShareAlike 4.0 International License](https://creativecommons.org/licenses/by-sa/4.0/).
