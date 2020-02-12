package bicycles.models;

import bicycles.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TandemTest {
    @Test
    public void shouldAccelerate() {
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleFromSpec bicycles = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideOne(bicycles);

        bikeRide.ride();
        System.out.println("Tandem Speed: " + bikeRide.currentSpeed());

        assertEquals(34, bikeRide.currentSpeed());
   }

    @Test
    public void shouldExecuteRideOne() {
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleFromSpec bicycles = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.rideOne();
        System.out.println("TandemOne Speed: " + bikeRide.currentSpeed());

        assertEquals(166, bikeRide.currentSpeed());
    }

    @Test
    public void shouldExecuteRideTwo(){
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleFromSpec bicycles = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.rideTwo();
        System.out.println("TandemTwo Speed: " + bikeRide.currentSpeed());

        assertEquals(-12, bikeRide.currentSpeed());
    }

    @Test
    public void shouldStop(){
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleFromSpec bicycles = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.rideTwo();
        bikeRide.stop();

        System.out.println("TandemStop Speed: " + bikeRide.currentSpeed());
        assertEquals(0, bikeRide.currentSpeed());
    }
}