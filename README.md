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



Here you can see a Code snippet, which throws the `TempException`
``` 
     /**
     * Method serve
     * Serve the Wine (can throw a TempException)
     */
    public String serve() throws TempException {
        switch (this.color) {
            case "white":
                if (this.temp >= 9 && this.temp <= 14) {
                    return this.name + " was served with a temperature of " + this.temp;
                }
                break;
            case "red":
                if (this.temp >= 12 && this.temp <= 18) {
                    return this.name + " was served with a temperature of " + this.temp;
                }
                break;

            case "sparkling":
                if (this.temp >= 6 && this.temp <= 7) {
                    return this.name + " was served with a temperature of " + this.temp;
                }
                break;
            default: break;
        }
        throw new TempException();
    }```
```