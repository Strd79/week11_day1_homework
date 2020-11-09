import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takeDrink() {
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void isEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void isBackToFull() {
        waterBottle.drink();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
