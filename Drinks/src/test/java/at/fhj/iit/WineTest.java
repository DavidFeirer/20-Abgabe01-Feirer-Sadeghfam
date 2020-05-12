package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing for the class Wine
 */
@DisplayName("Testing Wine implementation")
public class WineTest {
    private Wine w1, w2, r1, s1;

    /**
     * Init Wine
     */
    @BeforeEach
    void setup() {
        ArrayList<String> w1Taste = new ArrayList<String>();
        w1Taste.add("würzig");
        w1Taste.add("trocken");
        ArrayList<String> w1Dishes = new ArrayList<String>();
        w1Dishes.add("Fisch");

        ArrayList<String> r1Taste = new ArrayList<String>();
        r1Taste.add("süß");
        r1Taste.add("trocken");
        ArrayList<String> r1Dishes = new ArrayList<String>();
        r1Taste.add("Fleisch");

        ArrayList<String> s1Taste = new ArrayList<String>();
        s1Taste.add("spritzig");
        s1Taste.add("trocken");
        ArrayList<String> s1Dishes = new ArrayList<String>();

        w1 = new Wine("Gelber Muskateller", new Liquid("Gelber Muskateller", 0.7, 9.0),
                w1Taste,"white", w1Dishes, 12);
        w2 = new Wine("Weißburgunder", new Liquid("Weißburgunder", 0.7, 10.5),
                w1Taste,"white", w1Dishes, 19);
        r1 = new Wine("Zweigelt", new Liquid("Zweigelt", 0.7, 11.5),
                r1Taste,"red", r1Dishes, 15);
        s1 = new Wine("Frizzante", new Liquid("Frizzante", 1.0, 9.5),
                s1Taste,"sparkling", s1Dishes, 9);
    }

    /**
     * testing constructure
     */
    @Test
    @DisplayName("Testing constructor")
    public void testConstructorWine(){
        assertEquals(w1.getName(), "Gelber Muskateller");
        assertEquals(w1.getVolume(), 0.7, 0.001);
        assertEquals(w1.getAlcoholPercent(), 9.0, 0.001);
        assertEquals(w1.getTasteString(), "würzigtrocken");
        assertEquals(w1.getColor(), "white");
        assertEquals(w1.getDishesString(), "Fisch");
        assertEquals(w1.getTemp(), 12, 0.001);
    }

    /**
     * testing serve with a white wine that cant be served
     */
    @Test
    @DisplayName("Testing serve()")
    public void testWhiteServeThrow(){
        assertThrows(TempException.class, ()->{w2.serve();});
    }
    /**
     * testing serve with a red wine that can be served
     */
    @Test
    @DisplayName("Testing serve()")
    public void testRedServeNoThrow(){
        assertDoesNotThrow(()->{r1.serve();}, "Wine cannot be served please check the Temperature");
    }
    /**
     * testing serve with a sparkling wine that cant be served
     */
    @Test
    @DisplayName("Testing serve()")
    public void testSparklingServeThrow(){
        assertThrows(TempException.class, ()->{s1.serve();});
    }

}
