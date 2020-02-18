package bicycles.rides;

import bicycles.models.BicycleType;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideTest {

    @Test
    public void shouldExecuteBikeRideOne(){
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec mountainBikeSpec = new BicycleFromSpec(mountainBike);
        BikeRide mBike = new BikeRideOne(mountainBikeSpec);

        mBike.ride();
        assertEquals(14, mBike.currentSpeed());
    }

    @Test
    public void shouldExecuteBikeRideTwo(){
        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        BicycleFromSpec roadBikeSpec = new BicycleFromSpec(roadBike);
        BikeRide rBike = new BikeRideTwo(roadBikeSpec);

        rBike.ride();
        assertEquals(157, rBike.currentSpeed());
    }

    @Test
    public void shouldExecuteBikeRideThree(){
        BicycleSpecification tandemBike = new BicycleSpecification(BicycleType.Tandem);
        BicycleFromSpec tandemBikeSpec = new BicycleFromSpec(tandemBike);
        BikeRide tBike = new BikeRideThree(tandemBikeSpec);

        tBike.ride();
        assertEquals(0, tBike.currentSpeed());
    }
}