package bicycles.models;

import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MountainBikeTest {

    @Test
    public void shouldExecuteBikeRideOne() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();

        assertEquals(14, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldExecuteBikeRideTwo() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification( BicycleType.MountainBike);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideTwo(mountainBike);
        mBikeRide.ride();

        assertEquals(69, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldExecuteBikeRideThree(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification( BicycleType.MountainBike);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideThree(mountainBike);
        mBikeRide.ride();

        assertEquals(0, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldStop(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();
        mBikeRide.stop();

        assertEquals(0, mountainBike.currentSpeed());
    }
}