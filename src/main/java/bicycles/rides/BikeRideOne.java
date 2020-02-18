package bicycles.rides;

import bicycles.specification.Bicycles;

public class BikeRideOne implements BikeRide {
    private Bicycles bicycle;

    public BikeRideOne(Bicycles bicycles) {
        this.bicycle = bicycles;
    }

    public void ride() {
        this.bicycle.acceleration();
        this.bicycle.acceleration();
        this.bicycle.acceleration();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.acceleration();
    }

    public int currentSpeed(){
        return bicycle.currentSpeed();
    }

    public void stop(){
        bicycle.stop();
    }

}
