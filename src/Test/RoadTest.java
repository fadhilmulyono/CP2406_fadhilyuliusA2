package Test;

import Model.Road;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class RoadTest {
    Model.Road road = new Model.Road("0", 1, 5, new int[]{0, 0}, Road.Orientation.HORIZONTAL);

    @Test
    void getId(){
        assertEquals(5, road.getLength());
    }

    @Test
    void getSpeedLimit(){
        assertEquals(1, road.getSpeedLimit());
    }

    @Test
    void getLength(){
        assertEquals(5, road.getLength());
    }

    @Test
    void getStartLocation(){
        int[] expectedStart = {0,0};
        int[] actual = this.road.getStartLocation();
        assertArrayEquals(expectedStart, actual);
    }

    @Test
    void getEndLocation(){
        int[] expectedEnd = {5,0};
        assertArrayEquals(expectedEnd, road.getEndLocation());
    }

    @Test
    void getCarsOnRoad(){
        ArrayList<Model.Car> expectedCars = new ArrayList<>();
        assertEquals(expectedCars, road.getVehiclesOnRoad());
    }

    @Test
    void getLightsOnRoad(){
        ArrayList<Model.TrafficLight> expectedLights = new ArrayList<>();
        assertEquals(expectedLights, road.getLightsOnRoad());
    }

    @Test
    void getConnectedRoads(){
        ArrayList<Road> expectedRoads = new ArrayList<>();
        assertEquals(expectedRoads, road.getConnectedRoads());
    }
}
