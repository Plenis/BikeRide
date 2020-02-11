package bicycles.models;

import bicycles.BikeRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MountainBikeTest {
    @Test
    public void shouldAccelerate() {
        //MountainBike
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
       bikeRide.ride();
        System.out.println("Current Speed: " + mountainBike.currentSpeed());

        assertEquals(14, mountainBike.currentSpeed());
    }


    @Test
    public void shouldStop(){
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
        bikeRide.ride();

        System.out.println("Current Speed: " + mountainBike.currentSpeed());
        //bikeRide.stop();
        mountainBike.stop();
        assertEquals(0, mountainBike.currentSpeed());
    }
}