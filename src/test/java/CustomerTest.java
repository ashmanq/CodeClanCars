import org.junit.Before;
import org.junit.Test;
import owners.Customer;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        Vehicle car = new Car("Mustang", "Red", 25000.00);
        Vehicle electricCar = new ElectricCar("Tesla", "Black", 40000.00);
        customer = new Customer("Joe J", 50000.00);
        customer.buyVehicle(car);
        customer.buyVehicle(electricCar);
    }

    @Test
    public void hasName() {
        assertEquals("Joe J", customer.getName());
    }

    @Test
    public void hasMoney() {
        assertEquals(50000.00, customer.getMoney(), 0.01);
    }

    @Test
    public void hasVehicles() {
        assertEquals(2, customer.getVehicles().size());
    }

    @Test
    public void canBuyVehicle() {
        Vehicle electricCar2 = new ElectricCar("Nissan", "Red", 30000.00);
        customer.buyVehicle(electricCar2);
        assertEquals(3, customer.getVehicles().size());
    }

    @Test
    public void customerCanAfford() {
        assertEquals(true, customer.checkHasEnoughMoney(10000.00));
    }

    @Test
    public void customerCanNotAffort() {
        assertEquals(false, customer.checkHasEnoughMoney(100000.00));
    }
}
