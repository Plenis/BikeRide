package bicycles.models;

import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TandemTest {

    @Test
    public void shouldExecuteRideOne() {
        BicycleSpecification tandemSpec = new BicycleSpecification(BicycleType.Tandem);
        BicycleFromSpec bicycles = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.ride();

        assertEquals(34, bikeRide.currentSpeed());
    }

    @Test
    public void shouldExecuteRideTwo(){
        BicycleSpecification tandemSpec = new BicycleSpecification(BicycleType.Tandem);
        BicycleFromSpec bicycles = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideTwo(bicycles);
        bikeRide.ride();

        assertEquals(166, bikeRide.currentSpeed());
    }

    @Test
    public void shouldExecuteRideThree(){
        BicycleSpecification tandemSpec = new BicycleSpecification(BicycleType.Tandem);
        BicycleFromSpec bicycles = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideThree(bicycles);
        bikeRide.ride();

        assertEquals(0, bikeRide.currentSpeed());
    }

    @Test
    public void shouldStop(){
        BicycleSpecification tandemSpec = new BicycleSpecification(BicycleType.Tandem);
        BicycleFromSpec bicycles = new BicycleFromSpec(tandemSpec);
        BikeRide bikeRide = new BikeRideOne(bicycles);
        bikeRide.ride();
        bikeRide.stop();

        assertEquals(0, bikeRide.currentSpeed());
    }
}