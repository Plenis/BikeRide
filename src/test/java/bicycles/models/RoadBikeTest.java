package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadBikeTest {

    @Test
    public void shouldAccelerate() {
        RoadBike roadBike = new RoadBike();
        roadBike.acceleration();
        roadBike.acceleration();
        System.out.println("Current Speed: " + roadBike.currentSpeed());

        assertEquals(22, roadBike.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrake(){
        RoadBike roadBike = new RoadBike();
        roadBike.acceleration();
        roadBike.acceleration();
        roadBike.acceleration();
        roadBike.brake();
        roadBike.brake();
        roadBike.acceleration();
        System.out.println("Current Speed: " + roadBike.currentSpeed());

        assertEquals(36, roadBike.currentSpeed());
    }

    @Test
    public void shouldStop(){
        RoadBike roadBike = new RoadBike();
        roadBike.acceleration();
        roadBike.acceleration();
        roadBike.stop();
        System.out.println("Current Speed: " + roadBike.currentSpeed());

        assertEquals(0, roadBike.currentSpeed());
    }
}