package at.fhj.iit;

import javax.naming.directory.AttributeModificationException;
import java.util.ArrayList;

/**
 * Class Wine extends Simple Drink
 */
public class Wine extends SimpleDrink{

    /**
     *  taste of wine (String)
     */
    private ArrayList<String> taste;

    /**
     *  Color of Wine (String)
     */
    private String color;

    /**
     * dishes where the wine is served to (String)
     */
    private ArrayList<String> dishes;

    /**
     * temperature of the wine in Celsius
     */
    private int temp;

    /**
     * Creating new Wine with given name, liquid, taste, color and dishes
     *
     * @param name Name of the Drink
     * @param liquid the used liquid
     * @param taste tastes of the Wine
     * @param color color of the Wine
     * @param dishes dish were the Wine is served to
     * @param temp temperature of the wine
     */
    Wine(String name, Liquid liquid, ArrayList<String> taste, String color, ArrayList<String> dishes, int temp){
        super(name, liquid);
        this.taste = taste;
        this.color = color;
        this.dishes = dishes;
        this.temp = temp;
    }

    /**
     * Get the List Taste in String
     */
    public String getTasteString(){
        String ret = "";
        for (int i = 0; i < taste.size(); i++){
            ret += taste.get(i);
        }
        return ret;
    }

    /**
     * Get the List Taste in String
     */
    public String getDishesString(){
        String ret = "";
        for (int i = 0; i < dishes.size(); i++){
            ret += dishes.get(i);
        }
        return ret;
    }

    /**
     * Getter color of wine
     *
     * @return color of wine
     *
     */
    public String getColor() {
            return color;
    }

    /**
     * Setter for the color
     *
     * @param color new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for the temperature of wine
     *
     * @return temp
     */
    public int getTemp() { return this.temp;}

    /**
     * Setter for the temperature of Wine
     *
     * @param temp new temp
     */
    public void setTemp(int temp) {
        this.temp = temp;
    }

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
    }

}
