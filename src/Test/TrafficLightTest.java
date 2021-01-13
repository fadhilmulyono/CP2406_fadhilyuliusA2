package Test;

import Model.Road;
import Model.TrafficLight;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrafficLightTest {
    Model.Road road = new Model.Road("0", 1, 5, new int[]{0, 0}, Road.Orientation.VERTICAL);
    Model.TrafficLight light = new TrafficLight("0", road);

    @Test
    void testOperate(){
        light.operate(3515);
        assertEquals("green", light.getState());
    }

    @Test
    void getState(){
        assertEquals("red", light.getState());
    }

    @Test
    void getRoad(){
        assertEquals(road, light.getRoadAttachedTo());
    }

    @Test
    void getPosition(){
        assertEquals(5, light.getPosition());
    }

    @Test
    void getId(){
        assertEquals("light_0", light.getId());
    }

}
