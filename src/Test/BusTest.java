package Test;

import Model.Road;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BusTest {
    Model.Road road = new Model.Road("0", 1, 5, new int[]{0, 0}, Road.Orientation.VERTICAL);
    Model.Bus bus = new Model.Bus("0", road);

    @Test
    void getLength(){
        assertEquals(12, bus.getLength());
    }

    @Test
    void getId(){
        assertEquals("bus_0", bus.getId());
    }

    @Test
    void testInheritance(){
        assertEquals(0, bus.getSpeed());
        assertEquals(-12, bus.getPosition());
    }
}
