package bicycles.rides;

import bicycles.specification.Bicycle;

public class BikeRideThree implements BikeRide {
    private Bicycle bicycle;

    public BikeRideThree(Bicycle bicycles) {
        this.bicycle = bicycles;
    }

    public void ride() {
            this.bicycle.acceleration();
            this.bicycle.brake();
            this.bicycle.acceleration();
            this.bicycle.brake();
            this.bicycle.acceleration();
            this.bicycle.brake();
            this.bicycle.acceleration();
            this.bicycle.acceleration();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.acceleration();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.brake();
    }

    public int currentSpeed() {
        return bicycle.currentSpeed();
    }

    public void stop() {
    bicycle.stop();
    }
}
