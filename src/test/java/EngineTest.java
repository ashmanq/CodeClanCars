import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("1.8L", "Ford V6", "Petrol");
    }

    @Test
    public void hasName() {
        assertEquals("Ford V6", engine.getName());
    }

    @Test
    public void hasModel() {
        assertEquals("1.8L", engine.getMake());
    }

    @Test
    public void hasType() {
        assertEquals("Engine", engine.getType());
    }

    @Test
    public void hasFuelType() {
        assertEquals("Petrol", engine.getFuelType());
    }
}
