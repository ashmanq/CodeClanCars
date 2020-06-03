import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new Car("Mustang", "Red", 25000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Mustang", car.getName());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", car.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(25000.00, car.getPrice(), 0.01);
    }

    @Test
    public void hasComponents() {
        assertEquals(2, car.getComponents().size());
    }

}
