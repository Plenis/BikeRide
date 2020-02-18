package bicycles.rides;

import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunRideTest {

    @Test
    public void shouldAcceptDifferentBikes(){
        FunRide funRide = new FunRide((4));


        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification roadBike1 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(BicycleType.Tandem);

        BicycleFromSpec roadBikeFromSpec = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBikeFromSpec1 = new BicycleFromSpec(roadBike1);
        BicycleFromSpec mountainBikeFromSpec = new BicycleFromSpec(mountainBike);
        BicycleFromSpec tandemFromSpec = new BicycleFromSpec(tandem);

        funRide.accept(roadBikeFromSpec);
        funRide.accept(roadBikeFromSpec1);
        funRide.accept(mountainBikeFromSpec);
        funRide.accept(tandemFromSpec);

        assertEquals(4, funRide.getEnteredCount());
    }

    @Test
    public void shouldRejectSimilarBikes(){
        FunRide funRide = new FunRide((4));


        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification roadBike1 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(BicycleType.Tandem);

        BicycleFromSpec roadBikeFromSpec = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBikeFromSpec1 = new BicycleFromSpec(roadBike1);
        BicycleFromSpec mountainBikeFromSpec = new BicycleFromSpec(mountainBike);
        BicycleFromSpec tandemFromSpec = new BicycleFromSpec(tandem);

        funRide.accept(roadBikeFromSpec);
        funRide.accept(roadBikeFromSpec);
        funRide.accept(roadBikeFromSpec1);
        funRide.accept(roadBikeFromSpec1);
        funRide.accept(roadBikeFromSpec1);
        funRide.accept(mountainBikeFromSpec);
        funRide.accept(mountainBikeFromSpec);
        funRide.accept(tandemFromSpec);
        funRide.accept(tandemFromSpec);

        assertEquals(4, funRide.getEnteredCount());
    }

    @Test
    public void shouldGetEnteredCount() {
        FunRide funRide = new FunRide(3);

        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(BicycleType.Tandem);

        BicycleFromSpec roadBikeFromSpec = new BicycleFromSpec(roadBike);
        BicycleFromSpec mountainBikeFromSpec = new BicycleFromSpec(mountainBike);
        BicycleFromSpec tandemFromSpec = new BicycleFromSpec(tandem);

        funRide.accept(roadBikeFromSpec);
        funRide.accept(mountainBikeFromSpec);
        funRide.accept(tandemFromSpec);

        assertEquals(3, funRide.getEnteredCount());
    }

    @Test
    public void shouldGetCountForType() {
        FunRide funRide = new FunRide(5);

        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification roadBike1 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification roadBike2 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(BicycleType.Tandem);

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

       assertEquals(3, funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test
    public void shouldGetEnteredBikeCount(){
        FunRide funRide = new FunRide(7);

        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification roadBike1 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification roadBike2 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        BicycleSpecification mountainBike1 = new BicycleSpecification(BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(BicycleType.Tandem);
        BicycleSpecification tandem1 = new BicycleSpecification(BicycleType.Tandem);

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

        assertEquals(7, funRide.getEnteredCount());
    }

 }