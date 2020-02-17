package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunRideTest {

    @Test
    public void shouldGetEnteredCount() {
        FunRide funRide = new FunRide(3);

        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.Tandem);

        BicycleFromSpec roadBikeFromSpec = new BicycleFromSpec(roadBike);
        BicycleFromSpec mountainBikeFromSpec = new BicycleFromSpec(mountainBike);
        BicycleFromSpec tandemFromSpec = new BicycleFromSpec(tandem);

        funRide.accept(roadBikeFromSpec);
        funRide.accept(mountainBikeFromSpec);
        funRide.accept(tandemFromSpec);

        System.out.println("getEnteredCount: " + funRide.getEnteredCount());
        assertEquals(3, funRide.getEnteredCount());
    }

    @Test
    public void shouldGetCountForType() {
        FunRide funRide = new FunRide(5);

        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification roadBike1 = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification roadBike2 = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.Tandem);

        BicycleFromSpec roadBikeFromSpec = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBikeFromSpec1 = new BicycleFromSpec(roadBike1);
        BicycleFromSpec roadBikeFromSpec2 = new BicycleFromSpec(roadBike2);
        BicycleFromSpec mountainBikeFromSpec = new BicycleFromSpec(mountainBike);
        BicycleFromSpec tandemFromSpec = new BicycleFromSpec(tandem);

        funRide.accept(roadBikeFromSpec);
        funRide.accept(roadBikeFromSpec1);
        funRide.accept(roadBikeFromSpec2);
        funRide.accept(mountainBikeFromSpec);
        funRide.accept(tandemFromSpec);

        System.out.println("getCountForType: " + funRide.getCountForType(BicycleType.RoadBike));
        assertEquals(3, funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test
    public void shouldGetEnteredBikeCount(){
        FunRide funRide = new FunRide(7);

        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification roadBike1 = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification roadBike2 = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification mountainBike1 = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleSpecification tandem1 = new BicycleSpecification(12, -7, BicycleType.Tandem);

        BicycleFromSpec roadBikeFromSpec = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBikeFromSpec1 = new BicycleFromSpec(roadBike1);
        BicycleFromSpec roadBikeFromSpec2 = new BicycleFromSpec(roadBike2);
        BicycleFromSpec mountainBikeFromSpec = new BicycleFromSpec(mountainBike);
        BicycleFromSpec mountainBikeFromSpec1 = new BicycleFromSpec(mountainBike1);
        BicycleFromSpec tandemFromSpec = new BicycleFromSpec(tandem);
        BicycleFromSpec tandemFromSpec1 = new BicycleFromSpec(tandem1);

        funRide.accept(roadBikeFromSpec);
        funRide.accept(roadBikeFromSpec1);
        funRide.accept(roadBikeFromSpec2);
        funRide.accept(mountainBikeFromSpec);
        funRide.accept(mountainBikeFromSpec1);
        funRide.accept(tandemFromSpec);
        funRide.accept(tandemFromSpec1);

        System.out.println("getEnteredCount: " + funRide.getEnteredCount());
        assertEquals(7, funRide.getEnteredCount());
    }

 }