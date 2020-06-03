import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres("Pirelli", "P9", 4);
    }

    @Test
    public void hasName() {
        assertEquals("P9", tyres.getName());
    }

    @Test
    public void hasModel() {
        assertEquals("Pirelli", tyres.getMake());
    }

    @Test
    public void hasType() {
        assertEquals("Tyres", tyres.getType());
    }

    @Test
    public void hasNoOfTyres() {
        assertEquals(4, tyres.getNoOfTyres());
    }
}
