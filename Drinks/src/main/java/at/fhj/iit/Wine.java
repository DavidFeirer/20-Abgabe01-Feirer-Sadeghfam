package at.fhj.iit;

import java.util.ArrayList;

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
     * Creating new Wine with given name, liquid, taste, color and dishes
     *
     * @param name Name of the Drink
     * @param liquid the used liquid
     * @param taste tastes of the Wine
     * @param color color of the Wine
     * @param dishes dish were the Wine is served to
     */
    Wine(String name, Liquid liquid, ArrayList<String> taste, String color, ArrayList<String> dishes){
        super(name, liquid);
        this.taste = taste;
        this.color = color;
        this.dishes = dishes;
    }

    /**
     * Getter taste of wine
     *
     * @return taste of wine
     */
    public ArrayList<String> getTaste() {
        return taste;
    }


    /**
     * Setter for the taste
     *
     * @param taste new taste
     */
    public void setTaste(ArrayList<String> taste) {
        this.taste = taste;
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
     * Getter dishes the wine is served to
     *
     * @return dishes
     */
    public ArrayList<String> getDishes() {
        return dishes;
    }

    /**
     * Setter for the dishes the wine is served to
     *
     * @param dishes new dishes
     */
    public void setDishes(ArrayList<String> dishes) {
        this.dishes = dishes;
    }


    }
