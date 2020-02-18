package bicycles.models;

import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import bicycles.specification.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadBikeTest {

    @Test
    public void shouldExecuteRideOne() {
      BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
      BicycleFromSpec bicycles = new BicycleFromSpec(roadBikeSpec);
      BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.ride();

        assertEquals(36, bikeRide.currentSpeed());
    }


    @Test
    public void shouldExecuteRideTwo() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        BicycleFromSpec bicycles = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideTwo(bicycles);
        bikeRide.ride();

        assertEquals(157, bikeRide.currentSpeed());
    }


    @Test
    public void shouldExecuteRideThree() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        BicycleFromSpec bicycles = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideThree(bicycles);
        bikeRide.ride();

        assertEquals(18, bikeRide.currentSpeed());
    }

    @Test
    public void shouldStop(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycles = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.ride();

        bikeRide.stop();
        assertEquals(0, bikeRide.currentSpeed());
    }

}