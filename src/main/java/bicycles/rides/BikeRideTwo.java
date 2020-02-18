package bicycles.rides;

import bicycles.specification.Bicycle;

public class BikeRideTwo implements BikeRide {
    private Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycles) {
        this.bicycle = bicycles;
    }

    public void ride() {
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.acceleration();
    }

    public int currentSpeed() {
        return bicycle.currentSpeed();
    }

    public void stop() {
    bicycle.stop();
    }
}
