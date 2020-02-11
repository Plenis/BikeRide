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
        System.out.println("MountainBike Speed: " + mountainBike.currentSpeed());

        assertEquals(14, mountainBike.currentSpeed());
    }

    @Test
    public void shouldExecuteRideOne() {
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
        bikeRide.rideOne();
        System.out.println("MountainBike Speed: " + mountainBike.currentSpeed());

        assertEquals(69, mountainBike.currentSpeed());
    }

    @Test
    public void shouldExecuteRideTwo() {
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
        bikeRide.rideTwo();
        System.out.println("MountainBike Speed: " + mountainBike.currentSpeed());

        assertEquals(-6, mountainBike.currentSpeed());
    }

    @Test
    public void shouldStop(){
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
        bikeRide.ride();

        System.out.println("MountainBike Speed: " + mountainBike.currentSpeed());
        //bikeRide.stop();
        mountainBike.stop();
        assertEquals(0, mountainBike.currentSpeed());
    }
}