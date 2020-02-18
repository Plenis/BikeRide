package bicycles.rides;

import bicycles.specification.Bicycle;

public class BikeRideOne implements BikeRide {
    private Bicycle bicycle;

    public BikeRideOne(Bicycle bicycles) {
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
