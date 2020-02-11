package bicycles;

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

    public void rideOne(){
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

    public void rideTwo() {
        this.bicycle.acceleration();
        this.bicycle.brake();
        System.out.println(this.bicycle.currentSpeed());
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

    public int currentSpeed(){
        return bicycle.currentSpeed();
    }

    public void stop(){
        bicycle.stop();
    }

}
