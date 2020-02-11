package bicycles;


public class BikeRide implements BikeRideOne, BikeRideTwo {
    private Bicycles bicycle;
    private int speed = 0;

    public BikeRide(Bicycles bicycles) {
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

    public void stop(){
        speed = 0;
    }

}
