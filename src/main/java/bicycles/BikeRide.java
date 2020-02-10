package bicycles;

import bicycles.Bicycles;

public class BikeRide {
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

    public int currentSpeed(){
        return speed;
    }

    public void stop(){
        speed = 0;
    }

//    Bicycles bicycles = new Bicycles();
//    bicycles.BikeRide bikeRide = new bicycles.BikeRide(bicycles);


//
//    bikeRide.ride();

//System.out.println(bikeRide.currentSpeed())
}
