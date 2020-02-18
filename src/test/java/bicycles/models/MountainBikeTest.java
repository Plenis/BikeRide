package bicycles.models;

import bicycles.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MountainBikeTest {
    @Test
    public void shouldAccelerate() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();
        System.out.println("Ride Speed: " + mBikeRide.currentSpeed());

        assertEquals(14, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldExecuteRideOne() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.rideOne();
        System.out.println("RideOne Speed: " + mBikeRide.currentSpeed());

        assertEquals(69, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldExecuteRideTwo() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification( BicycleType.MountainBike);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.rideTwo();
        System.out.println("RideTwo Speed: " + mBikeRide.currentSpeed());

        assertEquals(-6, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldStop(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();
        System.out.println("RideBikeStop Speed: " + mBikeRide.currentSpeed());
        mBikeRide.stop();
        assertEquals(0, mountainBike.currentSpeed());
    }
}