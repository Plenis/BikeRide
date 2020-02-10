package bicycles.models;

import bicycles.BicycleBase;
import bicycles.Bicycles;
import bicycles.BikeRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadBikeTest {

    @Test
    public void shouldAccelerate() {
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRide(roadBike);
        bikeRide.ride();
//        System.out.println(roadBike.currentSpeed());
        System.out.println("Current Speed: " + roadBike.currentSpeed());

        assertEquals(36, roadBike.currentSpeed());
    }

    @Test
    public void shouldStop(){
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRide(roadBike);
        bikeRide.ride();
        System.out.println("Current Speed: " + roadBike.currentSpeed());

        bikeRide.stop();
        assertEquals(0, roadBike.currentSpeed());
    }
}