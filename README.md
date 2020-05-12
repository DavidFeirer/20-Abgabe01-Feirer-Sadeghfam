# Software Configuration Management #

## Project01: Testing ###

Members:
* [David Feirer](https://github.com/DavidFeirer)
* [Mehrad Sadeghfam](https://github.com/Mehrad876)

Our first Project is about writing a code in a team and testing it.
We will use IntelliJ to write the code. The testing will be done with JUnit5.



### Wine ###

We want to make a subclass from `SimpleDrink` that is called `Wine`.
Wine will have 4 Membervariables:

* taste (which representes the taste of the Wine)
* color (represents the color/type of Wine)
* dishes (representes the dishes the Wine is served to)
* temp (representes the temperature of the Wine)

The class `Wine`will also have `getter/setter` for each variable.
We will also implement a method called `serve` it will check the temperature of the Wine and can also throw a `TempException`, if the Temperature is to high/low for the type of wine.
