package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing SimpleDrink implementation")
public class SimpleDrinkTest {

    private SimpleDrink beer, limo, beer2;

    /**
     * inits an alcoholic and nonalcoholic liquid for EACH test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        beer = new SimpleDrink("Puntigamer", new Liquid("Bier", 0.5, 5.0));
        limo = new SimpleDrink("Fanta", new Liquid("Orangenlimo", 1.0, 0.0));
        beer2 = new SimpleDrink();
    }

    /**
     * Testing the Constructure for an alcoholic liquid (beer)
     */
    @Test
    @DisplayName("Testing constructor Limo")
    public void testConstructorAlcoholic(){
        assertEquals("Puntigamer", beer.getName());
        assertEquals(0.5, beer.getVolume(), 0.001);
        assertEquals(5.0, beer.getAlcoholPercent(), 0.001);
        assertTrue(beer.isAlcoholic());
    }

    /**
     * Testing the Constructure for an nonalcoholic liquid (Limo)
     */
    @Test
    @DisplayName("Testing constructor limo")
    public void testConstructorNonalcoholic(){
        assertEquals("Fanta", limo.getName());
        assertEquals(1.0, limo.getVolume(), 0.001);
        assertEquals(0.0, limo.getAlcoholPercent(), 0.001);
        assertFalse(limo.isAlcoholic());
    }
    /**
     *  Testing default constructures
     */
    @Test
    @DisplayName("Testing default constructor")
    public void testDefaultConstructure(){
        try{
            assertEquals(beer2.getVolume(), null);
            assertEquals(beer2.getAlcoholPercent(), null);
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
