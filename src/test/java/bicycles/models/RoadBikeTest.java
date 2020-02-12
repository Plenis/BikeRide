package bicycles.models;

import bicycles.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadBikeTest {

  @Test
   public void shouldAccelerate() {
    BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
    BicycleFromSpec bicycles = new BicycleFromSpec(roadBikeSpec);
    BikeRide bikeRide = new BikeRideOne(bicycles);
//      BicycleType bicycleType = new BicycleType(bicycles)
      bikeRide.ride();

        System.out.println("Ride Speed: " + bikeRide.currentSpeed());

    assertEquals(36, bikeRide.currentSpeed());

  }

    @Test
    public void shouldExecuteRideOne() {
      BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
      BicycleFromSpec bicycles = new BicycleFromSpec(roadBikeSpec);
      BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.rideOne();
        System.out.println("RideOne Speed: " + bikeRide.currentSpeed());

        assertEquals(157, bikeRide.currentSpeed());
    }


    @Test
    public void shouldExecuteRideTwo() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleFromSpec bicycles = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.rideTwo();

        System.out.println("RideTwo Speed: " + bikeRide.currentSpeed());

        assertEquals(18, bikeRide.currentSpeed());
    }

    @Test
    public void shouldStop(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycles bicycles = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.ride();
        System.out.println("RoadBikeStop Speed: " + bikeRide.currentSpeed());

        bikeRide.stop();
        assertEquals(0, bikeRide.currentSpeed());
    }

}