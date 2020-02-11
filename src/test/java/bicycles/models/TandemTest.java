package bicycles.models;

import bicycles.BikeRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TandemTest {
    @Test
    public void shouldAccelerate() {
        Tandem tandem = new Tandem();
        BikeRide bikeRide = new BikeRide(tandem);
        bikeRide.ride();
        System.out.println("Current Speed: " + tandem.currentSpeed());

        assertEquals(34, tandem.currentSpeed());
    }


    @Test
    public void shouldStop(){
        Tandem tandem = new Tandem();
        BikeRide bikeRide = new BikeRide(tandem);
        bikeRide.ride();
        tandem.stop();

        System.out.println("Current Speed: " + tandem.currentSpeed());
        assertEquals(0, tandem.currentSpeed());
    }}