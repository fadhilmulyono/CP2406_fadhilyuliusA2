package Test;

import Model.Road;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
    Model.Road road = new Model.Road("0", 1, 5, new int[]{0, 0}, Road.Orientation.VERTICAL);
    Model.Car car = new Model.Car("0", road);

    @Test
    void testMove(){
        car.move();
        assertEquals(-3, car.getPosition());
    }

    @Test
    void getLength(){ assertEquals(4, car.getLength()); }

    @Test
    void getWidth(){
        assertEquals(2.0, car.getWidth());
    }

    @Test
    void getSpeed(){
        assertEquals(0, car.getSpeed());
    }

    @Test
    void getPosition(){
        assertEquals(-4, car.getPosition());
    }

    @Test
    void getRoad(){
        assertEquals(road, car.getCurrentRoad());
    }

    @Test
    void getId(){
        assertEquals("car_0", car.getId());
    }
}
