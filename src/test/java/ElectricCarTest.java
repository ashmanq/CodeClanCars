import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before() {
        electricCar = new ElectricCar("Tesla", "Black", 40000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Tesla", electricCar.getName());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", electricCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(40000.00, electricCar.getPrice(), 0.01);
    }

    @Test
    public void hasComponents() {
        assertEquals(2, electricCar.getComponents().size());
    }

}
