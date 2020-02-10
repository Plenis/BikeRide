package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainBikeTest {
    @Test
    public void shouldAccelerate() {
        //MountainBike
        MountainBike mountainBike = new MountainBike();
        mountainBike.acceleration();
        mountainBike.acceleration();
        mountainBike.acceleration();
        System.out.println("Current Speed: " + mountainBike.currentSpeed());

        assertEquals(15, mountainBike.currentSpeed());
    }

    @Test
    public void shouldBrakeAndAccelerate(){
        MountainBike mountainBike = new MountainBike();
        mountainBike.acceleration();
        mountainBike.acceleration();
        mountainBike.acceleration();
        mountainBike.brake();
        mountainBike.brake();
        mountainBike.acceleration();
        System.out.println("Current Speed: " + mountainBike.currentSpeed());

        assertEquals(14, mountainBike.currentSpeed());
    }

    @Test
    public void shouldStop(){
        MountainBike mountainBike = new MountainBike();
        mountainBike.acceleration();
        mountainBike.acceleration();
        mountainBike.stop();
        System.out.println("Current Speed: " + mountainBike.currentSpeed());

        assertEquals(0, mountainBike.currentSpeed());
    }
}