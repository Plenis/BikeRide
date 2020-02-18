package bicycles.rides;

import bicycles.specification.Bicycles;

public class BikeRideThree implements BikeRide {
    private Bicycles bicycle;

    public BikeRideThree(Bicycles bicycles) {
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

    }
}
