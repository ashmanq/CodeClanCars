import org.junit.Before;
import org.junit.Test;
import owners.Dealership;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;

    @Before
    public void before() {
        dealership = new Dealership("Ian Skelly's");
        Vehicle car = new Car("Mustang", "Blue", 25000.00);
        Vehicle car2 = new Car("Dodge Viper", "Red", 25000.00);
        Vehicle car3 = new Car("Nissan GTR", "Garish Green", 25000.00);
        Vehicle electricCar = new ElectricCar("Tesla Model 3", "Red", 40000.00);
        Vehicle electricCar2 = new ElectricCar("Nissan Leaf", "Silver", 30000.00);
        Vehicle electricCar3 = new ElectricCar("Tesla Truck", "Black", 60000.00);

        dealership.addVehicle(car);
        dealership.addVehicle(car2);
        dealership.addVehicle(car3);
        dealership.addVehicle(electricCar);
        dealership.addVehicle(electricCar2);
        dealership.addVehicle(electricCar3);
    }

    @Test
    public void hasName() {
        assertEquals("Ian Skelly's", dealership.getName());
    }

    @Test
    public void tillStartsAtZero() {
        assertEquals(0, dealership.getTill(), 0.01);
    }

    @Test
    public void canGetVehicles() {
        assertEquals(6, dealership.getStock().size());
    }
}
